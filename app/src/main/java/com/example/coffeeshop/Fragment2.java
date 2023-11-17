package com.example.coffeeshop;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment2 extends Fragment {


    private CardView cardView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        cardView = view.findViewById(R.id.card1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Iced Coffee", "Regular brewed coffee that is cooled and served over ice. It can be sweetened and flavored to taste", R.drawable.cold1, 30.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card2);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Cold Brew", "Made by steeping coarsely ground coffee beans in cold water for an extended period, typically 12-24 hours. It's known for its smooth and less acidic flavor", R.drawable.cold2, 35.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card3);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Iced Latte", "Similar to a hot latte, but served over ice, with espresso, cold milk, and sometimes sweeteners", R.drawable.cold3, 40.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card4);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Frappuccino", "A blended coffee beverage often mixed with ice, milk, and flavorings, typically topped with whipped cream", R.drawable.cold4, 50.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card5);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Nitro Coffee", "Cold brew coffee infused with nitrogen gas, giving it a creamy texture and a frothy head when poured", R.drawable.cold5, 30.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card6);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Espresso Tonic", "A refreshing drink made with espresso shots and tonic water over ice, often garnished with citrus", R.drawable.cold6, 20.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card7);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Coffee Smoothie", "A combination of coffee, milk or yogurt, and fruits blended together for a creamy and fruity coffee drink", R.drawable.cold7, 40.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card8);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Coffee Milkshake", " A sweet and indulgent beverage made with coffee, ice cream, milk, and sometimes chocolate or caramel syrup", R.drawable.cold8, 30.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card9);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Vietnamese Iced Coffee", " A sweet and strong coffee made with condensed milk, poured over ice", R.drawable.cold9, 45.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card10);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Iced Mocha", " A cold coffee beverage with a combination of espresso, milk, and chocolate", R.drawable.cold10, 35.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });

        return view;
    }
}