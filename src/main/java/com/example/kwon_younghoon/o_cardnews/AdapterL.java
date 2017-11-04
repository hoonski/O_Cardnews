package com.example.kwon_younghoon.o_cardnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kwon-younghoon on 2017. 11. 4..
 */

public class AdapterL extends BaseAdapter {
    private ArrayList<CardlData> arrayList= new ArrayList<CardlData>();
    Context context;

    public AdapterL(ArrayList<CardlData> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        if(view==null) {
            view = inflater.inflate(R.layout.lnews, null);
        }
        TextView i1 = (TextView) view.findViewById(R.id.title);
        TextView t1 = (TextView)view.findViewById(R.id.txt);
        CardlData one;
        one = arrayList.get(i);
        i1.setText(one.getTitle());
        t1.setText(one.getText());
        return view;
    }
}