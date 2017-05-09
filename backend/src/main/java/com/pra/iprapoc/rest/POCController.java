package com.pra.iprapoc.rest;

import com.pra.iprapoc.model.Category;
import com.pra.iprapoc.model.Link;
import com.pra.iprapoc.model.Page;
import com.pra.iprapoc.service.CategoryRepository;
import com.pra.iprapoc.service.LinkRepository;
import com.pra.iprapoc.service.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
    @GetMapping(value = "/category/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Category> categoryGetJson() {
        return categoryRepository.findAll();
    }

    @ResponseBody
    @GetMapping(value = "/link/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Link> linkGetJson() {
        return linkRepository.findAll();
    }

    @ResponseBody
    @GetMapping(value = "/page/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Page> pageGetJson() {
        return pageRepository.findAll();
    }
}
