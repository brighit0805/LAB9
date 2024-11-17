package com.example.lab9_20190802.controllers;

import com.example.lab9_20190802.model.Favorite;
import com.example.lab9_20190802.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    @PostMapping("/addFavorite")
    public String addFavorite(@RequestParam int recipeId, Model model) {
        Favorite favorite = new Favorite();
        favorite.setRecipeId(recipeId);
        favoriteService.saveFavorite(favorite);
        return "redirect:/recipes";
    }
}
