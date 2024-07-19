package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.util.LogPrinter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza1, Utils.PIZZA_1_TITLE, Utils.DESCRIPTION_1_PIZZA,Utils.RECIPE_1_PIZZA));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza2, Utils.PIZZA_2_TITLE, Utils.DESCRIPTION_2_PIZZA, Utils.RECIPE_2_PIZZA));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza3, Utils.PIZZA_3_TITLE, Utils.DESCRIPTION_3_PIZZA, Utils.RECIPE_3_PIZZA));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza4, Utils.PIZZA_4_TITLE, Utils.DESCRIPTION_4_PIZZA,Utils.RECIPE_4_PIZZA));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza5, Utils.PIZZA_5_TITLE, Utils.DESCRIPTION_5_PIZZA, Utils.RECIPE_5_PIZZA));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza6, Utils.PIZZA_6_TITLE, Utils.DESCRIPTION_6_PIZZA,Utils.RECIPE_6_PIZZA));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza7, Utils.PIZZA_7_TITLE, Utils.DESCRIPTION_7_PIZZA, Utils.RECIPE_7_PIZZA));
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        adapter = new PizzaRecipeAdapter(pizzaRecipeItems,this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}