package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import android.media.MediaPlayer;
import android.view.Menu;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    private Toolbar toolbar;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu,menu);
    return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar) findViewById(R.id.myToolBar);
        txt = (TextView) findViewById(R.id.app);
        b1 = (Button) findViewById(R.id.Red);
        b2 = (Button) findViewById(R.id.Black);
        b3 = (Button) findViewById(R.id.Pink);
        b4 = (Button) findViewById(R.id.Purple);
        b5 = (Button) findViewById(R.id.Blue);
        b6 = (Button) findViewById(R.id.Green);
        b7= (Button) findViewById(R.id.Yellow);
        b8  = (Button) findViewById(R.id.Grey);
        b9= (Button) findViewById(R.id.Brown);
        b10  = (Button) findViewById(R.id.Orange);
        setSupportActionBar(toolbar);


}}