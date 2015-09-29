package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onClick_btn_spotify(View view)
    {
        showToast("This button will launch the spotify streamer app!");
    }

    public void onClick_btn_scores(View view)
    {
        showToast("This button will launch the scores app!");
    }

    public void onClick_btn_library(View view)
    {
        showToast("This button will launch the library app!");
    }

    public void onClick_btn_buildItBigger(View view)
    {
        showToast("This button will launch the build it bigger app!");
    }

    public void onClick_btn_xyz(View view)
    {
        showToast("This button will launch the xyz reader app!");
    }

    public void onClick_btn_capstone(View view)
    {
        showToast("This button will launch my capstone app!");
    }

    public void showToast(String message)
    {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
