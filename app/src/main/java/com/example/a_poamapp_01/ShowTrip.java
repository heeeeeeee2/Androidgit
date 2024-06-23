package com.example.a_poamapp_01;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowTrip extends AppCompatActivity {

    LinearLayout layout;
    TextView title,body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trip);


        layout=(LinearLayout) findViewById(R.id.poemLayout);
        title=(TextView) findViewById(R.id.title);
        body=(TextView)findViewById(R.id.body);


        Resources res =getResources();
        Intent it=getIntent();
        String tag=it.getStringExtra("it_tag");

        int title_id = res.getIdentifier("triptitle"+tag, "string", getPackageName());
        String title_str = res.getString(title_id);
        title.setText(title_str);
        setTitle(title_str);

        int body_id = res.getIdentifier("tripbody"+tag, "string", getPackageName());
        String body_str = res.getString(body_id);
        body.setText(body_str);

    } //onCreate

    public void goBack(View view){
        finish();
    }//goBack

}//class ShowPoem