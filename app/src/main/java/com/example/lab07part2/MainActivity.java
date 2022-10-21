package com.example.lab07part2;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvNews,tvMusic,tvAccount,tvMSV;
    ImageView ivLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNews = findViewById(R.id.tvNews);
        tvMusic = findViewById(R.id.tvMusic);
        tvAccount = findViewById(R.id.tvAccount);
        tvMSV = findViewById(R.id.tvMSV);
        ivLogo = findViewById(R.id.ivLogo);
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.news);
        tvNews.startAnimation(animation);
        Animation animation1 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.music);
        tvMusic.startAnimation(animation1);
        Animation animation2 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.account);
        tvAccount.startAnimation(animation2);
        Animation animation3 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.msv);
        tvMSV.startAnimation(animation3);
        Animation animation4 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.logo);
        ivLogo.startAnimation(animation4);
    }
}