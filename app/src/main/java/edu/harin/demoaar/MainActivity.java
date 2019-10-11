package edu.harin.demoaar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import edu.harin.libone.LibOneUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LibOneUtils.addition(1,2);
    }
}
