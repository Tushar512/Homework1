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
        TextView courseTextView = (TextView)findViewById(R.id.courseTextView);
        nameTextView.setText(intent.getStringExtra("name"));
        rollnumTextView.setText(intent.getStringExtra("rollnum"));
        branchTextView.setText(intent.getStringExtra("branch"));
        courseTextView.setText(intent.getStringExtra("course"));
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
