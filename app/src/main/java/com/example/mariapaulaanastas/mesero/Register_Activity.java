package com.example.mariapaulaanastas.mesero;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register_Activity extends ActionBarActivity {


    protected EditText mUsername;
    protected EditText mUserEmail;
    protected EditText mUserPassword;
    protected Button mRegisterButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);

        //Inicializa
        mUsername = (EditText)findViewById(R.id.usernameEditText);
        mUserEmail = (EditText)findViewById(R.id.mailEditText);
        mUserPassword = (EditText)findViewById(R.id.passwordEditText);
        mRegisterButton = (Button)findViewById(R.id.botonRegistrarse);

        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(Register_Activity.this, "Bienvenido", Toast.LENGTH_LONG).show();
            }
        });



    }
}
