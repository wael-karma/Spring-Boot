package com.project.springboot.service;

import com.project.springboot.model.ItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemModel itemModel;

    public String printName(String name){
        String n = itemModel.getItemFromDatabase();
        return n.toUpperCase() + " xyz";
    }
}
