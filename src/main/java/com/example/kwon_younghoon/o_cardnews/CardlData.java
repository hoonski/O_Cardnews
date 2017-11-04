package com.example.kwon_younghoon.o_cardnews;

/**
 * Created by kwon-younghoon on 2017. 11. 4..
 */

public class CardlData {
    String title;
    String text;

    public CardlData(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }
}
