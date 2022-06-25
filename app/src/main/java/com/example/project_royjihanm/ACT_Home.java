package com.example.project_royjihanm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ACT_Home extends AppCompatActivity {
    ImageView menu;
    Button Barcode;
    FloatingActionButton programing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Barcode = findViewById(R.id.barcode);
        programing = findViewById(R.id.programing);

        menu = findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(ACT_Home.this, menu);
                popup.getMenuInflater().inflate(R.menu.optionmenu, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(ACT_Home.this, "you Clicked" + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                popup.show();
            }
        });

        Barcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ACT_Home.this,ACT_MainActivity.class);
                startActivity(intent);
            }
        });

        programing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ACT_Home.this,ACT_ListView.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.img_logoku)  //untuk mengatur icon yang tampil pada dialog
                .setTitle(R.string.app_name)  //yaitu judul atau nama aplikasi yang tampil di samping icon
                .setMessage("Kamu benar ingin keluar?")  //kalimat pertanyaan pada dialog
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {  //kalo di klik ya aplikasi akan keluar
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {  //kalo di klik tidak aplikasi tidak akan keluar
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();
    }
}