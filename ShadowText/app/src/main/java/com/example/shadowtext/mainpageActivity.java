package com.example.shadowtext;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.*;

import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.graphics.drawable.shapes.RectShape;
import android.widget.TextView;
import android.view.ViewGroup;

import com.example.shadowtext.R;

public class mainpageActivity extends MainActivity{


    protected Menu detailMenu;
    protected int personIndex;
    protected final String TAG = "Detail Screen";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.friend_page);

        Button aatibsbutton = (Button)findViewById(R.id.login2);

        aatibsbutton.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View V){
                        /**/

                        openTextor();


                    }
                }
        );

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.friend_screen_menu, menu);
        detailMenu = menu;
        menu.findItem(R.id.action_edit).setVisible(true);
        menu.findItem(R.id.action_done).setVisible(false);
        menu.findItem(R.id.leaving_finished).setVisible(false);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_edit) {

        } else if (item.getItemId() == R.id.action_done) {

        }
        else if(item.getItemId() == R.id.leaving_finished)
        {

        }
        return super.onOptionsItemSelected(item);
    }

public void openTextor()
{
    Intent intent = new Intent(this,TextLVActivity.class);

    startActivity(intent);

}


}

