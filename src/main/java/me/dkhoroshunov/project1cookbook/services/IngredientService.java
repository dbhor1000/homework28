package me.dkhoroshunov.project1cookbook.services;

import me.dkhoroshunov.project1cookbook.model.Ingredient;

public interface IngredientService {

    Ingredient addIngredient(Ingredient ingredient);
    Ingredient getIngredient(long ingredientNumber);
    Ingredient editIngredient(long ingredientNumber, Ingredient ingredient);
    boolean deleteIngredient(long ingredientNumber);

}
