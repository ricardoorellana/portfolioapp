package com.rorellanam.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.popular_movies);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                message("Popular movies");
            }
        });

        button = (Button) findViewById(R.id.stock_hawnk);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                message("Stock Hawk");
            }
        });

        button = (Button) findViewById(R.id.build_itBigger);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                message("Build it bigger");
            }
        });

        button = (Button) findViewById(R.id.make_yourAppMaterial);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                message("Make your app material");
            }
        });

        button = (Button) findViewById(R.id.go_ubiquitous);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                message("Go ubiquitous");
            }
        });

        button = (Button) findViewById(R.id.capstone);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                message("Capstone");
            }
        });
    }


    public void message(String message) {
        String toastMessage = message;
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(this, toastMessage, duration).show();
    }

}
