package com.example.event.ui.achievements;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.event.R;

import java.util.List;


public class AchievementsFragment extends Fragment {

    private AchievementsViewModel achievementsViewModel;
    private RecyclerView rv;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        achievementsViewModel = ViewModelProviders.of(this).get(AchievementsViewModel.class);
        View v = inflater.inflate(R.layout.fragment_achievements, container, false);

        rv= v.findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        achievementsViewModel.initializeData();
        initializeAdapter();


        return v;
    }

    private void initializeAdapter(){
        final List<Achievement> achievements = achievementsViewModel.achievements;
        RVAdapter adapter = new RVAdapter(achievements);
        rv.setAdapter(adapter);
    }


}