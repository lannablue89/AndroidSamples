package com.lanna.android.samples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tvHi = (TextView) findViewById(R.id.tvHi);
        final EditText etInput = (EditText) findViewById(R.id.etInput);
        findViewById(R.id.btnClickMe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                tvHi.setVisibility(tvHi.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
                tvHi.setText(etInput.getText());
            }
        });
    }
}
