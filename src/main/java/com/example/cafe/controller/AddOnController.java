package com.example.cafe.controller;

import com.example.cafe.model.AddOn;
import com.example.cafe.service.AddOnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(path = "/api/addon")
public class AddOnController {

    private final AddOnService addOnService;
    @Autowired
    public AddOnController(AddOnService addOnService){
        this.addOnService =addOnService;
    }

    @PostMapping(path = "/addAddOn")
    public void createAddOn(@RequestBody AddOn addOn, @RequestParam List<Integer> itemIds) {
         addOnService.saveAddOn(addOn,itemIds);
    }





}
