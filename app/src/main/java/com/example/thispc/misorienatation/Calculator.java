package com.example.thispc.misorienatation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    public void cal(View v) {
        try {
            EditText et1 = (EditText) findViewById(R.id.et1);
            EditText et2 = (EditText) findViewById(R.id.et2);
            EditText et3 = (EditText) findViewById(R.id.et3);
            EditText et4 = (EditText) findViewById(R.id.et4);
            EditText et5 = (EditText) findViewById(R.id.et5);
            EditText et6 = (EditText) findViewById(R.id.et6);
            TextView tv1 = (TextView) findViewById(R.id.t1);
            TextView tv2 = (TextView) findViewById(R.id.t2);
            TextView tv3 = (TextView) findViewById(R.id.t3);
            TextView tv4 = (TextView) findViewById(R.id.t4);
            TextView tv5 = (TextView) findViewById(R.id.t5);
            TextView tv6 = (TextView) findViewById(R.id.t6);
            TextView tv7 = (TextView) findViewById(R.id.t7);
            TextView tv8 = (TextView) findViewById(R.id.t8);
            TextView tv9 = (TextView) findViewById(R.id.t9);
            TextView tv10 = (TextView) findViewById(R.id.t10);
            TextView tv11 = (TextView) findViewById(R.id.t11);
            TextView tv12 = (TextView) findViewById(R.id.t12);
            TextView tv13 = (TextView) findViewById(R.id.t13);


            double p1 = Math.toRadians(Double.parseDouble(et1.getText().toString()));
            double h1 = Math.toRadians(Double.parseDouble(et2.getText().toString()));
            double b1 = Math.toRadians(Double.parseDouble(et3.getText().toString()));
            double p2 = Math.toRadians(Double.parseDouble(et4.getText().toString()));
            double h2 = Math.toRadians(Double.parseDouble(et5.getText().toString()));
            double b2 = Math.toRadians(Double.parseDouble(et6.getText().toString()));

            double r1x[][] = new double[3][3];
            double r1y[][] = new double[3][3];
            double r1z[][] = new double[3][3];
            double r2x[][] = new double[3][3];
            double r2y[][] = new double[3][3];
            double r2z[][] = new double[3][3];
            double a1[][] = new double[3][3];
            double a2[][] = new double[3][3];
            //double m[][] = new double[3][3];
            double o1[][] = new double[3][3];
            double o2[][] = new double[3][3];
            double o3[][] = new double[3][3];
            double o4[][] = new double[3][3];
            double fin[][]= new double[3][3];
            int i, j, k;double s = 0;
            r1x[2][2] = 1;
            r2x[2][2] = 1;
            r1x[2][0] = 0;
            r2x[2][0] = 0;
            r1x[0][2] = 0;
            r2x[0][2] = 0;
            r1x[2][1] = 0;
            r2x[2][1] = 0;
            r1x[1][2] = 0;
            r2x[1][2] = 0;
            r1x[0][0] = Math.cos(p1);
            r2x[0][0] = Math.cos(p2);
            r1x[1][1] = Math.cos(p1);
            r2x[1][1] = Math.cos(p2);
            r1x[1][0] = Math.sin(p1);
            r2x[1][0] = Math.sin(p2);
            r1x[0][1] = -1 * (Math.sin(p1));
            r2x[0][1] = -1 * (Math.sin(p2));
            r1y[0][0] = 1;
            r2y[0][0] = 1;
            r1y[1][0] = 0;
            r2y[1][0] = 0;
            r1y[2][0] = 0;
            r2y[2][0] = 0;
            r1y[0][1] = 0;
            r2y[0][1] = 0;
            r1y[0][2] = 0;
            r2y[0][2] = 0;
            r1y[1][1] = Math.cos(h1);
            r2y[1][1] = Math.cos(h2);
            r1y[2][2] = Math.cos(h1);
            r2y[2][2] = Math.cos(h2);
            r1y[2][1] = Math.sin(h1);
            r2y[2][1] = Math.sin(h2);
            r1y[1][2] = -1 * (Math.sin(h1));
            r2y[1][2] = -1 * (Math.sin(h2));
            r1z[2][2] = 1;
            r2z[2][2] = 1;
            r1z[2][0] = 0;
            r2z[2][0] = 0;
            r1z[0][2] = 0;
            r2z[0][2] = 0;
            r1z[2][1] = 0;
            r2z[2][1] = 0;
            r1z[1][2] = 0;
            r2z[1][2] = 0;
            r1z[0][0] = Math.cos(b1);
            r2z[0][0] = Math.cos(b2);
            r1z[1][1] = Math.cos(b1);
            r2z[1][1] = Math.cos(b2);
            r1z[1][0] = Math.sin(b1);
            r2z[1][0] = Math.sin(b2);
            r1z[0][1] = -1 * (Math.sin(b1));
            r2z[0][1] = -1 * (Math.sin(b2));
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    for (k = 0; k < 3; k++) {
                        a1[i][j] += r1x[i][k] * r1y[k][j];
                        a2[i][j] += r2x[i][k] * r2y[k][j];
                    }
                }
            }

            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    for (k = 0; k < 3; k++) {
                        o1[i][j] += a1[i][k] * r1z[k][j];
                        o2[i][j] += a2[i][k] * r2z[k][j];
                    }
                }
            }
            o3[0][0] = o1[1][1] * o1[2][2] - o1[2][1] * o1[1][2];
            o3[0][1] = -(o1[1][0] * o1[2][2] - o1[2][0] * o1[1][2]);
            o3[0][2] = o1[1][0] * o1[2][1] - o1[2][0] * o1[1][1];
            o3[1][0] = -(o1[0][1] * o1[2][2] - o1[2][1] * o1[0][2]);
            o3[1][1] = o1[0][0] * o1[2][2] - o1[2][0] * o1[0][2];
            o3[1][2] = -(o1[0][0] * o1[2][1] - o1[2][0] * o1[0][1]);
            o3[2][0] = o1[0][1] * o1[1][2] - o1[1][1] * o1[0][2];
            o3[2][1] = -(o1[0][0] * o1[1][2] - o1[1][0] * o1[0][2]);
            o3[2][2] = o1[0][0] * o1[1][1] - o1[1][0] * o1[0][1];


            double mode = Math.abs(o1[0][0] * o3[0][0] + o1[0][1] * o3[0][1] + o1[0][2] * o3[0][2]);

            for (i = 0; i < 3; i++) {

                for (j = 0; j < 3; j++) {


                    o4[i][j] = o3[j][i]/mode;

                }
            }



            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    for (k = 0; k < 3; k++) {
                        fin[i][j] += o4[i][k] * o2[k][j];
                    }

                }
            }

            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    if (Math.abs(fin[i][j])<Math.pow(10,-3))
                    {
                        fin[i][j]=0;
                    }
                    if (fin[i][j]>0.99)
                    {
                        fin[i][j]=1;
                    }
                }
            }
            
            double c1 = (fin [0][0] + fin [1][1] + fin [2][2] - 1) / 2;
            double c2 = Math.sqrt(1 - Math.pow(c1, 2));
            double r1 = (fin [1][2] - fin [2][1]) / (2 * c2);
            double r2 = (fin [2][0] - fin [0][2]) / (2 * c2);
            double r3 = (fin [0][1] - fin [1][0]) / (2 * c2);


            tv1.setText((fin[0][0]) + " ");
            tv2.setText((fin[0][1]) + " ");
            tv3.setText((fin[0][2]) + " ");
            tv4.setText((fin[1][0]) + " ");
            tv5.setText((fin[1][1]) + " ");
            tv6.setText((fin[1][2]) + " ");
            tv7.setText((fin[2][0]) + " ");
            tv8.setText((fin[2][1]) + " ");
            tv9.setText((fin[2][2]) + " ");

            tv10.setText(c1 + " ");
            tv11.setText(r1 + " ");
            tv12.setText(r2 + " ");
            tv13.setText(r3 + " ");
        }catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);



    }

}
