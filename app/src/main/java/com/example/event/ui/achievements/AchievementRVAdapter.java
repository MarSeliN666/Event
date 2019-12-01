package com.example.event.ui.achievements;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.event.R;

import java.util.List;

public class AchievementRVAdapter extends RecyclerView.Adapter<AchievementRVAdapter.AchevementViewHolder> {

    public static class AchevementViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView achievementTitle;
        TextView achievementDescription;
        ImageView achievenemtIcon;

        AchevementViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card_product);
            achievementTitle = (TextView)itemView.findViewById(R.id.product_titile);
            achievementDescription = (TextView)itemView.findViewById(R.id.product_description);
            achievenemtIcon = (ImageView)itemView.findViewById(R.id.achievement_icon);
        }
    }

    List<Achievement> achievement;
    AchievementRVAdapter(List<Achievement> achievements){
        this.achievement = achievements;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public AchevementViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.card_achievement, viewGroup, false);
        AchevementViewHolder pvh = new AchevementViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(AchevementViewHolder achevementViewHolder, int i) {
        achevementViewHolder.achievementTitle.setText(achievement.get(i).name);
        achevementViewHolder.achievementDescription.setText(achievement.get(i).description);
        achevementViewHolder.achievenemtIcon.setImageResource(achievement.get(i).photoId);
    }

    @Override
    public int getItemCount() {
        return achievement.size();
    }
}
