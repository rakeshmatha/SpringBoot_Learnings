package com.spring.starbucks.controllers;

import com.spring.starbucks.classes.Menu;
import com.spring.starbucks.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//@EnableAutoConfiguration
@RestController()
public class menuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/menu")
    public List<Menu> getMenu() {
        return menuService.getMenu();
    }

    @RequestMapping("/menu/{id}")
    public Menu getMenu(@PathVariable String id){
        return menuService.getMenuItem(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/menu")
    public void addItem(@RequestBody Menu menu){
        menuService.addItem(menu);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/menu/{id}")
    public void updateItem(@RequestBody Menu updatemenu,@PathVariable String id){
        menuService.updateItem(updatemenu,id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/menu/{id}")
    public void deleteItem(String id){
        menuService.deleteItem(id);
    }
}