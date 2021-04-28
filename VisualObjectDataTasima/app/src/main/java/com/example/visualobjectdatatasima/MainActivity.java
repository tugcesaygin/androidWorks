package com.example.visualobjectdatatasima;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextInput;
    private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextInput = findViewById(R.id.editTextInput);
        send = findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String veri = editTextInput.getText().toString();// textviewda girilen deger string oldugu icin
                Intent newIntent = new Intent(MainActivity.this ,ActivityB.class);
                newIntent.putExtra("message",veri);
                startActivity(newIntent);

            }
        });
    }
}