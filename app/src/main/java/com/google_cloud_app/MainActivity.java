package com.google_cloud_app;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;

import cloud_controller.EndpointsAsyncTask;
import cloud_controller.GcmRegistrationAsyncTask;
import cloud_controller.ServletPostAsyncTask;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Servlet Call
        new ServletPostAsyncTask().execute(new Pair<Context, String>(this, "Ajay Ramesh"));

        //Endpoint call
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "Ajay Ramesh "));

        //Gcm Registration
        new GcmRegistrationAsyncTask(this).execute();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
