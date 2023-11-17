package com.example.coffeeshop;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment3 extends Fragment {

    private CardView cardView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3, container, false);

        cardView = view.findViewById(R.id.card1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Affogato", "Espresso poured over a scoop of vanilla ice cream or gelato", R.drawable.special2, 30.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card2);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Cortado", "Equal parts espresso and steamed milk, creating a balanced and rich coffee flavor", R.drawable.special1, 20.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card3);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Flat White Coffee", "Originating from Australia and New Zealand, it's similar to a latte but typically features microfoam and a double shot of espresso", R.drawable.special3, 30.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card4);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Chai Latte", "A chai latte with a shot of espresso, combining the flavors of chai spices and coffee", R.drawable.special7, 25.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card5);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Coffee Cocktails", "Drinks like Espresso Martini, Irish Coffee, and White Russian, which blend coffee with spirits and other ingredients", R.drawable.special8, 40.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card6);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("caffe Marocchino", "Espresso shot, cocoa powder, and frothy milk served in an espresso cup", R.drawable.special6, 35.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        return view;
    }
}