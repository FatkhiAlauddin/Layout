package com.example.percobaan;

import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLoging dengan componen button pada Layout
        btnLogin = findViewById(R.id.btSignIn);

        //Menghubungkan variabel edemail dengan componen button pada Layout
        edemail = findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada Layout
        edpassword = findViewById(R.id.edPassword);

        //membuat fingfi onclik pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menyimpan input user di edittext email ke dalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password ke dalam variabel password
                password = edpassword.getText().toString();

                //Mengeset email yang benar
                String email = "admin@mail.com";

                //Mengeset password yang benar
                String pass = "123";

                //Password yang sudah diset
                if (nama.isEmpty() || password.isEmpty()) {
                    //Membuat variabel toast yang menampilkan login sukses
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password Wajib Diisi",
                            Toast.LENGTH_LONG);
                    //Menampilkan Toast
                    t.show();
                } else {

                    //Password yang sudah diset
                    if (nama.equals(email) && password.equals(pass)) {
                        //Membuat variabel toast yang menampilkan login sukses
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses",
                                Toast.LENGTH_LONG);
                        //Menampilkan Toast
                        t.show();

                        //Membuat objek bundle
                        Bundle b = new Bundle();

                        //Memasukkan value dari variabel dengan kunci "a"
                        b.putString("a", nama.trim());

                        //Memasukkan value dari variabel dengan kunci "b"
                        b.putString("b", password.trim());

                        //membuat objek intent berpindah activity dari mainactivity ke Activityhasil
                        Intent i = new Intent(getApplicationContext(), MainActivityHasil.class);

                        //memasukkan Bundle ke dalam inetnt untuk dikirimkan ke ActivityHasil
                        i.putExtras(b);

                        //Berpindah ke ActivityHasil
                        startActivity(i);
                    } else {

                        //membuat variabel toast dan me,buat toast dengan menambahkan variabel nama dan password
                            Toast t = Toast.makeText(getApplicationContext(),
                            "email anda: " + nama + " dan Password anda: " + password + "", Toast.LENGTH_LONG);
                        //menampilkan toast
                        t.show();
                    }
                }
            }
        });
    }
}