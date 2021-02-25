package com.example.softwareengineeringfinal;

import java.util.LinkedList;
import java.util.List;

//Used for testing Item object
public class ItemList {
    public static void main(String[] args){
        List<Item> items = new LinkedList<Item>();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        items.add(item1);
        items.add(item2);
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getItem();

        }
    }
}
