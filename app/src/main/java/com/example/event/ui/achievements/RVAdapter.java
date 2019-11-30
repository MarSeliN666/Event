package com.example.event.ui.achievements;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.event.R;

import java.util.List;

public  class RVAdapter extends RecyclerView.Adapter<RVAdapter.AchievementViewHolder>{

    public static class AchievementViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView name;
        TextView description;
        ImageView photoId;
        AchievementViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            name = (TextView)itemView.findViewById(R.id.name);
            description = (TextView)itemView.findViewById(R.id.description);
            photoId = (ImageView)itemView.findViewById(R.id.photo);
        }
    }

    List<AchievementsViewModel.Achievements> achievement;
    RVAdapter(List<AchievementsViewModel.Achievements> persons){
        this.achievement = achievement;
    }

    @Override
    public AchievementViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.item_achievement, viewGroup, false);
        AchievementViewHolder achievementViewHolder = new AchievementViewHolder(v);
        return achievementViewHolder;
    }

    @Override
    public void onBindViewHolder(AchievementViewHolder personViewHolder, int i) {
        personViewHolder.name.setText(achievement.get(i).name);
        personViewHolder.description.setText(achievement.get(i).descroption);
        personViewHolder.photoId.setImageResource(achievement.get(i).photoId);
    }


    @Override
    public int getItemCount() {
        return 12;
    }
}