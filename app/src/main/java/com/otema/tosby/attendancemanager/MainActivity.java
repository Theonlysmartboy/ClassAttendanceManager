package com.otema.tosby.attendancemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.otema.tosby.attendancemanager.LoginActivity;

public class MainActivity extends AppCompatActivity {
TextView greet;
    LoginActivity loginActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          greet = (TextView)findViewById(R.id.greeting);
        loginActivity = new LoginActivity();
        //greet.setText(UserName);
    }
}
