package com.ravebiz.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final String TAG2 = "MainActivity";
    private static final String TAG3 = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "I'm an info log!");
        Log.w(TAG2, "I'm a warning log!");
        Log.v(TAG3, "I'm a very verbose log");

        String assignment = getString(R.string.assignment);

    }
}
