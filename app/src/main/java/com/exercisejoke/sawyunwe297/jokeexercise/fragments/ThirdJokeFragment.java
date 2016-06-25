package com.exercisejoke.sawyunwe297.jokeexercise.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.exercisejoke.sawyunwe297.jokeexercise.R;

/**
 * Created by Saw Yu Nwe on 6/24/2016.
 */
public class ThirdJokeFragment extends Fragment {
    public ThirdJokeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_thirdjoke,container,false);
    }
}
