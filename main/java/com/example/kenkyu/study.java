package com.example.kenkyu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;
import android.widget.TextView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;

public class study extends AppCompatActivity {
    TextView kanji;
    TextView meaning;
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);
        kanji = (TextView) findViewById(R.id.kanji);
        meaning = (TextView) findViewById(R.id.meaning);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}