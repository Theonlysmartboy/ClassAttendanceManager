package com.otema.tosby.attendancemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Timetable extends AppCompatActivity implements View.OnClickListener{
    Button load;
    TextView content;
    RequestQueue requestQueue;
    String showUrl = "https://www.allfashioncreations.com/StudentAttendance/get_timetable.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
        load = (Button) findViewById(R.id.load);
        content = (TextView) findViewById(R.id.ContentView);
        requestQueue = Volley.newRequestQueue(getApplicationContext());
        load.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.load:
                JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, showUrl, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray timetable = response.getJSONArray("timetable");
                            for (int i =0; i <= timetable.length();i++){
                                JSONObject lesson = timetable.getJSONObject(i);
                                String day = lesson.getString("DAY");
                                String time = lesson.getString("Time");
                                String unit = lesson.getString("Unit");
                                content.append(day+" "+time+" "+unit+"/n");
                            }
                            content.append("===/n");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        System.out.append(error.getMessage());
                    }
                });
                requestQueue.add(jsonObjectRequest);

                break;
            default:
        }

    }
}
