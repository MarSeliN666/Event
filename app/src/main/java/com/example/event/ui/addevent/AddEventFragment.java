package com.example.event.ui.addevent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.event.R;

public class AddEventFragment extends Fragment {

    private AddEventViewModel addEventViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        addEventViewModel =
                ViewModelProviders.of(this).get(AddEventViewModel.class);
        View root = inflater.inflate(R.layout.fragment_addevent, container, false);

        //final TextView textView = root.findViewById(R.id.text_home);

        addEventViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
        //        textView.setText(s);
            }
        });
        return root;
    }
}