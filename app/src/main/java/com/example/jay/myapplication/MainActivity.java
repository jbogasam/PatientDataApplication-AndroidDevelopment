package com.example.jay.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.Random;


public class MainActivity extends AppCompatActivity {




    float[] values = new float[] { 500.0f,1098.5f, 500.5f, 700.0f , 1500.0f, 300.0f, 1800.7f,1700.2f };
    float[] values1 = new float[] { 700.0f,1542.7f, 375.5f, 1600.4f , 150.0f, 1300.0f, 800.7f,1400.2f };
    float[] values2 = new float[] { 1500.0f,198.5f, 1400.5f, 400.0f , 1200.0f, 914.0f, 320.7f,1900.2f };
    float[] values3 = new float[] { 150.0f,1981.5f, 400.5f, 4001.0f , 100.0f, 1914.0f, 1320.7f,510.2f };
    float[] values4 = new float[] { 1520.0f,1218.5f, 580.5f, 1400.0f , 210.0f, 954.0f, 1320.7f,390.2f };
    String[] verlabels = new String[] { "500", "1000", "1500" };
    String[] horlabels = new String[] { "2700", "2750",  "2800", "2850", "2900" };
    GraphView graphView = null;
    GraphView graphView1 = null;
    GraphView graphView2 = null;
    GraphView graphView3 = null;
    GraphView graphView4 = null;
    LinearLayout rel = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        graphView = new GraphView(this, values, "Patient Data",horlabels, verlabels, GraphView.LINE);
        graphView1 = new GraphView(this, values1, "Patient Data",horlabels, verlabels, GraphView.LINE);
        graphView2 = new GraphView(this, values2, "Patient Data",horlabels, verlabels, GraphView.LINE);
        graphView3 = new GraphView(this, values3, "Patient Data",horlabels, verlabels, GraphView.LINE);
        graphView4 = new GraphView(this, values4, "Patient Data",horlabels, verlabels, GraphView.LINE);


        //setContentView(graphView);




        setContentView(R.layout.activity_main);


           rel =  (LinearLayout) findViewById(R.id.llid);

            //rel.addView(graphView);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onButtonStartClick(View v) {

        rel.removeAllViews();
        int min = 1;
        int max = 5;

        Random r = new Random();
        int i1 = r.nextInt(max - min + 1) + min;
        if(i1 == 1)
            rel.addView(graphView);
        else if (i1==2)
            rel.addView(graphView1);
        else if (i1==3)
            rel.addView(graphView2);
        else if (i1==4)
            rel.addView(graphView3);
        else
            rel.addView(graphView4);



    }

    public void onButtonStopClick(View v) {

        rel.removeAllViews();


    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
