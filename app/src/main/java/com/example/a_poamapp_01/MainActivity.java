package com.example.a_poamapp_01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//oncreate

    public void ShowPoem(View view){
        int id= view.getId();
        LinearLayout layout=(LinearLayout) findViewById(id);
        String tag = (String) layout.getTag();

        Intent it = new Intent(this, ShowPoem.class);
        it.putExtra("it_tag",tag);

        startActivity(it);
    }

    public void ShowTrip(View view){
        int id= view.getId();
        ImageView imageView=(ImageView) findViewById(id);
        String tag = (String) imageView.getTag();

        Intent it = new Intent(this, ShowTrip.class);
        it.putExtra("it_tag",tag);

        startActivity(it);
    }
}//closs Mainactivity