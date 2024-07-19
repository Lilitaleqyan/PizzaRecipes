package com.example.pizzarecipes;
class PizzaRecipeItem {
    private int pizzaImage;
    private String title;
    private String description;
    private  String recipe;


    PizzaRecipeItem(int pizzaImage, String title, String  description, String recipe) {
        this.pizzaImage=pizzaImage;
        this.description=description;
        this.title=title;
        this.recipe=recipe;


    }

    public int getPizzaImage() {
        return pizzaImage;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getRecipe() {
        return recipe;
    }
}
