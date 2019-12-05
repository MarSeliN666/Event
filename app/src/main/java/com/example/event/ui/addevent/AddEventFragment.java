package com.example.event.ui.addevent;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;

import com.example.event.R;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.zip.DataFormatException;

import ru.slybeaver.slycalendarview.SlyCalendarDialog;

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
            private SlyCalendarDialog.Callback listener;

            @Override
            public void onClick(View v) {

                new SlyCalendarDialog()
                        .setSingle(false)
                        .setCallback(listener)
                        .show(getFragmentManager(), "TAG_SLYCALENDAR");

            }



        });
        return v;
    }
    public void onCancelled() {
        //Nothing
    }

    public void onDataSelected(Calendar firstDate, Calendar secondDate, int hours, int minutes) {
        if (firstDate != null) {
            if (secondDate == null) {
                firstDate.set(Calendar.HOUR_OF_DAY, hours);
                firstDate.set(Calendar.MINUTE, minutes);
            }
        }

    }
}