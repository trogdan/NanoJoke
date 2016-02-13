package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class JokeApiAndroidTest extends AndroidTestCase implements EndpointsAsyncTask.ResultListener{
    public void testJokeExists() {
        CountDownLatch signal = new CountDownLatch(1);
        EndpointsAsyncTask task = new EndpointsAsyncTask(this, signal);
        task.execute();

        /* The testing thread will wait here until the UI thread releases it
         * above with the countDown() or 5 seconds passes and it times out.
         */
        try {
            signal.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertNotNull("Joke exists", mAsyncResult);
    }

    private String mAsyncResult;
    @Override
    public void handleAsyncResult(String result) {
        mAsyncResult = result;
    }
}
