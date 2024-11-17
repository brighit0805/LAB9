package com.example.lab9_20190802.model;

public class Recipe {
    package com.example.lab9_20190802.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

    @Entity
    public class Recipe {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String name;
        private String category;
        private String instructions;
        private String imageUrl;

        // Getters y Setters
    }

}
