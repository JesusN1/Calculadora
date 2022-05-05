package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Replaceable;
import android.os.Bundle;

import org.mariuszgromada.math.mxparser.*;

import android.widget.Button;
import android.widget.TextView;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Variables

    Expression Ejr;
    TextView tv_1, tv_2;
    Button btn_Delete, btn_Del, btn_P, btn_Div, btn_Por, btn_Rest, btn_Sum, btn_Calc, btn_Punt;
    Button btn_9, btn_8, btn_7, btn_6, btn_5, btn_4, btn_3, btn_2, btn_1, btn_0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //*textview
        tv_1 = (TextView)findViewById(R.id.tv_1);
        tv_2 = (TextView)findViewById(R.id.tv_2);
        //*Borrado
        btn_Delete = (Button)findViewById(R.id.btn_Delete);
        btn_Del = (Button)findViewById(R.id.btn_Del);
        //*btn_Acciones
        btn_P = (Button)findViewById(R.id.btn_P);
        btn_Div = (Button)findViewById(R.id.btn_Div);
        btn_Por = (Button)findViewById(R.id.btn_Por);
        btn_Rest = (Button)findViewById(R.id.btn_Rest);
        btn_Sum = (Button)findViewById(R.id.btn_Sum);
        btn_Calc = (Button)findViewById(R.id.btn_Calc);
        btn_Punt = (Button)findViewById(R.id.btn_Punt);
        //Numeros
        btn_0 = (Button)findViewById(R.id.btn_0);
        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_8 = (Button)findViewById(R.id.btn_8);
        btn_9 = (Button)findViewById(R.id.btn_9);

        btn_Delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_1.setText("");
                tv_2.setText("");
            }
        });
        btn_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_1.setText(tv_1.getText()+"%");
            }
        });
        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_1.setText(tv_1.getText()+"/");
            }
        });
        btn_Por.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_1.setText(tv_1.getText()+"*");
            }
        });
        btn_Rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_1.setText(tv_1.getText()+"-");
            }
        });
        btn_Sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_1.setText(tv_1.getText()+"+");
            }
        });

        btn_Punt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_1.setText(tv_1.getText()+".");
            }
        });

        //*Numeros
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_1.setText(tv_1.getText()+"0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_1.setText(tv_1.getText()+"1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_1.setText(tv_1.getText()+"2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_1.setText(tv_1.getText()+"3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_1.setText(tv_1.getText()+"4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_1.setText(tv_1.getText()+"5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_1.setText(tv_1.getText()+"6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_1.setText(tv_1.getText()+"7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_1.setText(tv_1.getText()+"8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_1.setText(tv_1.getText()+"9");
            }
        });

        btn_Calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ejr = new Expression(tv_1.getText().toString());
                tv_2.setText(String.valueOf(Ejr.calculate()));

            }
        });

    }
}

