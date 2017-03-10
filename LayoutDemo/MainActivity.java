package com.bmpl.layoutdemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText editTextName, editTextMobile;
    Button buttonSubmit, buttonCancel;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // R is auto-generated class-- id of every resources.eg--> layout-> seperate files, values, mipmap

        //downcasting
        //must to do for binding XML with Java
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextMobile = (EditText)findViewById(R.id.editTextMobile);

        buttonSubmit = (Button)findViewById(R.id.buttonSubmit);
        buttonCancel = (Button)findViewById(R.id.buttonCancel);

        textViewResult = (TextView)findViewById(R.id.textViewResult);

        //event handling-- event listener and event handler
        buttonSubmit.setOnClickListener(this);// event listener
        buttonCancel.setOnClickListener(this);
    }

    //event handler
    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.buttonSubmit) {
            textViewResult.setText(editTextName.getText().toString() + editTextMobile.getText());
        }
        else if(view.getId() == R.id.buttonCancel)
        {
            editTextName.setText("");
            editTextMobile.setText("");
            textViewResult.setText("");
        }
    }
}
