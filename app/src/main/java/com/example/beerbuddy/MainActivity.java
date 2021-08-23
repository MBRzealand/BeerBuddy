package com.example.beerbuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView displayItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayItem = findViewById(R.id.textView);

    }

    public void ChooseShaker(View view) {
        displayItem.setText("Cult Shaker Original");
    }

    public void ChooseClassic(View view) {
        displayItem.setText("Tuborg Classic");
    }

    public void ChooseZero(View view) {
        displayItem.setText("Faxe Kondi 0 Kalorier");
    }

    public void ChooseFaxe(View view) {
        displayItem.setText("Faxe Kondi");
    }

    public void ChooseGreen(View view) {
        displayItem.setText("Tuborg Grøn");
    }

    public void ChoosePepsi(View view) {
        displayItem.setText("Pepsi");
    }

    public void ChooseMokai(View view) {
        displayItem.setText("Mokai Cider Hyldeblomst");
    }

    public void ChoosePineapple(View view) {
        displayItem.setText("Cult Shaker Pineapple");
    }

    public void ChoosePassion(View view) {
        displayItem.setText("Cult Shaker Passion");
    }

    public void ChooseMax(View view) {
        displayItem.setText("Pepsi MAX");
    }

    public void ShowButtons(){

    }


}