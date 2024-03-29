package com.example.event.ui.myevents;

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

public class MyEventsFragment extends Fragment {

    private MyEventsViewModel myEventsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        myEventsViewModel =
                ViewModelProviders.of(this).get(MyEventsViewModel.class);
        View root = inflater.inflate(R.layout.card_myevent, container, false);

        return root;
    }
}