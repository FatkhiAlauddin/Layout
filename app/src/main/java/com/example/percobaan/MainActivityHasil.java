package com.example.percobaan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityHasil extends AppCompatActivity {
    //Mendeklarasikan Variabel dengan tipe data textview
    TextView txEmail, txPassword;

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