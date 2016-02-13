package com.projectxanadu.displaybean;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class Zachtivity extends ActionBarActivity {

    public static final String JOKE_KEY = "Jokey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zachtivity);
    }
}
