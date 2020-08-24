package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pressButton =(Button) findViewById(R.id.pressButton);

        final ImageView amswerImg=(ImageView) findViewById(R.id.answerImg);

        final int[] ballArray = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        pressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                int number= randomNumberGenerator.nextInt(5);

                Log.d("8-Ball","The random no. is: "+ number);

                amswerImg.setImageResource(ballArray[number]);
            }
        });
    }
}
