package com.example.event.ui.achievements;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.event.R;

public class CardViewActivity extends Activity {

    TextView personName;
    TextView personAge;
    ImageView personPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.item_achievement);
        personName = (TextView)findViewById(R.id.name);
        personAge = (TextView)findViewById(R.id.description);
        personPhoto = (ImageView)findViewById(R.id.photo);
    }
}
