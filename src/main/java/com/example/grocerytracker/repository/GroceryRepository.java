package com.example.grocerytracker.repository;

import com.example.grocerytracker.model.GroceryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroceryRepository extends JpaRepository<GroceryItem, Long> {
}
