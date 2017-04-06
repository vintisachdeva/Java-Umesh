package com.bmpl.signinout;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {


    private static final int REQUEST_CODE = 10;

    EditText nameEditText, emailEditText, passwordEditText;
    Button createAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        initialize();
    }

    public void initialize(){

        nameEditText = (EditText)findViewById(R.id.nameEditText);
        emailEditText = (EditText)findViewById(R.id.emailEditText);
        passwordEditText = (EditText)findViewById(R.id.passwordEditText);

        createAccountButton = (Button)findViewById(R.id.button);

        createAccountButton.setOnClickListener(this);//this --> current class
    /*
        //via anonymous class
        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
    }

    @Override
    public void onClick(View view)
    {
        String name = nameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);//intent object
        //left side--> key and right side-->value
        intent.putExtra("name",name);
        intent.putExtra("email",email);
        intent.putExtra("password",password);
        nameEditText.setText("");
        emailEditText.setText("");
        passwordEditText.setText("");
        //myName is a key
        //startActivity(intent);
        //requestcode--> when activity request another activity to start plus the starting activity is supposed to send some result back
        startActivityForResult(intent, REQUEST_CODE);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==REQUEST_CODE){
            if(resultCode==RESULT_OK){
                nameEditText.setText(data.getStringExtra("name"));
                emailEditText.setText(data.getStringExtra("email"));
                passwordEditText.setText(data.getStringExtra("password"));
            }
            else if(resultCode==RESULT_CANCELED){
                Toast.makeText(FirstActivity.this, "No modification", Toast.LENGTH_SHORT).show();
            }

        }
    }
}
