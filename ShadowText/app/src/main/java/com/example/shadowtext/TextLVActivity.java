package com.example.shadowtext;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.shadowtext.adapter.FriendLVAdapter;

public class TextLVActivity extends Activity {

    protected ListView mSummaryView;
    protected final String TAG = "Summary Screen";
    protected FriendLVAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate() called");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.text_listview);

        mSummaryView = findViewById(R.id.list_view_id);
        ad = new FriendLVAdapter();
        mSummaryView.setAdapter(ad);
    }
}
