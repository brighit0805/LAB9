package com.example.lab9_20190802.repository;

import com.example.lab9_20190802.model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, Integer> {
}
