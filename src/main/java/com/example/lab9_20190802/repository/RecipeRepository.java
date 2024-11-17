package com.example.lab9_20190802.repository;

import com.example.lab9_20190802.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
}
