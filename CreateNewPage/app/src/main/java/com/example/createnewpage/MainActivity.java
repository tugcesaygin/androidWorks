package com.example.createnewpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView myTextView ;
    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView =findViewById(R.id.myTextView);
        myButton =findViewById(R.id.myButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myTextView.setText("How Are You");
                Log.e("Mesaj","Merhaba");

            }
        });






    }
}