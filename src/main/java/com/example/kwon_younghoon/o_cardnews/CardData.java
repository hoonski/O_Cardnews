package com.example.kwon_younghoon.o_cardnews;

/**
 * Created by kwon-younghoon on 2017. 11. 4..
 */
public class CardData {
    private int image;
    private String text;

    public CardData(int image, String text) {
        this.image = image;
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setText(String text) {
        this.text = text;
    }
}

