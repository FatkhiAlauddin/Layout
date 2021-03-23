package com.example.percobaan;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivityHasil extends AppCompatActivity {
    //Mendeklarasikan Variabel dengan tipe data textview
    TextView txEmail, txPassword;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Method untuk menampilkan menu
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Membuat kondisi jika yang dipilih adalah mnDaftar
        if (item.getItemId()==R.id.mnDaftar)
        {
            //Method untuk memanggil activity "DaftarActivity"
            Intent i= new Intent(getApplicationContext(),DaftarActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hasil);

        //Mengghubungkan Variabel txEmail dengann componen TextView pada Layout
        txEmail = findViewById(R.id.tvEmail);

        //Menghubungkan Variael txPassword dengan componen TextView pada Laeyout
        txPassword = findViewById(R.id.tvPassword);

        //Mendeklarasikan Variabel bundle yang akan digunakan untuk emngambil
        //pesan yang dikirimkan melalui method intent
        Bundle bundle = getIntent().getExtras();

        //Membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "a"
        String email = bundle.getString("a");

        //Membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "b"
        String pass = bundle.getString("b");

        //Menampilkan value dari variabel email kedalam txEmail
        txEmail.setText(email);

        //Menampilkan value dari variabel  pass kedalam txPassword
        txPassword.setText(pass);

    }
}