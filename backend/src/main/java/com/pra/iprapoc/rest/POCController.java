package com.pra.iprapoc.rest;

import com.pra.iprapoc.model.Category;
import com.pra.iprapoc.model.Link;
import com.pra.iprapoc.model.Page;
import com.pra.iprapoc.service.CategoryRepository;
import com.pra.iprapoc.service.LinkRepository;
import com.pra.iprapoc.service.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class POCController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private LinkRepository linkRepository;

    @Autowired
    private PageRepository pageRepository;

    @ResponseBody
    @GetMapping(value = "/category", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @ResponseBody
    @GetMapping(value = "/link", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Link> getLinks() {
        return linkRepository.findAll();
    }

    @ResponseBody
    @GetMapping(value = "/page", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Page> pageGet() {
        return pageRepository.findAll();
    }

    @ResponseBody
    @GetMapping(value = "/leftMenuLinks/html", produces = MediaType.TEXT_HTML_VALUE)
    public String leftMenuLinks() {
        StringBuilder html = new StringBuilder();
        List<Link> mainLinks = linkRepository.findByRecordTypeNameOrderByWeightAscNameAsc("Main Menu Item");
        for (Link mLink : mainLinks) {
            if (mLink.getName().equals("Dashboard")) {
                html.append("\n<li><a href=\"").append(mLink.getLink()).append("\"><i class=\"").append(mLink.getCssClass()).append("\"></i>").append(mLink.getName()).append("</a>");
                html.append("\n<li><a href=\"#\"><i class=\"pra-iconctr-gear\"></i>Custom Link</a>");
            } else if (!StringUtils.isEmpty(mLink.getLink())) {
                String tabloc;
                if (mLink.getLink().contains("/apex/IPA_") || mLink.getLink().equals("#")) {
                    tabloc = "";
                } else {
                    tabloc = "_blank";
                }
                html.append("\n<li><a href=\"").append(mLink.getLink()).append("\" target=\"").append(tabloc).append("\"><i class=\"").append(mLink.getCssClass()).append("\"></i>").append(mLink.getName()).append("</a>");
            }

            //If Sub Menus
            List<Link> subLinks = linkRepository.findByRecordTypeNameAndParentLinkSfIdOrderByWeightAscNameAsc("Sub Menu Item", mLink.getSfId());
            if (!subLinks.isEmpty() || mLink.getName().equals("Dashboard") || mLink.getName().equals("Applications")) {
                if (subLinks.size() < 5)
                    html.append("\n\t<ul class=\"submenu\">");
                else if (subLinks.size() < 10)
                    html.append("\n\t<ul class=\"submenu\" style=\"top:-150%\">");
                else if (subLinks.size() < 15)
                    html.append("\n\t<ul class=\"submenu\" style=\"top:-300%\">");
                else
                    html.append("\n\t<ul class=\"submenu\" style=\"top:-500%\">");

                for (Link sLink : subLinks) {
                    if (!StringUtils.isEmpty(sLink.getLink())) {
                        String tabloc;
                        if (sLink.getLink().contains("/apex/IPA_") || sLink.getLink().equals("#")) {
                            tabloc = "";
                        } else {
                            tabloc = "_blank";
                        }
                        html.append("\n\t\t<li><a href=\"").append(sLink.getLink()).append("\" target=\"").append(tabloc).append("\">").append(sLink.getName()).append("</a>");

                        if (sLink.getNoOfSubSubMenus() != null && sLink.getNoOfSubSubMenus() > 0) {
                            //If Sub Sub Menus
                            List<Link> subSubLinks = linkRepository.findByRecordTypeNameAndParentLinkSfIdOrderByWeightAscNameAsc("Sub-Sub Menu Item", sLink.getSfId());

                            if (!subSubLinks.isEmpty() || sLink.getName().equals("Dashboard")) ;
                            {
                                if (subSubLinks.size() < 5)
                                    html.append("\n\t\t<ul class=\"subsubmenu\">");
                                else if (subSubLinks.size() < 10)
                                    html.append("\n\t\t<ul class=\"subsubmenu\" style=\"top:-150%\">");
                                else
                                    html.append("\n\t\t<ul class=\"subsubmenu\" style=\"top:-500%\">");

                                for (Link ssLink : subSubLinks) {
                                    if (!StringUtils.isEmpty(ssLink.getLink())) {
                                        if (ssLink.getLink().contains("/apex/IPA_") || ssLink.getLink().equals("#")) {
                                            tabloc = "";
                                        } else {
                                            tabloc = "_blank";
                                        }
                                        html.append("\n\t\t<li><a href=\"").append(ssLink.getLink()).append("\" target=\"").append(tabloc).append("\">").append(ssLink.getName()).append("</a></li>");
                                    }
                                }
                                html.append("\n\t\t</ul>");
                            }
                        }
                        html.append("\n\t\t</li>");
                    }
                }

                html.append("\n\t</ul>");
            }
            html.append("\n</li>");
        }

        return html.toString();
    }

    @ResponseBody
    @GetMapping(value = "/leftMenuLinks/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Link> mainMenuItems() {
        return linkRepository.findByRecordTypeNameOrderByWeightAscNameAsc("Main Menu Item");
    }
}
