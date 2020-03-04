package com.example.simpledisplay;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView w;
    TextView h;
    TextView fr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");

        w = findViewById(R.id.widthText);
        h = findViewById(R.id.heightText);
        fr = findViewById(R.id.frameText);

        loadInfo();
    }

    public void loadInfo()
    {
        Display display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();

        Point displaySize = new Point();
        display.getSize(displaySize);

        w.setText(String.valueOf(displaySize.x));
        h.setText(String.valueOf(displaySize.y));

        float refreshRate = display.getRefreshRate();
        fr.setText(String.valueOf(refreshRate));
    }
}
