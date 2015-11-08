package com.example.mariapaulaanastas.mesero;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register2Activity extends ActionBarActivity {


    //Inicia

    protected EditText mUsername;
    protected EditText mEmail;
    protected EditText mPassword;
    protected Button mRegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        // Inicia
        mUsername = (EditText)findViewById(R.id.usuarioEditText);
        mEmail = (EditText)findViewById(R.id.mailEditText);
        mPassword = (EditText)findViewById(R.id.passwordEditPassword);
        mRegisterButton = (Button)findViewById(R.id.buttonRegistrarse);


        //Listener
        mRegisterButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Toast
                Toast.makeText(Register2Activity.this, "success", Toast.LENGTH_LONG).show();
            }
        });



    }
}
