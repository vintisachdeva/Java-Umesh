package com.bmpl.foodlover;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    TextView textView;
    RadioGroup radioGroup;
    SeekBar seekBar;
    Button checkResult;
    CheckBox iceCream, cake, burger;
    int iceCreamCounter = 0, cakeCounter = 0, burgerCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        initialize();

        checkResult.setOnClickListener(this);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int userValue, boolean b) {
                   textView.setText("Liking: "+ userValue +"/"+ seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        radioButtonResult();

        iceCream.setOnCheckedChangeListener(this);
        cake.setOnCheckedChangeListener(this);
        burger.setOnCheckedChangeListener(this);
    }

    void initialize(){
        textView = (TextView)findViewById(R.id.textView);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        seekBar = (SeekBar)findViewById(R.id.seekBar);
        checkResult = (Button)findViewById(R.id.checkResultButton);
        iceCream = (CheckBox)findViewById(R.id.iceCreamCheckBox);
        cake = (CheckBox)findViewById(R.id.cakeCheckBox);
        burger = (CheckBox)findViewById(R.id.burgerCheckBox);
    }

    @Override
    public void onClick(View view) {


    }

    void radioButtonResult(){
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                int id = radioGroup.getCheckedRadioButtonId();

                switch (id)
                {
                    case R.id.iceCreamButton:
                        iceCreamCounter++;
                        Log.i("FoodActivity","ice cream ="+ iceCreamCounter);
                        break;

                    case R.id.cakeButton:
                        cakeCounter++;
                        Log.i("FoodActivity","cake ="+ cakeCounter);
                        break;

                    case R.id.burgerButton:
                        burgerCounter++;
                        Log.i("FoodActivity","burger ="+ burgerCounter);
                        break;
                }
            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(iceCream.isChecked()){
            iceCreamCounter++;
            Log.i("Checkbox","ice cream ="+ iceCreamCounter);
        }
        if(cake.isChecked()){
            cakeCounter++;
            Log.i("Checkbox","cake ="+ cakeCounter);
        }if(burger.isChecked()){
            burgerCounter++;
            Log.i("Checkbox","burger ="+ burgerCounter);
        }
    }
}
