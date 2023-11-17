package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;



public class MainActivity extends AppCompatActivity {

    private TextView addtocartbtn;
    private TextView titleTxt, feeTxt, descriptionTxt, numberOrderTxt, vol;
    private ImageView plusBtn, minusbtn, picCoffee;
    private Drinks object;
    int numberOrder = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        picCoffee = findViewById(R.id.picCoffee);
        titleTxt = findViewById(R.id.titleTxt);
        feeTxt = findViewById(R.id.fee);
        descriptionTxt = findViewById(R.id.descriptionTxt);
        getBundle();
    }

    private void getBundle() {

        object = (Drinks) getIntent().getSerializableExtra("object");

        int drawableResourceId = this.getResources().getIdentifier(String.valueOf(object.getImageResourceId()), "drawable", this.getPackageName());
        Glide.with(this)
                .load(drawableResourceId)
                .into(picCoffee);

        titleTxt.setText(object.getTitle());
        feeTxt.setText("$" + object.getFee());
        descriptionTxt.setText(object.getDescription());
       /* numberOrderTxt.setText(String.valueOf(numberOrder));

       plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOrder = numberOrder+1;
                numberOrderTxt.setText(String.valueOf(numberOrder));
            }
        });

        minusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numberOrder>1){
                    numberOrder=numberOrder-1;
                }
                numberOrderTxt.setText(String.valueOf(numberOrder));
            }
        });
    }

   /* private void initView() {
        addtocartbtn = findViewById(R.id.addToCartBtn);
        titleTxt = findViewById(R.id.titleTxt);
        feeTxt = findViewById(R.id.fee);
        descriptionTxt = findViewById(R.id.descriptionTxt);
        numberOrderTxt = findViewById(R.id.numberOrderTxt);
        vol = findViewById(R.id.vol);
        plusBtn = findViewById(R.id.plusBtn);
        minusbtn = findViewById(R.id.minusBtn);
    }*/

    }
}
