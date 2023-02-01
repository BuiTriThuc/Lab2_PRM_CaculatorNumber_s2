package com.example.lab_2_s2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText txtso1;
EditText txtso2;
Button cong;
Button tru;
Button nhan;
Button chia;
TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int so1 = Integer.parseInt( txtso1.getText().toString());
                int so2 = Integer.parseInt(  txtso2.getText().toString());
                int number = so1 + so2;
                result.setText(String.valueOf(number));
            }
        });

        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = txtso1.getText().toString();
                String chuoi2 = txtso2.getText().toString();
                int so1 = Integer.parseInt(chuoi1);
                int so2 = Integer.parseInt(chuoi2);
                int number = so1 - so2;
                result.setText(String.valueOf(number));
            }
        });

        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = txtso1.getText().toString();
                String chuoi2 = txtso2.getText().toString();
                int so1 = Integer.parseInt(chuoi1);
                int so2 = Integer.parseInt(chuoi2);
                int number = so1 * so2;
                result.setText(String.valueOf(number));
            }
        });

        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = txtso1.getText().toString();
                String chuoi2 = txtso2.getText().toString();
                int so1 = Integer.parseInt(chuoi1);
                int so2 = Integer.parseInt(chuoi2);
       if(so2 != 0) {
           int number = so1 / so2;
           result.setText(String.valueOf(number));
       }
            }
        });
    }
    private  void Anhxa() {
        txtso1 = (EditText) findViewById(R.id.so1);
        txtso2 = (EditText) findViewById(R.id.so2);
        cong = (Button) findViewById(R.id.cong);
        tru = (Button) findViewById(R.id.tru);
        nhan = (Button) findViewById(R.id.nhan);
        chia = (Button) findViewById(R.id.chia);
        result = (TextView) findViewById(R.id.ketqua);
    }
}
