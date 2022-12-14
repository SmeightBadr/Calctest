package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getString(R.string.display).equals(display.getText().toString()))
                    display.setText("");
            }
        });

    }
    private void updateText(String numAdd){
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftString = oldStr.substring(0,cursorPos);
        String rightString = oldStr.substring(cursorPos);
        if(getString(R.string.display).equals((display.getText().toString()))){
            display.setText(numAdd);
        }
        else{
            display.setText(String.format("%s%s%s",leftString,numAdd,rightString));
            display.setSelection(cursorPos+1);

        }


    }
    private void updateValue(){
        int cursorPos = display.getSelectionStart();
        String oldStr = display.getText().toString();
        String newStr = "-"+ oldStr;
        display.setText(newStr);
        display.setSelection(cursorPos+1);

    }

    public void zeroBTN(View view){
        updateText("0");
    }
    public void oneBTN(View view){
        updateText("1");
    }
    public void twoBTN(View view){
        updateText("2");
    }
    public void threeBTN(View view){
        updateText("3");
    }
    public void fourBTN(View view){
        updateText("4");
    }
    public void fiveBTN(View view){
        updateText("5");
    }
    public void sixBTN(View view){
        updateText("6");
    }
    public void sevenBTN(View view){
        updateText("7");
    }
    public void eightBTN(View view){
        updateText("8");
    }
    public void nineBTN(View view){
        updateText("9");
    }

    public void ceBTN(View view){
        display.setText("");
    }
    public void backBTN(View view){
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();

        if(cursorPos != 0&&textLen != 0){
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursorPos-1,cursorPos,"");
            display.setText(selection);
            display.setSelection(cursorPos-1);
        }
    }
    public void addBTN(View view){
        updateText("+");
    }
    public void subBTN(View view){
        updateText("-");
    }
    public void multiBTN(View view){
        updateText("×");
    }
    public void divideBTN(View view){
        updateText("÷");
    }
    public void sqrtBTN(View view){
        updateText("√");

    }
    public void equalBTN(View view){
        String userExs = display.getText().toString();

        userExs = userExs.replaceAll("÷","/");
        userExs =userExs.replaceAll("×","*");

        Expression exp = new Expression(userExs);

        String output = String.valueOf(exp.calculate());

        display.setText(output);
        display.setSelection(output.length());
    }
    public void plusMinusBTN(View view){
        updateValue();
    }

}