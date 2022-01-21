package com.company.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Menu {

    private LocalDate dateUpdated;
    private ArrayList<MenuItem> menu = new ArrayList<>();

    public static void printMenu(LocalDate date, ArrayList<MenuItem> list){

        System.out.println("\nMenu Updated: " + date);
        for (MenuItem item : list){
            System.out.println("\n*** " + item.getName() + " ***");
            if(item.isNew()){System.out.println("NEW");}
            System.out.println("Category: " + item.getCategory() +
                    "\nDescription: " + item.getDescription() +
                    "\nPrice: $" + item.getPrice());
        }
        
    }

    public static void updateMenu(LocalDate date, ArrayList<MenuItem> list, MenuItem newMenuItem){

        for(MenuItem item : list){
            item.setNew(false);
        }

        list.add(newMenuItem);
        date = LocalDate.now();

    }

    public void addItem(MenuItem item){
        for(MenuItem food : menu){
            if(food.equals(item)){
                System.out.println("That item already exist on the menu.");
                return;
            }
        }
        menu.add(item);
    }

    public void removeItem(MenuItem item){
        menu.remove(item);
    }

}
