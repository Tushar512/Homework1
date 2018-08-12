package com.example.tushar.homework1_mt18137;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText, rollnumEditText, branchEditText, course1EditText, course2EditText, course3EditText, course4EditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = (EditText)findViewById(R.id.nameEditText);
        rollnumEditText = (EditText)findViewById(R.id.rollnumEditText);
        branchEditText = (EditText)findViewById(R.id.branchEditText);
        course1EditText = (EditText)findViewById(R.id.course1EditText);
        course2EditText = (EditText)findViewById(R.id.course2EditText);
        course3EditText = (EditText)findViewById(R.id.course3EditText);
        course4EditText = (EditText)findViewById(R.id.course4EditText);
    }
    @Override
    protected void onStart() {
        super.onStart();
        String msg = "State of activity MainActivity changed from Created to Started";
        Log.i("Info", msg);
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        String msg = "State of activity MainActivity changed from Started to Resumed";
        Log.i("Info", msg);
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        String msg = "State of activity MainActivity changed from Resumed to Paused";
        Log.i("Info", msg);
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        String msg = "State of activity MainActivity changed from Paused to Stopped";
        Log.i("Info", msg);
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        String msg = "State of activity MainActivity changed from Stopped to Destroyed";
        Log.i("Info", msg);
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }
    public void clearForm(View view) {
        nameEditText.setText("");
        rollnumEditText.setText("");
        branchEditText.setText("");
        course1EditText.setText("");
        course2EditText.setText("");
        course3EditText.setText("");
        course4EditText.setText("");
    }
    public void submitForm(View view) {
        String name = nameEditText.getText().toString();
        String rollnum = rollnumEditText.getText().toString();
        String branch = branchEditText.getText().toString();
        String course1 = course1EditText.getText().toString();
        String course2 = course2EditText.getText().toString();
        String course3 = course3EditText.getText().toString();
        String course4 = course4EditText.getText().toString();
        if(name.equals(""))
            Toast.makeText(getApplicationContext(), "Please enter name", Toast.LENGTH_LONG).show();
        else if(rollnum.equals(""))
            Toast.makeText(getApplicationContext(), "Please enter roll no.", Toast.LENGTH_LONG).show();
        else if(branch.equals(""))
            Toast.makeText(getApplicationContext(), "Please enter branch", Toast.LENGTH_LONG).show();
        else if(course1.equals(""))
            Toast.makeText(getApplicationContext(), "Please enter course1", Toast.LENGTH_LONG).show();
        else if(course2.equals(""))
            Toast.makeText(getApplicationContext(), "Please enter course2", Toast.LENGTH_LONG).show();
        else if(course3.equals(""))
            Toast.makeText(getApplicationContext(), "Please enter course3", Toast.LENGTH_LONG).show();
        else if(course4.equals(""))
            Toast.makeText(getApplicationContext(), "Please enter course4", Toast.LENGTH_LONG).show();
        else {
            Intent intent = new Intent(getApplicationContext(), DisplayActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("rollnum", rollnum);
            intent.putExtra("branch", branch);
            intent.putExtra("course1", course1);
            intent.putExtra("course2", course2);
            intent.putExtra("course3", course3);
            intent.putExtra("course4", course4);
            startActivity(intent);
        }
    }
}
