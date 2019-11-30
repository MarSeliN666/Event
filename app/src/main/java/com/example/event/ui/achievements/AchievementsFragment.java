package com.example.event.ui.achievements;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.event.R;

import java.util.List;


public class AchievementsFragment extends Fragment {

    private AchievementsViewModel achievementsViewModel;
    private List<AchievementsViewModel.Achievements> achievement;
    private RecyclerView rv;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        achievementsViewModel = ViewModelProviders.of(this).get(AchievementsViewModel.class);
        View v = inflater.inflate(R.layout.fragment_achievements, container, false);

        rv = v.findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        LinearLayoutManager llm;
        llm = new LinearLayoutManager(getContext(rv));
        rv.setLayoutManager(llm);


        achievementsViewModel.initializeData();
        initializeAdapter();


//        achievementsViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//
//
//            }
//        });

        return v;
    }

    private Context getContext(RecyclerView rv) {
        return null;
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(achievement);
        rv.setAdapter(adapter);
    }

}