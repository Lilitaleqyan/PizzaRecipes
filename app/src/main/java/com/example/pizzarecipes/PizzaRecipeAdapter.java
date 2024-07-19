package com.example.pizzarecipes;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class PizzaRecipeAdapter extends RecyclerView.Adapter<PizzaRecipeAdapter.PizzaRecipeViewHolder>
{
    ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();
    Context context;

    public PizzaRecipeAdapter(ArrayList<PizzaRecipeItem> pizzaRecipeItems, Context context) {
        this.pizzaRecipeItems = pizzaRecipeItems;
        this.context=context;
    }

    @NonNull
    @Override
    public PizzaRecipeAdapter.PizzaRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_item,
                viewGroup, false);
        PizzaRecipeViewHolder pizzaRecipeViewHolder = new PizzaRecipeViewHolder(view);
        return pizzaRecipeViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull PizzaRecipeViewHolder viewHolder, int i) {
        PizzaRecipeItem pizzaRecipeItem = pizzaRecipeItems.get(i);
        viewHolder.pizzaImageView.setImageResource(pizzaRecipeItem.getPizzaImage());
        viewHolder.title.setText(pizzaRecipeItem.getTitle());
        viewHolder.description.setText(pizzaRecipeItem.getDescription());

    }
    @Override
    public int getItemCount() {
        return pizzaRecipeItems.size();
    }
 public  class PizzaRecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView pizzaImageView;
        public TextView title;
        public TextView description;
        public PizzaRecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            pizzaImageView = itemView.findViewById(R.id.pizzaImageView);
            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.descriptionTextView);
        }

     @Override
     public void onClick(View v) {
            int position=getAdapterPosition();
            PizzaRecipeItem pizzaRecipeItem=pizzaRecipeItems.get(position);
         Intent intent=new Intent(context,RecipeActivity.class);
         intent.putExtra("pizzaImageView",pizzaRecipeItem.getPizzaImage());
         intent.putExtra("title",pizzaRecipeItem.getTitle());
         intent.putExtra("description",pizzaRecipeItem.getDescription());
         intent.putExtra("recipe",pizzaRecipeItem.getRecipe());
         context.startActivity(intent);

     }
 }
    }

