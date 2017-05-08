package com.pra.iprapoc.rest;

import java.util.List;

import com.pra.iprapoc.model.Record;
import com.pra.iprapoc.service.POCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/poc")
public class POCController {

    @Autowired
    private POCRepository repository;

    @ResponseBody
    @GetMapping(value = "/get/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Record> testGetJson() {
        return this.repository.findAll();
    }
}
