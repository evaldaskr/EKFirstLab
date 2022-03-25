package com.example.ekfirstlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
    }
    public void OnBtnClick(View view) {
        this.tvMain.setText(R.string.changed_label_caption);
    }
    public void OnBtn2dClick (View view) {

    }
    public void OnBtn2ndClick(View view) {
        tvMain.setTextColor(getResources().getColor(R.color.my_color));
    }
}