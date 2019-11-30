package com.example.event.ui.achievements;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.event.R;

import java.util.ArrayList;
import java.util.List;

public class AchievementsViewModel extends ViewModel {
//
//    private MutableLiveData<String> mText;
//
//    public AchievementsViewModel() {
//        mText = new MutableLiveData<>();
//        mText.setValue("Achievements");
//
//    }

    class Achievements {

        String name;
        String descroption;
        int photoId;

        Achievements(String name, String description, int photoId) {
            this.name = name;
            this.descroption = description;
            this.photoId = photoId;
        }

    }

    public List<Achievements> achievements;

    // This method creates an ArrayList that has three Achievements objects

    public void initializeData() {

        achievements = new ArrayList<>();

        achievements.add(new Achievements
                ("Emma Wilson", "23 years old", R.drawable.ic_launcher_foreground));
        achievements.add(new Achievements
                ("Lavery Maiss", "25 years old", R.drawable.ic_launcher_foreground));
        achievements.add(new Achievements
                ("Lillie Watts", "35 years old", R.drawable.ic_launcher_foreground));
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(achievements);
        //rv.setAdapter(adapter);
    }

//    public LiveData<String> getText() {
//        return mText;
//    }
}