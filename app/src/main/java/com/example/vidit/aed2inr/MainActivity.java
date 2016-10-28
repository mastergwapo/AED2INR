package com.example.vidit.aed2inr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.id.input;
import static com.example.vidit.aed2inr.R.id.aed;
import static com.example.vidit.aed2inr.R.id.inr;
import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    void convertAedToInr()
    {  EditText aed= (EditText) findViewById(R.id.aed);
        aed.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText  inr=(EditText) findViewById(R.id.inr);
        inr.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(aed.getText().toString());
        double result=a*18.16;
        inr.setText(String.valueOf(result));

    }

    void convertInrToAed()
    {  EditText aed= (EditText) findViewById(R.id.aed);
        aed.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  inr=(EditText) findViewById(R.id.inr);
        inr.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(inr.getText().toString());
        double result=a/18.16;
        aed.setText(String.valueOf(result));
    }

    public void click(View view)
    {
        convertAedToInr();
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(false);
    }

    public void reset(View view)
    {
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(true);
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(true);
        EditText aed= (EditText) findViewById(R.id.aed);
        EditText  inr=(EditText) findViewById(R.id.inr);
        aed.setText("");
        inr.setText("");

    }

    public void click2(View view)
    {
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(false);
        convertInrToAed();
    }



}
