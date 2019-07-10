package com.example.app_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    private  Button nine,eight,seven,six,five,four,three,two,one,minus,mul,div,zero,add,equal,clear;
    private TextView result,info;
    private final char addition = '+';
    private final char substraction = '-';
    private final char multiplication = '*';
    private final char division = '/';
    private final char equ = '=';
    private double val1= Double.NaN;
    private double val2;
    private char action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIviews();

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                info.setText(info.getText().toString()+"9");

            }


        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                info.setText(info.getText().toString()+"8");

            }


        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                info.setText(info.getText().toString()+"7");

            }


        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                info.setText(info.getText().toString()+"6");

            }


        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                info.setText(info.getText().toString()+"5");

            }


        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                info.setText(info.getText().toString()+"4");

            }


        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                info.setText(info.getText().toString()+"3");

            }


        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                info.setText(info.getText().toString()+"2");

            }


        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                info.setText(info.getText().toString()+"1");

            }


        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                info.setText(info.getText().toString()+"0");

            }


        });




        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=addition;
                result.setText(String.valueOf(val1)+"+");
                info.setText(null);

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=substraction;
                result.setText(String.valueOf(val1)+"-");
                info.setText(null);

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=multiplication;
                result.setText(String.valueOf(val1)+"*");
                info.setText(null);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=division;
                result.setText(String.valueOf(val1)+"/");
                info.setText(null);

            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=equ;
                result.setText(result.getText().toString()+String.valueOf(val2)+"="+String.valueOf(val1));
                info.setText(null);

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(info.getText().length() >0)
                {
                    CharSequence name=info.getText().toString();
                    info.setText(name.subSequence(0,name.length()-1));

                }
                else
                {
                    val1=Double.NaN;
                    val2=Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });




    }


        private void setupUIviews()
        {
            nine = (Button)findViewById(R.id.b9);
            eight = (Button)findViewById(R.id.b8);
            seven = (Button)findViewById(R.id.b7);
            six = (Button)findViewById(R.id.b6);
            five = (Button)findViewById(R.id.b5);
            four = (Button)findViewById(R.id.b4);
            three = (Button)findViewById(R.id.b3);
            two = (Button)findViewById(R.id.b2);
            one = (Button)findViewById(R.id.b1);
            zero = (Button)findViewById(R.id.b0);
            minus = (Button)findViewById(R.id.bminus);
            mul = (Button)findViewById(R.id.bmul);
            div = (Button)findViewById(R.id.bdiv);
            add = (Button)findViewById(R.id.badd);
            equal = (Button)findViewById(R.id.bequal);
            clear = (Button)findViewById(R.id.bclear);
            info = (TextView)findViewById(R.id.info);
            result = (TextView) findViewById(R.id.result);


        }

        private void compute()
        {
            if(!Double.isNaN(val1))
            {
                val2=Double.parseDouble(info.getText().toString());
                switch (action)
                {
                    case addition:
                        val1=val1+val2;
                        break;

                    case substraction:
                        val1=val1-val2;
                        break;

                    case multiplication:
                        val1=val1*val2;
                        break;

                    case division:
                        val1=val1/val2;
                        break;

                    case equ:
                        break;

                }

            }
            else
            {
                val1=Double.parseDouble(info.getText().toString());
            }
        }



}
