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

public class ShowPoem extends AppCompatActivity {

    LinearLayout layout;
    TextView title,author,body;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem);

        layout=(LinearLayout) findViewById(R.id.poemLayout);
        title=(TextView) findViewById(R.id.title);
        author=(TextView) findViewById(R.id.author);
        body=(TextView) findViewById(R.id.body);
        img=(ImageView) findViewById(R.id.img);

        Resources res =getResources();

        Intent it=getIntent();
        String tag=it.getStringExtra("it_tag");

        int img_id = res.getIdentifier("img"+tag,"string",getPackageName());
        String img_str = res.getString(img_id);

        int img_drawebleid=
                res.getIdentifier(img_str,"drawable",getPackageName());

        Drawable drawable = getDrawable(img_drawebleid);
        img.setBackground(drawable);


        int title_id = res.getIdentifier("title"+tag, "string", getPackageName());
        String title_str = res.getString(title_id);
        title.setText(title_str);

        int author_id = res.getIdentifier("author"+tag, "string", getPackageName());
        String author_str = res.getString(author_id);
        author.setText(author_str);

        int body_id = res.getIdentifier("body"+tag, "string", getPackageName());
        String body_str = res.getString(body_id);
        body.setText(body_str);

    } //onCreate

    public void goBack(View view){
        finish();
    }//goBack

}//class ShowPoem