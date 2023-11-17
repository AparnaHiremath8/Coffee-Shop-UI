package com.example.coffeeshop;

import java.io.Serializable;

public class Drinks implements Serializable {



        private String title;
        private String description;
        private int imageResourceId;
        private double fee;
        private String vol;

        public Drinks(String title, String description, int imageResourceId, double fee, String volume) {
            this.title = title;
            this.description = description;
            this.imageResourceId = imageResourceId;
            this.fee = fee;
            this.vol = vol;
        }

        // other methods and getters/setters


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public double getFee() {
        return fee;
    }

    public String getVol(){
        return vol;
    }
}

