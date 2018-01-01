package com.example.salah.timepicker3;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

       EditText time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        time = (EditText)findViewById(R.id.time);
        time.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar currentTime = Calendar.getInstance();
                int hour = currentTime.get(Calendar.HOUR_OF_DAY);
                int minute = currentTime.get(Calendar.MINUTE);
                TimePickerDialog TimePicker;
                TimePicker = new TimePickerDialog( MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(android.widget.TimePicker timePicker, int seletedHour, int selectedMinute) {
                      time.setText(seletedHour + " : " + selectedMinute );
                        Toast.makeText( getApplicationContext(), seletedHour +"  hour  " + selectedMinute + "  minute  " ,Toast.LENGTH_SHORT).show();
                    }
                }, hour, minute, true);
                TimePicker.setTitle("     "  +   " Select Time " );


                TimePicker.show();
            }
        } );
    }
}

