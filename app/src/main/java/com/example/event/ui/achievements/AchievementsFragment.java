package com.example.event.ui.achievements;

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

import java.util.ArrayList;
import java.util.List;

public class AchievementsFragment extends Fragment {

    private AchievementsViewModel achievementsViewModel;
    private RecyclerView achView;
    private ArrayAdapter<String> adapter;

    View v;
    private RecyclerView mRecyclerView;
    private List<Achievement> lstAchievements;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        achievementsViewModel =
                ViewModelProviders.of(this).get(AchievementsViewModel.class);
        View v = inflater.inflate(R.layout.fragment_achievements, container, false);
        achView = v.findViewById(R.id.ach_view);

        AchievementAdapter achievementAdapter = new AchievementAdapter (getContext(), lstAchievements);
        achView.setLayoutManager(new LinearLayoutManager(getActivity()));
        achView.setAdapter(achievementAdapter);

        achievementsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                // textView.setText(s);

            }
        });

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstAchievements = new ArrayList<>();
        lstAchievements.add(new Achievement(R.drawable.ic_menu_send, "Achivochka", "Description"));
        lstAchievements.add(new Achievement(R.drawable.ic_menu_camera, "Achivochka2", "Description2"));
        lstAchievements.add(new Achievement(R.drawable.ic_menu_gallery, "Achivochka3", "Description3"));
    }
}