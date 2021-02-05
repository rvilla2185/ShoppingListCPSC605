package com.example.softwareengineeringfinal;

import java.util.List;


public class ItemList {
// Still need name of class that we will be extending
    private List<Item> llist;
    public void main (String args[]){
        Item item = new Item("test");
        llist.add(item);
    }
    public int getItemCount() {
        return llist.size();
    }
    public interface OnItemClickListener{
        void onItemClick(int position);
    }
    public ItemList(List<Item> llist){
        this.llist = llist;
    }

}
