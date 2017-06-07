package com.otema.tosby.attendancemanager;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//TextView greet;
    Button Timetable,Profile,Attendance;
    LoginActivity loginActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button refferences
        Timetable= (Button)findViewById(R.id.Timetable_btn);
        Profile=(Button)findViewById(R.id.prophile_button);
        Attendance=(Button)findViewById(R.id.attendance_btn);
        Timetable.setOnClickListener(this);
        Profile.setOnClickListener(this);
        Attendance.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
switch (view.getId()){
    case R.id.Timetable_btn:
        Intent timetable = new Intent(getApplicationContext(),Timetable.class);
        startActivity(timetable);
        finish();
        break;
    case R.id.prophile_button:
        Intent prophile = new Intent(getApplicationContext(),MyProfile.class);
        startActivity(prophile);
        finish();
        break;
    case R.id.attendance_btn:
        Intent attendance = new Intent(getApplicationContext(),Attendance.class);
        startActivity(attendance);
        finish();
        break;
    default:
}
    }
}
