package com.example.shadowtext;

import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class SearchFriend extends AppCompatActivity {

    protected Menu detailMenu;
    protected int personIndex;
    protected final String TAG = "Detail Screen";

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.friend_screen_menu, menu);
        detailMenu = menu;
        menu.findItem(R.id.select_done).setVisible(true);
        menu.findItem(R.id.leave_done).setVisible(false);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.select_done) {

        } else if (item.getItemId() == R.id.leave_done) {

        }
        return super.onOptionsItemSelected(item);
    }

}
