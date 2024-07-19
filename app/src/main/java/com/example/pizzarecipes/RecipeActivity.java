package com.example.pizzarecipes;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzarecipes.databinding.ActivityRecipeBinding;

import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        TextView  textView1=findViewById(R.id.titlerecipe);
        TextView textView2=findViewById(R.id.recipes);
        ImageView imageView=findViewById(R.id.imageview);
        Intent intent = getIntent();
        textView1.setText(intent.getStringExtra("title"));
        textView2.setText(intent.getStringExtra("recipe"));
       imageView.setImageResource(intent.getIntExtra("pizzaImageView",0));




    }
}