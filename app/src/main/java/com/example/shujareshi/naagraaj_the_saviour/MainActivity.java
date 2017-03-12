package com.example.shujareshi.naagraaj_the_saviour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.VideoView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    Button b ;
    Animation fade_in , fade_out ;
    ViewFlipper vf ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button)findViewById(R.id.button);

        vf  = (ViewFlipper)findViewById(R.id.vflip);

        AnimationFactory.flipTransition(viewFlipper, FlipDirection.LEFT_RIGHT);

        /*fade_in = AnimationUtils.loadAnimation(this , android.R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this , android.R.anim.fade_out);

        vf.setInAnimation(fade_in);
        vf.setOutAnimation(fade_out);

        vf.setAutoStart(true);

        vf.setFlipInterval(2500);

        vf.startFlipping();*/

        b.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  i = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);
            }
        }));
    }
}

