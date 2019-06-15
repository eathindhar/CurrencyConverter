package com.example.currenyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){
        Log.i("Info","Button Pressed!!!");
        EditText value =(EditText)findViewById(R.id.valueEditText);
        TextView text = (TextView) findViewById(R.id.textView);
        //₹
        Log.i("Values","Value: "+text.getText().toString());
        String valueInDollars = value.getText().toString();
        double amountInDollars = Double.parseDouble(valueInDollars);
        double amountInRupees = amountInDollars * 69.90;
        String valueInRupees = String.format("%.2f",amountInRupees);
        text.setText("$"+valueInDollars+" = ₹"+valueInRupees);

        Toast.makeText(this, "Currency Converted!", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
