package com.application.drumbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// import
import android.media.AudioManager;
import android.media.SoundPool;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    // SoundPool
    SoundPool soundf;

    // Button
    Button btn1 , btn2, btn3, btn4;

    // use to load soundpool
    int t1,t2,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundf = new SoundPool(1,AudioManager.STREAM_MUSIC,0);

        t1 = soundf.load(this,R.raw.sound11, 1);
        t2 = soundf.load(this,R.raw.sound22, 1);
        t3 = soundf.load(this,R.raw.sound33, 1);
        t4 = soundf.load(this,R.raw.sound44, 1);

        btn1 = (Button)findViewById(R.id.b1);
        btn2 = (Button)findViewById(R.id.b2);
        btn3 = (Button)findViewById(R.id.b3);
        btn4 = (Button)findViewById(R.id.b4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundf.play(t1, 1, 1, 0, 0, 1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                soundf.play(t2, 1, 1, 0, 0, 1);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                soundf.play(t3, 1, 1, 0, 0, 1);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                soundf.play(t4, 1, 1, 0, 0, 1);

            }
        });



    }
}