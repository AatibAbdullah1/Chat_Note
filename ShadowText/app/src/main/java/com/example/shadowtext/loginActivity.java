package com.example.shadowtext;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.*;



public class loginActivity extends Activity {
    public static final String Authen = "com.example.shadowtextfront.Authen";
    public static final String Buthen = "com.exmaple.shadowtextfront.Buthen";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_detail);

        Button aatibsbutton = (Button)findViewById(R.id.login2);

        aatibsbutton.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View V){
                        /**/

                        openMainpage();


                    }
                }
        );

    }

    public void openMainpage(){

        EditText user = (EditText)findViewById(R.id.user_name_val_id);
        EditText pass = (EditText)findViewById(R.id.pass_word_val_id);

        String username = user.toString();
        String password = pass.toString();

        Intent intent = new Intent(this,mainpageActivity.class);



        startActivity(intent);



    }


}
