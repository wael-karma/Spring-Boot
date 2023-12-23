package com.project.springboot.controller;

import com.project.springboot.service.ItemService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController    //click on alt + enter to bring the import line automatically
@RequestMapping("/market")  //any API url should be prefixed with market word in order to work
public class ItemController {

    @Autowired   // dependency injection
    private ItemService ItemService;    // bean
    @GetMapping("/print-name") //http get request
    public String printItemName(){
        return ItemService.printName("wael karma");
    }
}
