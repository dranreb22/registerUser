package com.example.registerUser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.helloworldjava.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        TextView textView = findViewById(R.id.text);

        EditText nameEditText = findViewById(R.id.LastNameEdit);
    }

    public void onButtonClick (View view){

        TextView textView = findViewById(R.id.text);

        textView.setText("Hello, Bernard!");

        //Button button = findViewById(R.id.button);

        EditText nameEditText = findViewById(R.id.LastNameEdit);

        textView.setText("Hello, " + nameEditText.getText().toString());
    }

}
