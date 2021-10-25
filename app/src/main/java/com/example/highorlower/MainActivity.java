package com.example.highorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public  void makeToast(String string) {
        Toast.makeText(MainActivity.this,string, Toast.LENGTH_SHORT).show();
    }

    public void guess (View view){
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);

        int guessint = Integer.parseInt(guessEditText.getText().toString());

        if (guessint > randomNumber){
            makeToast("Lower!");
        }else if (guessint < randomNumber){
            makeToast("Higher!");

        }else{
            makeToast("That's Right ! Try again !");
            Random rand = new Random();

            randomNumber = rand.nextInt(20) + 1 ;

        }


        Toast.makeText(MainActivity.this,guessEditText.getText().toString(),Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        int n = rand.nextInt(20)  + 1 ;



    }
}