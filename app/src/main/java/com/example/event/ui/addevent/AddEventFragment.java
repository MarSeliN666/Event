package com.example.event.ui.addevent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.event.R;

public class AddEventFragment extends Fragment {

    private AddEventViewModel addEventViewModel;
    private Button btnDate;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        addEventViewModel =
                ViewModelProviders.of(this).get(AddEventViewModel.class);
        View v = inflater.inflate(R.layout.fragment_addevent, container, false);

        btnDate = (Button) v.findViewById(R.id.btn_date);


        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnDate.setText("selected");
            }
        });


        return v;
    }


}