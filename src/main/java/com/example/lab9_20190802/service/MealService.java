package com.example.lab9_20190802.service;

import com.example.lab9_20190802.model.Meal;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class MealService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String SEARCH_URL = "https://www.themealdb.com/api/json/v1/1/search.php?s=";

    public List<Meal> searchMeals(String mealName) {
        String url = SEARCH_URL + mealName;
        MealResponse response = restTemplate.getForObject(url, MealResponse.class);
        return response != null ? response.getMeals() : null;
    }

    private static class MealResponse {
        private List<Meal> meals;

        public List<Meal> getMeals() {
            return meals;
        }

        public void setMeals(List<Meal> meals) {
            this.meals = meals;
        }
    }

}
