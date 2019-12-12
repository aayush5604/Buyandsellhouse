package com.example.buyandsellhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginactivity extends AppCompatActivity {
    private EditText etusername, etpassword;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);

        etusername = findViewById(R.id.etusername);
        etpassword = findViewById(R.id.etpassword);
        btnRegister = findViewById(R.id.btnlogin);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    private void login() {
        SharedPreferences sharedPreferences = getSharedPreferences("User", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("username", etusername.getText().toString());
        editor.putString("password", etpassword.getText().toString());
        editor.commit();

        Toast.makeText(this, "Successfully Refistered", Toast.LENGTH_SHORT).show();
    }
}

