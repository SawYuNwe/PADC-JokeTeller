package com.exercisejoke.sawyunwe297.jokeexercise.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.exercisejoke.sawyunwe297.jokeexercise.R;
import com.exercisejoke.sawyunwe297.jokeexercise.fragments.FirstJokeFragment;
import com.exercisejoke.sawyunwe297.jokeexercise.fragments.SecondJokeFragment;
import com.exercisejoke.sawyunwe297.jokeexercise.fragments.ThirdJokeFragment;

public class MainActivity extends AppCompatActivity {

private static int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnNext=(Button)findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count==0 || count==1)
                {
                    count++;

                        if(count==1)
                        {
                            SecondJokeFragment layout=new SecondJokeFragment();
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.fl_container,layout)
                                    .commit();
                        }
                        else if(count==2)
                        {
                            ThirdJokeFragment layout=new ThirdJokeFragment();
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.fl_container,layout)
                                    .commit();
                        }


                }
                else
                {
                    Toast.makeText(MainActivity.this,"ေနာက္ထပ္ျပရန္ မရွိေတာ့ပါ",Toast.LENGTH_SHORT).show();
                }




            }
        });

        Button btnPrevious=(Button)findViewById(R.id.btn_previous);
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count==1 || count==2)
                {

                        count--;
                        if(count==1)
                        {
                            SecondJokeFragment layout=new SecondJokeFragment();
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.fl_container,layout)
                                    .commit();
                        }

                        else if(count==0)
                        {
                            FirstJokeFragment layout=new FirstJokeFragment();
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.fl_container,layout)
                                    .commit();

                        }


                }
                else
                {
                    Toast.makeText(MainActivity.this,"ဟာသမ်ားမရွိေတာ့ပါ",Toast.LENGTH_SHORT).show();
                }



            }
        });




        if(savedInstanceState==null)
        {
            FirstJokeFragment layout=new FirstJokeFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fl_container,layout)
                    .commit();

        }


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
