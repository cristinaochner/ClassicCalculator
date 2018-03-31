package com.example.cristina.provacalcolatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.BatchUpdateException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btn_point, btn_zero, btn_add, btn_sub, btn_one, btn_two, btn_three, btn_mul,
            btn_four, btn_five, btn_six, btn_div, btn_seven, btn_eight, btn_nine, btn_equals;
    private EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button add = (Button) findViewById(R.id.add);
        btn_point = (Button) findViewById(R.id.btn_point);
        btn_zero = (Button) findViewById(R.id.btn_zero);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_one = (Button) findViewById(R.id.btn_one);
        btn_two = (Button) findViewById(R.id.btn_two);
        btn_three = (Button) findViewById(R.id.btn_three);
        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_four = (Button) findViewById(R.id.btn_four);
        btn_five = (Button) findViewById(R.id.btn_five);
        btn_six = (Button) findViewById(R.id.btn_six);
        btn_div = (Button) findViewById(R.id.btn_div);
        btn_seven = (Button) findViewById(R.id.btn_seven);
        btn_eight = (Button) findViewById(R.id.btn_eight);
        btn_nine = (Button) findViewById(R.id.btn_nine);
        btn_equals = (Button) findViewById(R.id.btn_equals);

        result = (EditText) findViewById(R.id.result);

        btn_point.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { salvaArray("."); } });

        btn_zero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { salvaArray("0"); } });

        btn_add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { salvaArray("+"); } });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { salvaArray("-"); } });

        btn_one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { salvaArray("1"); } });

        btn_two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { salvaArray("2"); } });

        btn_three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { salvaArray("3"); } });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { salvaArray("*"); } });

        btn_four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { salvaArray("4"); } });


    }

    private ArrayList<String> espressione= new ArrayList<>();

    public void salvaArray(String s) {
    espressione.add(s);
    String st= new String(" ");

        for (String e:espressione) {
            st= st+e;

        }
        result.setText(st);

    }
}
