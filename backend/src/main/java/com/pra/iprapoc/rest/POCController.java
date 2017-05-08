package com.pra.iprapoc.rest;

import java.util.ArrayList;
import java.util.List;

import com.pra.iprapoc.model.Record;
import com.pra.iprapoc.service.POCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class POCController {

    @Autowired
    private POCRepository repository;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value="/test/get/json", method=RequestMethod.GET, produces="application/json")
    public @ResponseBody List<Record> testGetJson() {
        ArrayList<Record> records = new ArrayList<>();
        records.add(new Record());
        return records;
        //return this.repository.findAll();
    }
}
