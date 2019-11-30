package com.example.event.ui.achievements;

import android.app.AlertDialog;
import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;

import com.example.event.R;

import java.util.ArrayList;
import java.util.List;


public class AchievementsViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    public List<Person> persons;


    public AchievementsViewModel() {

    }

    public void initializeData(){
        persons = new ArrayList<>();

        persons.add(new Person("Emma Wilson", "23 years old", R.mipmap.ic_buddha_round));
        persons.add(new Person("Lavery Maiss", "25 years old", R.mipmap.ic_buddha_round));
        persons.add(new Person("Lillie Watts", "35 years old", R.mipmap.ic_buddha_round));

    }


}