package com.github.igrek;

import lombok.Value;

import java.util.List;

@Value
public class Menu {
    String name;
    List<Recipe> recipeList;
    String category;
}
