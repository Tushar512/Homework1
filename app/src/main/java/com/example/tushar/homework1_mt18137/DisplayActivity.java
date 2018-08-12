package com.example.tushar.homework1_mt18137;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent = getIntent();
        TextView nameTextView = (TextView)findViewById(R.id.nameTextView);
        TextView rollnumTextView = (TextView)findViewById(R.id.rollnumTextView);
        TextView branchTextView = (TextView)findViewById(R.id.branchTextView);
        TextView course1TextView = (TextView)findViewById(R.id.course1TextView);
        TextView course2TextView = (TextView)findViewById(R.id.course2TextView);
        TextView course3TextView = (TextView)findViewById(R.id.course3TextView);
        TextView course4TextView = (TextView)findViewById(R.id.course4TextView);
        nameTextView.setText(intent.getStringExtra("name"));
        rollnumTextView.setText(intent.getStringExtra("rollnum"));
        branchTextView.setText(intent.getStringExtra("branch"));
        course1TextView.setText(intent.getStringExtra("course1"));
        course2TextView.setText(intent.getStringExtra("course2"));
        course3TextView.setText(intent.getStringExtra("course3"));
        course4TextView.setText(intent.getStringExtra("course4"));
    }
    @Override
    protected void onStart() {
        super.onStart();
        String msg = "State of activity DisplayActivity changed from Created to Started";
        Log.i("Info", msg);
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        String msg = "State of activity DisplayActivity changed from Started to Resumed";
        Log.i("Info", msg);
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        String msg = "State of activity DisplayActivity changed from Resumed to Paused";
        Log.i("Info", msg);
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        String msg = "State of activity DisplayActivity changed from Paused to Stopped";
        Log.i("Info", msg);
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        String msg = "State of activity DisplayActivity changed from Stopped to Destroyed";
        Log.i("Info", msg);
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }
}
