package com.bmpl.signinout;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    String name, email, password;
    TextView textView;
    Button yesButton, noButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView)findViewById(R.id.welcomeTextView);

        yesButton = (Button)findViewById(R.id.yesButton);
        noButton = (Button)findViewById(R.id.noButton);

        Intent intent = getIntent();//fetching instruction to the intent
        name = intent.getStringExtra("name");
        email = intent.getStringExtra("email");
        password = intent.getStringExtra("password");

        textView.setText("Welcome "+ name + "\n" + email + "\n" + password);
        //textView.setText(textView.getText().toString().concat(name));

        yesButton.setOnClickListener(this);
        noButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent();

        switch (view.getId()){

            case R.id.yesButton:

                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("password", password);
                setResult(RESULT_OK, intent);
                finish();
                break;

            case R.id.noButton:
                setResult(RESULT_CANCELED);
                finish();
                break;
        }
    }
}
