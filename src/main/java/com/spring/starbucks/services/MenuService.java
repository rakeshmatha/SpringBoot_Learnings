package com.spring.starbucks.services;

import com.spring.starbucks.classes.Menu;
import com.spring.starbucks.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    private List<Menu> menu = new ArrayList<>(Arrays.asList(
            new Menu(1,"Espresso", "Iced Macchiato", "Cream Cheese Muffin", "Cold Brew", "Pumpkin Spice Latte", "Egg Crossaint", "Coffee Cups", 5),
            new Menu(2,"Mocha", "Iced Caramel Coffee", "Apple Crossaint", "Cold Brew", "Pumpkin Spice Latte", "Bacon Cheese Crossaint", "Coffee Cups", 5)));

    public List<Menu> getMenu(){
//        return menu;
        List<Menu> menuItems = new ArrayList<>();
        menuRepository.findAll().forEach(menuItems::add);
        return menuItems;
    }

    public Menu getMenuItem(String id){
        return menu.stream().filter(m->m.getHotDrinks().equals(id)).findFirst().get();
    }

    public void addItem(Menu menuitem) {
//        menu.add(menuitem);
        menuRepository.save(menuitem);
    }

    public void updateItem(Menu updatemenu,String id) {
        for(int i=0; i< menu.size(); i++){
            Menu item = menu.get(i);
            if(item.getHotDrinks().equals(id)){
                menu.set(i, updatemenu);
                return;
            }
        }
    }

    public void deleteItem(String id) {
        menu.removeIf(item -> item.getHotDrinks().equals(id));
    }
}