package com.github.igrek;

import lombok.Value;

import java.util.List;

@Value
public class Recipe {
    String name;
    List<Ingredient> ingredientList;
    int amount;
}
