package com.example.event.ui.achievements;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.event.R;

import java.util.List;

public class AchievementAdapter extends RecyclerView.Adapter<AchievementAdapter.MyViewHolder> {

    Context mContext;
    List<Achievement> mData;

    public AchievementAdapter(Context mContext, List<Achievement> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_achievement, parent , false);
        MyViewHolder vHolder = new MyViewHolder(v);


        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imgAchievement.setImageResource(mData.get(position).getIcon());
        holder.tvName.setText(mData.get(position).getName());
        holder.tvDescription.setText(mData.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName;
        private TextView tvDescription;
        private ImageView imgAchievement;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = (TextView) itemView.findViewById(R.id.ach_name);
            tvDescription = (TextView) itemView.findViewById(R.id.ach_description);
            imgAchievement = (ImageView) itemView.findViewById(R.id.ach_img);

        }
    }


}
