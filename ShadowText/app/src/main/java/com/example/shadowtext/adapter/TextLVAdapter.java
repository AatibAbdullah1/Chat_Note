package com.example.shadowtext.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.shadowtext.R;
import com.example.shadowtext.mainpageActivity;

public class TextLVAdapter extends BaseAdapter {


    @Override
    public int getCount()
    {return 0;}

    @Override
    public Object getItem(int i){return i;}

    @Override
    public long getItemId(int i){return i;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        View row_view;

        if (view == null) {
            // cnt++;
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            row_view = inflater.inflate(R.layout.text_row, viewGroup, false);
        } else row_view = view;

        TextView firstNameView = (TextView) row_view.findViewById(R.id.user_name);
        row_view.setTag(new Integer(i));
        TextView lastNameView = (TextView) row_view.findViewById(R.id.chat_text_ID);

        return row_view;
    }





}
/*
*
*
*   Text LV Adapter may not be used
*
*
*
* */