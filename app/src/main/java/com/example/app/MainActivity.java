package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView games, google_map;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity2(); }
        });

        games = (CardView) findViewById(R.id.games);
        games.setOnClickListener(this);

        google_map = (CardView)  findViewById(R.id.google_map);
        google_map.setOnClickListener(this);
    }
    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
    @Override
    public void onClick(View view) {
        Intent i;

        if (view.getId() == R.id.games) {
            i = new Intent(this, Games.class);
            startActivity(i);
        } else if (view.getId() == R.id.google_map) {
            i = new Intent(this, GoogleMap.class);
            startActivity(i);
        }

    }
}
