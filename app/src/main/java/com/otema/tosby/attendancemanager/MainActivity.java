package com.otema.tosby.attendancemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView greet;
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
        
          greet = (TextView)findViewById(R.id.greeting);
        loginActivity = new LoginActivity();
        //greet.setText(UserName);
    }
}
