package com.example.mariapaulaanastas.mesero;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class Register_Activity extends ActionBarActivity {


    protected EditText mUsername;
    protected EditText mUserEmail;
    protected EditText mUserPassword;
    protected Button mRegisterButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "H5nqxUHyp6A2nvR6O5wHPGSa0vW6nabXucX5Nf0E", "uGfYMntmiDA0mzoAaQQPLkAAXVxHscpoVWu1sUh2");
        //Inicializa
        mUsername = (EditText)findViewById(R.id.usernameEditText);
        mUserEmail = (EditText)findViewById(R.id.mailEditText);
        mUserPassword = (EditText)findViewById(R.id.passwordEditText);
        mRegisterButton = (Button)findViewById(R.id.botonRegistrarse);

        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the user name password and email and convert it to String

                String username = mUsername.getText().toString().trim();
                String email = mUserEmail.getText().toString().trim();
                String password = mUserPassword.getText().toString().trim();

                ParseObject Usuarios = new ParseObject("Usuarios");
                Usuarios.put("username", username);
                Usuarios.put("email", email);
                Usuarios.put("password", password);
                Usuarios.saveInBackground();

                Toast.makeText(Register_Activity.this, "Bienvenido", Toast.LENGTH_LONG).show();
                //take to home page post login
                Intent meseroHome = new Intent(Register_Activity.this, MainActivity.class);
                startActivity(meseroHome);
            }
        });
    }
}
