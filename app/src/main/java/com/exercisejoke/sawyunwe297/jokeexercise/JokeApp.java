package com.exercisejoke.sawyunwe297.jokeexercise;

import android.app.Application;
import android.content.Context;

/**
 * Created by Saw Yu Nwe on 6/24/2016.
 */
public class JokeApp extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
