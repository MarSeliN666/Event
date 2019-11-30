package com.example.event.ui.achievements;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.event.R;

public class CardViewActivity extends Activity {

    TextView achievementTitle;
    TextView achievementDescription;
    ImageView achievementIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.card_achievement);
        achievementTitle = (TextView)findViewById(R.id.achievement_titile);
        achievementDescription = (TextView)findViewById(R.id.achievement_description);
        achievementIcon = (ImageView)findViewById(R.id.achievement_icon);
    }
}
