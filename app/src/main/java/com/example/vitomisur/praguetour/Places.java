package com.example.vitomisur.praguetour;

// container for data about the places
public class Places {

    private int pNameID;
    private int pInfoID;
    private int pWebID;
    private int pMapID;
    private int pLogoImageID;

    // method to input the data about the place
    public Places(int name, int info, int imageID,int web, int map) {
        pNameID = name;
        pInfoID = info;
        pLogoImageID = imageID;
        pMapID = map;
        pWebID = web;
    }

    // methods to return the data -||-
    public int getName() {
        return pNameID;
    }
    public int getInfo() {
        return pInfoID;
    }
    public int getMap() {
        return pMapID;
    }
    public int getWeb() {
        return pWebID;
    }

    public int getLogoImage() {
        return pLogoImageID;
    }

}