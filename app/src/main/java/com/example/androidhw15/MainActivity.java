package com.example.androidhw15;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toastbtn = (Button) findViewById(R.id.toast);
        toastbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "hello world", Toast.LENGTH_LONG).show();
            }
        });
        Button Alerbtn = (Button) findViewById(R.id.AlertDialog);
        Alerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("對話視窗測試")
                        .setMessage("這是一個對話視窗")
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("關閉視窗", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();//dismiss:關閉回傳值 ；cancel:尚未完成工作關閉
                            }
                        })
                .show();
            }
        });

    }
}
