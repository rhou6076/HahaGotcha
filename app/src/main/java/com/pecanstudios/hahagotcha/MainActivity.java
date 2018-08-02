package com.pecanstudios.hahagotcha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView what = findViewById(R.id.LUL);

        what.setText("WHAT IS HTIS???");
    }


}
