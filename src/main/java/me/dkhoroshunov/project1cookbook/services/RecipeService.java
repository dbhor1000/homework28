package me.dkhoroshunov.project1cookbook.services;

import me.dkhoroshunov.project1cookbook.model.Ingredient;
import me.dkhoroshunov.project1cookbook.model.Recipe;

public interface RecipeService {

    Recipe addRecipe(Recipe recipe);
    Recipe getRecipe(long recipeNumber);
    Recipe editRecipe(long recipeNumber, Recipe recipe);
    boolean deleteRecipe(long recipeNumber);
    boolean getRecipes();


}