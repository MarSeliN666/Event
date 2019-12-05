package com.example.event.ui.history;

import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.event.R;

import java.util.Calendar;
import java.util.Locale;

import ru.slybeaver.slycalendarview.SlyCalendarDialog;

import static java.util.Locale.*;


public class HistoryFragment extends Fragment{

    private HistoryViewModel historyViewModel;
    private SlyCalendarDialog.Callback listener;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        historyViewModel =
                ViewModelProviders.of(this).get(HistoryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_history, container, false);

//        new SlyCalendarDialog()
//                .setSingle(false)
//                .setCallback(listener)
//                .show(getFragmentManager(), "TAG_SLYCALENDAR");

        return root;
    }

//    public void onCancelled() {
//        //Nothing
//    }
//
//    public void onDataSelected(Calendar firstDate, Calendar secondDate, int hours, int minutes) {
//        if (firstDate != null) {
//            if (secondDate == null) {
//                firstDate.set(Calendar.HOUR_OF_DAY, hours);
//                firstDate.set(Calendar.MINUTE, minutes);
//            }
//        }
//    }

}
