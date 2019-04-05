package com.lambdaschool.sprint2_challenge;

import java.io.Serializable;
import java.util.ArrayList;

public class ItemsList implements Serializable {
    private ArrayList<Item> alitemList=new ArrayList<Item>(100);
    private Item itemCurrent;

    public ItemsList(ArrayList<Item> alitemList) {

        this.alitemList = alitemList;
        itemCurrent=alitemList.get(alitemList.size()-1 );
    }
    public ArrayList<Item> toArrayList(){
        return alitemList;
    }

    public Item getCurrentItem(){
            return itemCurrent;
    }

    public ItemsList(Item item) {

        this.alitemList.add( item);
        itemCurrent=item;
    }
    public Item get(int iIndex){
        return alitemList.get( iIndex );
    }

    public ItemsList(String strID){

    }
    public void add(Item item){
        alitemList.add( item );
        return;
    }
    public Item getInitialItem(){
        return alitemList.get( 0 );

    }
    public Item getNextItem(int iIndex){
        return alitemList.get( iIndex+1 );
    }

    public String getStringAllIndex(){

        String strAllIndex="";
        for(int i=0;i<size();i++){
            strAllIndex+= alitemList.get( i ).getiID();
            if(i!=size()-1)strAllIndex+=",";
        }

        return strAllIndex;
    }
    public int size(){
        return alitemList.size();
    }


}
