package com.chuyennt.trainning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submit = findViewById(R.id.button);
        EditText name = findViewById(R.id.editTextTextPersonName);
        EditText id = findViewById(R.id.editTextNumber);
        EditText dateOfBirth = findViewById(R.id.editTextDate);
        EditText phone = findViewById(R.id.editTextNumber2);
        EditText email = findViewById(R.id.editTextTextEmailAddress);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().isEmpty() || id.getText().toString().isEmpty() ||
                    dateOfBirth.getText().toString().isEmpty() || phone.getText().toString().isEmpty() ||
                        email.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Submit fail", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}