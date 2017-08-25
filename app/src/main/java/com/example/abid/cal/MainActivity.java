package com.example.abid.cal;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final double[] n1 = new double[1];
        final double[] n2 = new double[1];
        final char[] op = new char[1];
        final Button zero = (Button) findViewById(R.id.zero);
        final Button one = (Button) findViewById(R.id.one);
        final Button two = (Button) findViewById(R.id.two);
        final Button three = (Button) findViewById(R.id.three);
        final Button four = (Button) findViewById(R.id.four);
        final Button five = (Button) findViewById(R.id.five);
        final Button six = (Button) findViewById(R.id.six);
        final Button seven = (Button) findViewById(R.id.seven);
        final Button eight = (Button) findViewById(R.id.eight);
        final Button nine = (Button) findViewById(R.id.nine);
        final Button dot = (Button) findViewById(R.id.dot);
        Button add = (Button) findViewById(R.id.add);
        Button sub = (Button) findViewById(R.id.sub);
        Button mul = (Button) findViewById(R.id.mul);
        Button div = (Button) findViewById(R.id.div);
        Button equal = (Button) findViewById(R.id.equal);
        Button back = (Button) findViewById(R.id.back);
        Button clear = (Button) findViewById(R.id.clear);
        final TextView tv = (TextView) findViewById(R.id.textView);

        zero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.append("0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.append("1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.append("2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.append("3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.append("4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.append("5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.append("6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.append("7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.append("8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.append("9");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.append("9");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.append(".");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                n1[0] = Double.parseDouble(tv.getText().toString());
                tv.setText("");
                op[0] = '+';
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                n1[0] = Double.parseDouble(tv.getText().toString());
                tv.setText("");
                op[0] = '-';
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                n1[0] = Double.parseDouble(tv.getText().toString());
                tv.setText("");
                op[0] = '*';
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                n1[0] = Double.parseDouble(tv.getText().toString());
                tv.setText("");
                op[0] = '/';
            }
        });

        equal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                n2[0] = Double.parseDouble(tv.getText().toString());
                double n3 = 0;
                if (op[0] == '+')
                {
                    n3 = n1[0] + n2[0];
                    tv.setText(""+n3);
                }
                else if (op[0] == '-')
                {
                    n3 = n1[0] - n2[0];
                    tv.setText(""+n3);
                }
                else if (op[0] == '*')
                {
                    n3 = n1[0] * n2[0];
                    tv.setText(""+n3);
                }
                else if (op[0] == '/')
                {
                    if(n2[0] ==0)
                    {
                        tv.setText("Error");
                    }
                    else
                    {
                        n3 = n1[0] / n2[0];
                        tv.setText(""+n3);
                    }
                };
            }
        });

        clear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                tv.setText("");
                n1[0] = 0;
                n2[0] = 0;
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NumberEntered = tv.getText().toString();
                NumberEntered = NumberEntered.substring(0, NumberEntered.length() - 1);
                tv.setText(NumberEntered);
            }
        });
    }
}

