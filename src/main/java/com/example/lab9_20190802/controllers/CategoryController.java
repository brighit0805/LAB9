package com.example.lab9_20190802.controllers;
import com.example.lab9_20190802.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
    public class CategoryController {
        @Autowired
        private CategoryService categoryService;

        @GetMapping("/categories")
        public String listCategories(Model model) {
            // Obtén las categorías del servicio
            model.addAttribute("categories", categoryService.getCategories());
            return "categories";
        }
    }

