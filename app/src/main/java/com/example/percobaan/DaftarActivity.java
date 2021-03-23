package com.example.percobaan;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DaftarActivity extends AppCompatActivity {
    //Deklarasi Variabel dengan tipe data EditText
    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;

    //Deklarasi Variabel dengan tipe data flooating action Button
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

            //Membuat method untuk event dari floating button
            fab.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    //Membuat kondisi untuk mengecek apakah edit text kosong atau tidak
                    if (edtNama.getText().toString().isEmpty() ||
                        edtAlamat.getText().toString().isEmpty() ||
                        edtEmail.getText().toString().isEmpty() ||
                        edtPassword.getText().toString().isEmpty() ||
                        edtrepass.getText().toString().isEmpty())
                    {
                        //Menampilkan pesan nontivikasi jika seluruh text wajib diisi
                        Snackbar.make(view,"Wajib Isi Seluruh Data!!!",Snackbar.LENGTH_LONG).show();
                    }
                    else
                    {
                        //Membuat konsisi untuk mengecek apakah isi dari edittext password dan edittext repassword
                        //sama atau tidak
                        if (edtPassword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        //Menampilkan nontivikasi jika pendaftaran berhasil
                        Toast.makeText(getApplicationContext(),"Pendaftaran Bethasil...",
                            Toast.LENGTH_LONG).show();

                        //Method untuk kembali ke activity main
                        Intent i = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        //Menampilkan pesan bahwa isi dari EditText password dan EditText repassword
                        //tidak sama
                        Snackbar.make(view, "Password dan Repassword Harus Sama!!!",
                            Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}