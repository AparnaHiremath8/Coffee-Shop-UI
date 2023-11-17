package com.example.coffeeshop;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Fragment1 extends Fragment {
    private CardView cardView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        // Find the CardView within the inflated layout
        cardView = view.findViewById(R.id.card1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Espresso", "A concentrated shot of coffee brewed by forcing hot water through finely-ground coffee beans", R.drawable.hot1, 30.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card2);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Cappuccino", " Espresso mixed with steamed milk and topped with a layer of milk foam", R.drawable.hot2, 20.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card3);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Latte", "Espresso with a larger amount of steamed milk and a small amount of milk foam", R.drawable.hot3, 15.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card4);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Americano", " Espresso diluted with hot water, resulting in a coffee that's similar in strength to drip coffee", R.drawable.hot4, 40.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card5);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Drip Coffee", "Made by dripping hot water over ground coffee beans, commonly prepared in coffee makers", R.drawable.hot5, 30.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card6);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Mocha", " A mix of espresso, steamed milk, and chocolate, often topped with whipped cream", R.drawable.hot6, 50.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card7);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Macchiato", "Espresso 'stained' or 'marked' with a small amount of frothy milk", R.drawable.hot7, 25.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card8);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Turkish Coffee", "Finely ground coffee beans simmered in water with sugar and sometimes cardamom", R.drawable.hot8, 60.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card9);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Ristrtto", "An even more concentrated form of espresso with a shorter extraction time", R.drawable.hot9, 45.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
        cardView = view.findViewById(R.id.card10);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drinks selectedDrink = new Drinks("Black Coffee", "Similar to an Americano, but with the espresso added to hot water", R.drawable.hot10, 35.0, "90ml");
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });


        return view;
    }

}