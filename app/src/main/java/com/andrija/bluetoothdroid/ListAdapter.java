package com.andrija.bluetoothdroid;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    private ArrayList<ListItem> arrayList;
    private Context c;


    public ListAdapter(Context c, ArrayList<ListItem> arrayList) {
        this.arrayList = arrayList;
        this.c = c;
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
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ListItem currentItem = arrayList.get(i);

        if(currentItem.getType().equals(Constants.PWM_ENABLED)){
            //TODO
        }
        else if(currentItem.getType().equals(Constants.PWM_DISABLED)){
            //TODO
        }
        return null;
    }
}
