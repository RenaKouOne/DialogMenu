package com.example.dialogmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.registr);
        dialog.setCancelable(false);
        Button buttonStart=(Button)dialog.findViewById(R.id.buttonOK);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    EditText editText=dialog.findViewById(R.id.editText);
                    String s1=editText.getText().toString();
                    if(!TextUtils.isEmpty(s1))
                    {
                        Intent intent = new Intent(MainActivity.this,Proverka.class);
                        startActivity(intent);
                    }
                }catch (Exception ignored) {
                }
            }
        });

        Button buttonCansel=(Button)dialog.findViewById(R.id.buttonCansel);
        buttonCansel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialog.cancel();
                }catch (Exception ignored) {
                }
            }
        });
        dialog.show();
    }
}