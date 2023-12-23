package com.project.springboot.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ItemModel {

    List<String> names = new ArrayList<>();
    ItemModel(){    // constructor
        names.add("wael");
        names.add("mezen");
        names.add("karma");
    }
    public String getItemFromDatabase(){
        return names.get(0);
    }
}
