package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.projectxanadu.displaybean.Zachtivity;

public class MainActivity extends ActionBarActivity implements EndpointsAsyncTask.ResultListener{

    private ProgressBar mSpinner;

    @Override
    public void handleAsyncResult(String result) {
        mSpinner.setVisibility(View.GONE);

        Intent intent = new Intent(this, Zachtivity.class);
        intent.putExtra(Zachtivity.JOKE_KEY, result);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mSpinner = (ProgressBar)findViewById(R.id.progress_bar);
        mSpinner.setVisibility(View.GONE);


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

    public void tellJoke()
    {
        tellJoke(null);
    }

    public void tellJoke(View view) {
        mSpinner.setVisibility(View.VISIBLE);

        EndpointsAsyncTask task = new EndpointsAsyncTask(this);
        task.execute();
    }



}
