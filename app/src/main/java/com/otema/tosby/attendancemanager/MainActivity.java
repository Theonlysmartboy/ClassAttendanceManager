package com.otema.tosby.attendancemanager;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
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


    }
    public void ViewTimetable(View V){
final Dialog Timetabledialog = new Dialog(MainActivity.this);
        Timetabledialog.setContentView(R.layout.activity_timetable);
        Timetabledialog.setTitle("Timetable");
        Timetabledialog.setCancelable(true);
        Timetabledialog.show();
    }
    public void SubmitAttendance(View V){
        final Dialog Attendancedialog = new Dialog(MainActivity.this);
        Attendancedialog.setContentView(R.layout.activity_attendance);
        Attendancedialog.setTitle("Submit Attendance");
        Attendancedialog.setCancelable(true);
        Attendancedialog.show();
    }
}
