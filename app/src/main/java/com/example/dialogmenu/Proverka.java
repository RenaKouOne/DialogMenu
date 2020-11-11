package com.example.dialogmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Proverka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proverka);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextView text=findViewById(R.id.textView);
        TextView text3=findViewById(R.id.textView3);
        TextView text6=findViewById(R.id.textView6);
        TextView text8=findViewById(R.id.textView8);
        TextView text11=findViewById(R.id.textView11);
        TextView text13=findViewById(R.id.textView13);
        TextView text16=findViewById(R.id.textView16);
        TextView text18=findViewById(R.id.textView18);
        TextView text21=findViewById(R.id.textView21);
        TextView text23=findViewById(R.id.textView23);
        EditText text5=findViewById(R.id.editText1);
        EditText text10=findViewById(R.id.editText2);
        EditText text15=findViewById(R.id.editText3);
        EditText text20=findViewById(R.id.editText4);
        EditText text25=findViewById(R.id.editText5);
        int id = item.getItemId();
        int min=2;
        int max=8;
        switch (id) {
            case R.id.low:
                text5.setText("");
                text10.setText("");
                text15.setText("");
                text20.setText("");
                text25.setText("");
                text.setText(""+2);
                int rnd3 = min + (int) (Math.random() * max);
                text3.setText(""+rnd3);

                text6.setText(""+2);

                int rnd8 = min + (int) (Math.random() * max);
                text8.setText(""+rnd8);

                text11.setText(""+2);

                int rnd13 = min + (int) (Math.random() * max);
                text13.setText(""+rnd13);

                text16.setText(""+2);

                int rnd18 = min + (int) (Math.random() * max);
                text18.setText(""+rnd18);

                text21.setText(""+2);

                int rnd23 = min + (int) (Math.random() * max);
                text23.setText(""+rnd23);
                return true;
            case R.id.medium:
                text5.setText("");
                text10.setText("");
                text15.setText("");
                text20.setText("");
                text25.setText("");
                int min1=3;
                int max1=3;
                int rnd = min1 + (int) (Math.random() * max1);
                text.setText(""+rnd);

                int rnd30 = min + (int) (Math.random() * max);
                text3.setText(""+rnd30);

                int rnd6 = min1 + (int) (Math.random() * max1);
                text6.setText(""+rnd6);

                int rnd80 = min + (int) (Math.random() * max);
                text8.setText(""+rnd80);

                int rnd11 = min1 + (int) (Math.random() * max1);
                text11.setText(""+rnd11);

                int rnd130 = min + (int) (Math.random() * max);
                text13.setText(""+rnd130);

                int rnd16 = min1 + (int) (Math.random() * max1);
                text16.setText(""+rnd16);

                int rnd180 = min + (int) (Math.random() * max);
                text18.setText(""+rnd180);

                int rnd21 = min1 + (int) (Math.random() * max1);
                text21.setText(""+rnd21);

                int rnd230 = min + (int) (Math.random() * max);
                text23.setText(""+rnd230);
                return true;
            case R.id.high:
                text5.setText("");
                text10.setText("");
                text15.setText("");
                text20.setText("");
                text25.setText("");
                int min2=10;
                int max2=20;
                int rnd0 = min2 + (int) (Math.random() * ((max2-min2)+1));
                text.setText(""+rnd0);

                int rnd300 = min + (int) (Math.random() * max);
                text3.setText(""+rnd300);

                int rnd60 = min2 + (int) (Math.random() * ((max2-min2)+1));
                text6.setText(""+rnd60);

                int rnd800 = min + (int) (Math.random() * max);
                text8.setText(""+rnd800);

                int rnd101 = min2 + (int) (Math.random() * ((max2-min2)+1));
                text11.setText(""+rnd101);

                int rnd1300 = min + (int) (Math.random() * max);
                text13.setText(""+rnd1300);

                int rnd106 = min2 + (int) (Math.random() * ((max2-min2)+1));
                text16.setText(""+rnd106);

                int rnd1800 = min + (int) (Math.random() * max);
                text18.setText(""+rnd1800);

                int rnd201 = min2 + (int) (Math.random() * ((max2-min2)+1));
                text21.setText(""+rnd201);

                int rnd2300 = min + (int) (Math.random() * max);
                text23.setText(""+rnd2300);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressLint({"ResourceType", "SetTextI18n"})
    public void onClick (View View) {
        String a,a1,a2,a3,a4,a5,a6,a7,a8,a9;
        int y,y1,y2,y3,y4,y5,y6,y7,y8,y9;
        TextView text=findViewById(R.id.textView);
        TextView text3=findViewById(R.id.textView3);
        TextView text6=findViewById(R.id.textView6);
        TextView text8=findViewById(R.id.textView8);
        TextView text11=findViewById(R.id.textView11);
        TextView text13=findViewById(R.id.textView13);
        TextView text16=findViewById(R.id.textView16);
        TextView text18=findViewById(R.id.textView18);
        TextView text21=findViewById(R.id.textView21);
        TextView text23=findViewById(R.id.textView23);
        a=text.getText().toString();
        a1=text3.getText().toString();
        a2=text6.getText().toString();
        a3=text8.getText().toString();
        a4=text11.getText().toString();
        a5=text13.getText().toString();
        a6=text16.getText().toString();
        a7=text18.getText().toString();
        a8=text21.getText().toString();
        a9=text23.getText().toString();
        y=Integer.parseInt(a);
        y1=Integer.parseInt(a1);
        y2=Integer.parseInt(a2);
        y3=Integer.parseInt(a3);
        y4=Integer.parseInt(a4);
        y5=Integer.parseInt(a5);
        y6=Integer.parseInt(a6);
        y7=Integer.parseInt(a7);
        y8=Integer.parseInt(a8);
        y9=Integer.parseInt(a9);
        String s,s1,s2,s3,s4;
        int x,x1,x2,x3,x4;
        int sum=0;
        EditText text5=findViewById(R.id.editText1);
        EditText text10=findViewById(R.id.editText2);
        EditText text15=findViewById(R.id.editText3);
        EditText text20=findViewById(R.id.editText4);
        EditText text25=findViewById(R.id.editText5);
        s=text5.getText().toString();
        s1=text10.getText().toString();
        s2=text15.getText().toString();
        s3=text20.getText().toString();
        s4=text25.getText().toString();
        x=Integer.parseInt(s);
        x1=Integer.parseInt(s1);
        x2=Integer.parseInt(s2);
        x3=Integer.parseInt(s3);
        x4=Integer.parseInt(s4);
        if (x!=(y*y1)) sum+=1;
        if (x1!=(y2*y3)) sum+=1;
        if (x2!=(y4*y5)) sum+=1;
        if (x3!=(y6*y7)) sum+=1;
        if (x4!=(y8*y9)) sum+=1;
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.result);
        TextView txt=dialog.findViewById(R.id.textViewSum);
        txt.setText(""+sum);
        dialog.show();
    }
}