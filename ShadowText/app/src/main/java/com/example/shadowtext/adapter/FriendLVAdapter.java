package com.example.shadowtext.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.shadowtext.R;
import com.example.shadowtext.mainpageActivity;

public class FriendLVAdapter extends BaseAdapter {



    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    // @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row_view;

        if (view == null) {
            // cnt++;
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            row_view = inflater.inflate(R.layout.friend_row, viewGroup, false);
        } else row_view = view;

        TextView firstNameView = (TextView) row_view.findViewById(R.id.user_name);
        row_view.setTag(new Integer(i));


        row_view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(view.getContext(), mainpageActivity.class);
                        view.getContext().startActivity(intent);

                    }
                }
        );

        return row_view;
    }

}

