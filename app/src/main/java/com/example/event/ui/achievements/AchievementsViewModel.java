package com.example.event.ui.achievements;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.event.R;

import java.util.ArrayList;
import java.util.List;


public class AchievementsViewModel extends ViewModel {

    //private MutableLiveData<String> mText;
    public List<Achievement> achievements;


    public AchievementsViewModel() {

    }

    public void initializeData(){
        achievements = new ArrayList<>();

        achievements.add(new Achievement
                ("Have fun!", "Make 1st Event", R.mipmap.ic_buddha_round));
        achievements.add(new Achievement
                ("Little Party", "Make an event for 4 people", R.mipmap.ic_buddha_round));
        achievements.add(new Achievement
                ("Ruff (be careful)", "Take vodka beer 1:1", R.mipmap.ic_buddha_round));

    }


}