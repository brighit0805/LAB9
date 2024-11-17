package com.example.lab9_20190802.service;

import com.example.lab9_20190802.model.Favorite;
import com.example.lab9_20190802.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;

    public void saveFavorite(Favorite favorite) {
        favoriteRepository.save(favorite);
    }
}
