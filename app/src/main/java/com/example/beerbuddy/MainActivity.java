package com.example.beerbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView displayItem;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;

    TextView itemOne;
    TextView itemTwo;
    TextView itemThree;
    TextView itemFour;
    TextView itemFive;
    TextView itemOneAmount;
    TextView itemTwoAmount;
    TextView itemThreeAmount;
    TextView itemFourAmount;
    TextView itemFiveAmount;
    TextView itemOnePrice;
    TextView itemTwoPrice;
    TextView itemThreePrice;
    TextView itemFourPrice;
    TextView itemFivePrice;
    TextView itemOneKr;
    TextView itemTwoKr;
    TextView itemThreeKr;
    TextView itemFourKr;
    TextView itemFiveKr;

    TextView amountShakerOriginal;
    TextView amountShakerPineapple;
    TextView amountShakerPassion;
    TextView amountMokai;
    TextView amountPepsi;
    TextView amountMAX;
    TextView amountKondi;
    TextView amountKondiZero;
    TextView amountGroen;
    TextView amountClassic;

    TextView total;
    TextView totalPrice;
    TextView totalPriceKr;

    Boolean accepted;
    int amount;
    int itemCounter;
    int itemID;
    int price;

    int priceSum;

    Button AcceptButton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayItem = findViewById(R.id.textView);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);

        itemOne = findViewById(R.id.item1);
        itemTwo = findViewById(R.id.item2);
        itemThree = findViewById(R.id.item3);
        itemFour = findViewById(R.id.item4);
        itemFive = findViewById(R.id.item5);
        itemOneAmount = findViewById(R.id.item1Amount);
        itemTwoAmount = findViewById(R.id.item2Amount);
        itemThreeAmount = findViewById(R.id.item3Amount);
        itemFourAmount = findViewById(R.id.item4Amount);
        itemFiveAmount = findViewById(R.id.item5Amount);
        itemOnePrice = findViewById(R.id.item1price);
        itemTwoPrice = findViewById(R.id.item2price);
        itemThreePrice = findViewById(R.id.item3price);
        itemFourPrice = findViewById(R.id.item4price);
        itemFivePrice = findViewById(R.id.item5price);
        itemOneKr = findViewById(R.id.kr1);
        itemTwoKr = findViewById(R.id.kr2);
        itemThreeKr = findViewById(R.id.kr3);
        itemFourKr = findViewById(R.id.kr4);
        itemFiveKr = findViewById(R.id.kr5);
        total = findViewById(R.id.total);
        totalPrice = findViewById(R.id.totalPrice);
        totalPriceKr = findViewById(R.id.totalPriceKr);
        AcceptButton = findViewById(R.id.acceptButton);

        amountShakerOriginal = findViewById(R.id.amountOriginal);
        amountShakerPineapple = findViewById(R.id.amountPineapple);
        amountShakerPassion = findViewById(R.id.amountPassion);
        amountMokai = findViewById(R.id.amountMokai);
        amountPepsi = findViewById(R.id.amountPepsi);
        amountMAX = findViewById(R.id.amountMax);
        amountKondi = findViewById(R.id.amountKondi);
        amountKondiZero = findViewById(R.id.amountKondiZero);
        amountGroen = findViewById(R.id.amountGroen);
        amountClassic = findViewById(R.id.amountClassic);

        AcceptButton.setVisibility(View.GONE);

        accepted = false;
        amount = 0;
        itemCounter = 0;
        price = 0;
        itemID = 0;
        priceSum = 0;

        HideButtons();
        hidePrices();

    }

    public void ChooseShaker(View view) {
        displayItem.setText("Cult Shaker Original");
        itemID = 1;
        ShowButtons();
        hidePrices();
    }

    public void ChoosePineapple(View view) {
        displayItem.setText("Cult Shaker Pineapple");
        itemID = 2;
        ShowButtons();
        hidePrices();
    }

    public void ChoosePassion(View view) {
        displayItem.setText("Cult Shaker Passion");
        itemID = 3;
        ShowButtons();
        hidePrices();
    }

    public void ChooseMokai(View view) {
        displayItem.setText("Mokai Cider Hyldeblomst");
        itemID = 4;
        ShowButtons();
        hidePrices();
    }

    public void ChoosePepsi(View view) {
        displayItem.setText("Pepsi");
        itemID = 5;
        ShowButtons();
        hidePrices();
    }

    public void ChooseMax(View view) {
        displayItem.setText("Pepsi MAX");
        itemID = 6;
        ShowButtons();
        hidePrices();
    }

    public void ChooseFaxe(View view) {
        displayItem.setText("Faxe Kondi");
        itemID = 7;
        ShowButtons();
        hidePrices();
    }

    public void ChooseZero(View view) {
        displayItem.setText("Faxe Kondi 0 Kalorier");
        itemID = 8;
        ShowButtons();
        hidePrices();
    }

    public void ChooseGreen(View view) {
        displayItem.setText("Tuborg Grøn");
        itemID = 9;
        ShowButtons();
        hidePrices();
    }

    public void ChooseClassic(View view) {
        displayItem.setText("Tuborg Classic");
        itemID = 10;
        ShowButtons();
        hidePrices();
    }



    public void ShowButtons(){
        one.setVisibility(View.VISIBLE);
        two.setVisibility(View.VISIBLE);
        three.setVisibility(View.VISIBLE);
        four.setVisibility(View.VISIBLE);
        five.setVisibility(View.VISIBLE);
        six.setVisibility(View.VISIBLE);
        seven.setVisibility(View.VISIBLE);
        eight.setVisibility(View.VISIBLE);
        nine.setVisibility(View.VISIBLE);
    }

    public void HideButtons(){
        one.setVisibility(View.GONE);
        two.setVisibility(View.GONE);
        three.setVisibility(View.GONE);
        four.setVisibility(View.GONE);
        five.setVisibility(View.GONE);
        six.setVisibility(View.GONE);
        seven.setVisibility(View.GONE);
        eight.setVisibility(View.GONE);
        nine.setVisibility(View.GONE);
    }


    public void clickOne(View view) {
        HideButtons();
        amount = 1;

        itemCounter += 1;

        displayPrice1();
        displayPrice2();
        displayPrice3();
        displayPrice4();
        displayPrice5();

        showPrices();

        displayItem.setText("Pris Overblik");
    }

    public void clickTwo(View view) {
        HideButtons();
        amount = 2;

        itemCounter += 1;

        displayPrice1();
        displayPrice2();
        displayPrice3();
        displayPrice4();
        displayPrice5();

        showPrices();

        displayItem.setText("Pris Overblik");
    }

    public void clickThree(View view) {
        HideButtons();
        amount = 3;

        itemCounter += 1;

        displayPrice1();
        displayPrice2();
        displayPrice3();
        displayPrice4();
        displayPrice5();

        showPrices();

        displayItem.setText("Pris Overblik");
    }

    public void clickFour(View view) {
        HideButtons();
        amount = 4;

        itemCounter += 1;

        displayPrice1();
        displayPrice2();
        displayPrice3();
        displayPrice4();
        displayPrice5();

        showPrices();

        displayItem.setText("Pris Overblik");
    }

    public void clickFive(View view) {
        HideButtons();
        amount = 5;

        itemCounter += 1;

        displayPrice1();
        displayPrice2();
        displayPrice3();
        displayPrice4();
        displayPrice5();

        showPrices();

        displayItem.setText("Pris Overblik");
    }

    public void clickSix(View view) {
        HideButtons();
        amount = 6;

        itemCounter += 1;

        displayPrice1();
        displayPrice2();
        displayPrice3();
        displayPrice4();
        displayPrice5();

        showPrices();

        displayItem.setText("Pris Overblik");
    }

    public void clickSeven(View view) {
        HideButtons();
        amount = 7;

        itemCounter += 1;

        displayPrice1();
        displayPrice2();
        displayPrice3();
        displayPrice4();
        displayPrice5();

        showPrices();

        displayItem.setText("Pris Overblik");
    }

    public void clickEight(View view) {
        HideButtons();
        amount = 8;

        itemCounter += 1;

        displayPrice1();
        displayPrice2();
        displayPrice3();
        displayPrice4();
        displayPrice5();

        showPrices();

        displayItem.setText("Pris Overblik");
    }

    public void clickNine(View view) {
        HideButtons();
        amount = 9;

        itemCounter += 1;

        displayPrice1();
        displayPrice2();
        displayPrice3();
        displayPrice4();
        displayPrice5();

        showPrices();

        displayItem.setText("Pris Overblik");
    }


    //price functions


    public void displayPrice1(){
        if(itemCounter == 1) {
            itemOne.setText(displayItem.getText().toString());
            itemOneAmount.setText(String.valueOf(amount));

            findPrice();
            adjustStorage();
            itemID = 0;

            itemOnePrice.setText(String.valueOf(price*amount));
            itemOneKr.setText(" kr");

            totalPrice.setText(String.valueOf(Integer.parseInt((String) itemOnePrice.getText())));
            totalPriceKr.setText(" kr");

            AcceptButton.setVisibility(View.VISIBLE);
        }
    }

    public void displayPrice2(){
        if(itemCounter == 2) {
            itemTwo.setText(displayItem.getText().toString());
            itemTwoAmount.setText(String.valueOf(amount));

            findPrice();
            adjustStorage();
            itemID = 0;

            itemTwoPrice.setText(String.valueOf(price*amount));
            itemTwoKr.setText(" kr");

            priceSum = ( Integer.parseInt((String) itemOnePrice.getText()))  +
                    ( Integer.parseInt((String) itemTwoPrice.getText()));

            totalPrice.setText(String.valueOf(priceSum));
            totalPriceKr.setText(" kr");

            AcceptButton.setVisibility(View.VISIBLE);
        }

    }

    public void displayPrice3(){
        if(itemCounter == 3) {
            itemThree.setText(displayItem.getText().toString());
            itemThreeAmount.setText(String.valueOf(amount));

            findPrice();
            adjustStorage();
            itemID = 0;

            itemThreePrice.setText(String.valueOf(price*amount));
            itemThreeKr.setText(" kr");

            priceSum = ( Integer.parseInt((String) itemOnePrice.getText())) +
                    ( Integer.parseInt((String) itemTwoPrice.getText())) +
                    ( Integer.parseInt((String) itemThreePrice.getText()));

            totalPrice.setText(String.valueOf(priceSum));
            totalPriceKr.setText(" kr");

            AcceptButton.setVisibility(View.VISIBLE);

        }

    }

    public void displayPrice4(){
        if(itemCounter == 4) {
            itemFour.setText(displayItem.getText().toString());
            itemFourAmount.setText(String.valueOf(amount));

            findPrice();
            adjustStorage();
            itemID = 0;

            itemFourPrice.setText(String.valueOf(price*amount));
            itemFourKr.setText(" kr");

            priceSum = ( Integer.parseInt((String) itemOnePrice.getText())) +
                    ( Integer.parseInt((String) itemTwoPrice.getText())) +
                    ( Integer.parseInt((String) itemThreePrice.getText())) +
                    ( Integer.parseInt((String) itemFourPrice.getText()));

            totalPrice.setText(String.valueOf(priceSum));
            totalPriceKr.setText(" kr");

            AcceptButton.setVisibility(View.VISIBLE);
        }

    }

    public void displayPrice5(){
        if(itemCounter == 5) {
            itemFive.setText(displayItem.getText().toString());
            itemFiveAmount.setText(String.valueOf(amount));

            findPrice();
            adjustStorage();
            itemID = 0;

            itemFivePrice.setText(String.valueOf(price*amount));
            itemFiveKr.setText(" kr");

            priceSum = ( Integer.parseInt((String) itemOnePrice.getText())) +
                    ( Integer.parseInt((String) itemTwoPrice.getText())) +
                    ( Integer.parseInt((String) itemThreePrice.getText())) +
                    ( Integer.parseInt((String) itemFourPrice.getText())) +
                    ( Integer.parseInt((String) itemFivePrice.getText()));

            totalPrice.setText(String.valueOf(priceSum));
            totalPriceKr.setText(" kr");

            AcceptButton.setVisibility(View.VISIBLE);
        }

    }

    public void hidePrices(){
        itemOne.setVisibility(View.GONE);
        itemTwo.setVisibility(View.GONE);
        itemThree.setVisibility(View.GONE);
        itemFour.setVisibility(View.GONE);
        itemFive.setVisibility(View.GONE);

        itemOneAmount.setVisibility(View.GONE);
        itemTwoAmount.setVisibility(View.GONE);
        itemThreeAmount.setVisibility(View.GONE);
        itemFourAmount.setVisibility(View.GONE);
        itemFiveAmount.setVisibility(View.GONE);

        itemOnePrice.setVisibility(View.GONE);
        itemTwoPrice.setVisibility(View.GONE);
        itemThreePrice.setVisibility(View.GONE);
        itemFourPrice.setVisibility(View.GONE);
        itemFivePrice.setVisibility(View.GONE);

        itemOneKr.setVisibility(View.GONE);
        itemTwoKr.setVisibility(View.GONE);
        itemThreeKr.setVisibility(View.GONE);
        itemFourKr.setVisibility(View.GONE);
        itemFiveKr.setVisibility(View.GONE);

        total.setVisibility(View.GONE);
        totalPrice.setVisibility(View.GONE);
        totalPriceKr.setVisibility(View.GONE);

    }

    public void showPrices(){
        itemOne.setVisibility(View.VISIBLE);
        itemTwo.setVisibility(View.VISIBLE);
        itemThree.setVisibility(View.VISIBLE);
        itemFour.setVisibility(View.VISIBLE);
        itemFive.setVisibility(View.VISIBLE);

        itemOneAmount.setVisibility(View.VISIBLE);
        itemTwoAmount.setVisibility(View.VISIBLE);
        itemThreeAmount.setVisibility(View.VISIBLE);
        itemFourAmount.setVisibility(View.VISIBLE);
        itemFiveAmount.setVisibility(View.VISIBLE);

        itemOnePrice.setVisibility(View.VISIBLE);
        itemTwoPrice.setVisibility(View.VISIBLE);
        itemThreePrice.setVisibility(View.VISIBLE);
        itemFourPrice.setVisibility(View.VISIBLE);
        itemFivePrice.setVisibility(View.VISIBLE);

        itemOneKr.setVisibility(View.VISIBLE);
        itemTwoKr.setVisibility(View.VISIBLE);
        itemThreeKr.setVisibility(View.VISIBLE);
        itemFourKr.setVisibility(View.VISIBLE);
        itemFiveKr.setVisibility(View.VISIBLE);

        total.setVisibility(View.VISIBLE);
        totalPrice.setVisibility(View.VISIBLE);
        totalPriceKr.setVisibility(View.VISIBLE);
    }

    public void findPrice(){

        switch(itemID){

            case 1:
                price = 20;
                break;
            case 2:
                price = 20;
                break;
            case 3:
                price = 20;
                break;
            case 4:
                price = 20;
                break;
            case 5:
                price = 10;
                break;
            case 6:
                price = 10;
                break;
            case 7:
                price = 10;
                break;
            case 8:
                price = 10;
                break;
            case 9:
                price = 10;
                break;
            case 10:
                price = 10;
                break;

            default:
                price = 0;
                break;

        }


    }

    public void adjustStorage(){

        switch(itemID){

            case 1:
                int tmpvar = Integer.parseInt((String) amountShakerOriginal.getText());
                amountShakerOriginal.setText("");
                amountShakerOriginal.setText(String.valueOf(tmpvar-amount));
                break;
            case 2:
                int tmpvar2 = Integer.parseInt((String) amountShakerPineapple.getText());
                amountShakerPineapple.setText(String.valueOf(tmpvar2-amount));
                break;
            case 3:
                int tmpvar3 = Integer.parseInt((String) amountShakerPassion.getText());
                amountShakerPassion.setText(String.valueOf(tmpvar3-amount));
                break;
            case 4:
                int tmpvar4 = Integer.parseInt((String) amountMokai.getText());
                amountMokai.setText(String.valueOf(tmpvar4-amount));
                break;
            case 5:
                int tmpvar5 = Integer.parseInt((String) amountPepsi.getText());
                amountPepsi.setText(String.valueOf(tmpvar5-amount));
                break;
            case 6:
                int tmpvar6 = Integer.parseInt((String) amountMAX.getText());
                amountMAX.setText(String.valueOf(tmpvar6-amount));
                break;
            case 7:
                int tmpvar7 = Integer.parseInt((String) amountKondi.getText());
                amountKondi.setText(String.valueOf(tmpvar7-amount));
                break;
            case 8:
                int tmpvar8 = Integer.parseInt((String) amountKondiZero.getText());
                amountKondiZero.setText(String.valueOf(tmpvar8-amount));
                break;
            case 9:
                int tmpvar9 = Integer.parseInt((String) amountGroen.getText());
                amountGroen.setText(String.valueOf(tmpvar9-amount));
                break;
            case 10:
                int tmpvar10 = Integer.parseInt((String) amountClassic.getText());
                amountClassic.setText(String.valueOf(tmpvar10-amount));
                break;

            default:
                break;

        }

    }

    public void accept(View view) {

        accepted = false;
        amount = 0;
        itemCounter = 0;
        price = 0;
        itemID = 0;
        priceSum = 0;

        itemOne.setText("");
        itemTwo.setText("");
        itemThree.setText("");
        itemFour.setText("");
        itemFive.setText("");

        itemOneAmount.setText("");
        itemTwoAmount.setText("");
        itemThreeAmount.setText("");
        itemFourAmount.setText("");
        itemFiveAmount.setText("");

        itemOnePrice.setText("");
        itemTwoPrice.setText("");
        itemThreePrice.setText("");
        itemFourPrice.setText("");
        itemFivePrice.setText("");

        itemOneKr.setText("");
        itemTwoKr.setText("");
        itemThreeKr.setText("");
        itemFourKr.setText("");
        itemFiveKr.setText("");

        total.setText("");
        totalPrice.setText("");
        totalPriceKr.setText("");

        HideButtons();
        hidePrices();

        displayItem.setText("");

        AcceptButton.setVisibility(View.GONE);

    }
}