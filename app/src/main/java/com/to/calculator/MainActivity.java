package com.to.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView solutaion,result;
    MaterialButton buttonc,buttonopenbra,buttonclosebra,buttondiv,button7,buttono8,button9,buttonmulti,
            button4,buttono5,button6,buttonadd,button1,buttono2,button3,buttonneg,buttonAC,buttono0,buttondot,buttonequal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {

    }
}