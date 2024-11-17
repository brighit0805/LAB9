package com.example.lab9_20190802.controllers;
import com.example.lab9_20190802.model.Meal;
import com.example.lab9_20190802.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class MealController {
    @Autowired
    private MealService mealService;

    @GetMapping("/searchMeals")
    public String searchMeals(@RequestParam(name = "mealName", required = false) String mealName, Model model) {
        if (mealName != null && !mealName.isEmpty()) {
            List<Meal> meals = mealService.searchMeals(mealName);
            model.addAttribute("meals", meals);
        }
        return "mealSearch";
    }

    @GetMapping("/mealDetail")
    public String mealDetail(@RequestParam("mealName") String mealName, Model model) {
        List<Meal> meals = mealService.searchMeals(mealName);
        if (meals != null && !meals.isEmpty()) {
            model.addAttribute("meal", meals.get(0)); // Tomamos el primer resultado
        }
        return "mealDetail";
    }


}
