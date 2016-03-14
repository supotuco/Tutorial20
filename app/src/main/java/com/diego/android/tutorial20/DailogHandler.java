package com.diego.android.tutorial20;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;

import java.util.Calendar;

/**
 * Created by Diego on 3/13/16.
 */
public class DailogHandler extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        TimePickerDialog dialog;
        TimeSettings timeSettings = new TimeSettings(getActivity());

        dialog = new TimePickerDialog(getActivity(), timeSettings, hour, minute, DateFormat.is24HourFormat(getActivity()));
        return dialog;

    }
}
