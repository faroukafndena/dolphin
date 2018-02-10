package com.example.jennifer1.dolphincatalogue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {



    ImageView logo;
    ImageView dol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo=(ImageView)findViewById(R.id.dol_img);
        dol=(ImageView)findViewById(R.id.main_logo);
        Animation mytrans= AnimationUtils.loadAnimation(this,R.anim.mytransaction);
        logo.startAnimation(mytrans);
        dol.startAnimation(mytrans);
        final Intent i= new Intent(this,appmain.class);

        Thread timer = new Thread () {

            public  void  run () {

                try {


                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {

                    startActivity(i);
                    finish();
                }


            }


        };

        timer.start();


    }
}

