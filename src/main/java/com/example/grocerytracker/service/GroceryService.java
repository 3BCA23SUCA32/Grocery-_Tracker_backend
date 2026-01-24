package com.example.grocerytracker.service;

import com.example.grocerytracker.model.GroceryItem;
import com.example.grocerytracker.repository.GroceryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryService {

    private final GroceryRepository repository;

    public GroceryService(GroceryRepository repository) {
        this.repository = repository;
    }

    public GroceryItem addItem(GroceryItem item) {
        return repository.save(item);
    }

    public List<GroceryItem> getAllItems() {
        return repository.findAll();
    }

    public GroceryItem updateItem(Long id, GroceryItem item) {
        GroceryItem existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found"));

        existing.setItemName(item.getItemName());
        existing.setQuantity(item.getQuantity());
        existing.setPurchased(item.isPurchased());

        return repository.save(existing);
    }


    public void deleteItem(Long id) {
        repository.deleteById(id);
    }
}
