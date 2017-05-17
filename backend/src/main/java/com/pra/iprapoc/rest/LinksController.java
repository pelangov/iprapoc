package com.pra.iprapoc.rest;

import com.pra.iprapoc.model.Link;
import com.pra.iprapoc.service.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/links")
public class LinksController {

    @Autowired
    private LinkRepository linkRepository;

    @ResponseBody
    @GetMapping(value = "/leftMenu/html", produces = MediaType.TEXT_HTML_VALUE)
    public String leftMenuHTML() {
        StringBuilder html = new StringBuilder();
        List<Link> mainLinks = linkRepository.leftMenuLinks();
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
            List<Link> subLinks = mLink.getSubLinks();
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
                            List<Link> subSubLinks = sLink.getSubLinks();

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
    @GetMapping(value = "/leftMenu", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Link> leftMenu() {
        return linkRepository.leftMenuLinks();
    }
}
