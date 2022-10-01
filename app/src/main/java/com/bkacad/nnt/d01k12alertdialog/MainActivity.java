package com.bkacad.nnt.d01k12alertdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private AlertDialog alertDialog = null;
    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view) {
        if (alertDialog == null) {
            // Tạo mới
            builder = new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Thông báo")
                    .setMessage("Bạn có muốn thoát khỏi ứng dụng?")
                    .setCancelable(false)
                    .setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    })
                    .setNegativeButton("Đóng", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(MainActivity.this, "Đóng dialog", Toast.LENGTH_SHORT).show();
                        }
                    });
            alertDialog = builder.create();
        }
        alertDialog.show();
    }
}