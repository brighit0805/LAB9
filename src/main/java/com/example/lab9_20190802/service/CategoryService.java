package com.example.lab9_20190802.service;

import com.example.lab9_20190802.model.Category;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CategoryService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String API_URL = "https://www.themealdb.com/api/json/v1/1/categories.php";

    public List<Category> getCategories() {
        // Llama al API y mapea la respuesta
        CategoryResponse response = restTemplate.getForObject(API_URL, CategoryResponse.class);
        return Arrays.asList(response.getCategories());
    }

    // Clase interna para mapear la respuesta del API
    private static class CategoryResponse {
        private Category[] categories;

        public Category[] getCategories() {
            return categories;
        }

        public void setCategories(Category[] categories) {
            this.categories = categories;
        }
    }
}
