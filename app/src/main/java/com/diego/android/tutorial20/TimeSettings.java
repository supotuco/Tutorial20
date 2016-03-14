package com.diego.android.tutorial20;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import android.widget.Toast;

/**
 * Created by Diego on 3/13/16.
 */
public class TimeSettings implements TimePickerDialog.OnTimeSetListener {
    Context context;

    public TimeSettings(Context context){
        this.context = context;
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Toast.makeText(context, "Selected time is hour :" + hourOfDay + " minute :" + minute, Toast.LENGTH_SHORT).show();
    }
}
