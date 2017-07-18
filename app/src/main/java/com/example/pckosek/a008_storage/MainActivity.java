package com.example.pckosek.a008_storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    /* ------------------------*/
    /*    FILE VERSION 2.0     */
    /* ------------------------*/

    private final static String TAG = "MainActivity";

    private final static String PREFERENCES_FILE = "my_numbers";
    private final static String COUNT_KEY = "count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = MainActivity.this;
        SharedPreferences sharedPref = context.getSharedPreferences(PREFERENCES_FILE,Context.MODE_PRIVATE);

        int defaultInt = 0;
        int numCounts = sharedPref.getInt(COUNT_KEY, defaultInt);
        Log.i(TAG, "NumCounts: "+numCounts);


        numCounts++;

        SharedPreferences.Editor prefsEditor = sharedPref.edit();
        prefsEditor.putInt(COUNT_KEY,numCounts);
        prefsEditor.commit();

    }
}
