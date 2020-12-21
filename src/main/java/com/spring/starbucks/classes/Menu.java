package com.spring.starbucks.classes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {
    @Id
    private int id;
    private String hotDrinks;
    private String coldDrinks;
    private String desserts;
    private String favourites;
    private String seasonFavourites;
    private String breakfastItems;
    private String miscItems;
    private float price;

    public Menu() {
    }

    public Menu(int id,String hotDrinks, String coldDrinks, String desserts, String favourites, String seasonFavourites, String breakfastItems, String miscItems, float price) {
        super();
        this.id =id;
        this.hotDrinks = hotDrinks;
        this.coldDrinks = coldDrinks;
        this.desserts = desserts;
        this.favourites = favourites;
        this.seasonFavourites = seasonFavourites;
        this.breakfastItems = breakfastItems;
        this.miscItems = miscItems;
        this.price = price;
    }

    public int getId(){return id;}

    public String getHotDrinks() {
        return hotDrinks;
    }

    public String getColdDrinks() {
        return coldDrinks;
    }

    public String getDesserts() {
        return desserts;
    }

    public String getFavourites() {
        return favourites;
    }

    public String getSeasonFavourites() {
        return seasonFavourites;
    }

    public String getBreakfastItems() {
        return breakfastItems;
    }

    public String getMiscItems() {
        return miscItems;
    }

    public float getPrice() {
        return price;
    }
}
