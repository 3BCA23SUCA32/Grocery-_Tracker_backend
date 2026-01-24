package com.example.grocerytracker.controller;
import com.example.grocerytracker.model.GroceryItem;
import com.example.grocerytracker.service.GroceryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/groceries")
@CrossOrigin(origins = "http://localhost:3000")


public class GroceryController {


        private final GroceryService service;

        public GroceryController(GroceryService service) {
            this.service = service;
        }

        // CREATE
        @PostMapping
        public GroceryItem addItem(@RequestBody GroceryItem item) {
            return service.addItem(item);
        }

        // READ
        @GetMapping
        public List<GroceryItem> getItems() {
            return service.getAllItems();
        }

        // UPDATE
        @PutMapping("/{id}")
        public GroceryItem updateItem(@PathVariable Long id,
                                      @RequestBody GroceryItem item) {
            return service.updateItem(id, item);
        }

        // DELETE
        @DeleteMapping("/{id}")
        public void deleteItem(@PathVariable Long id) {
            service.deleteItem(id);
        }
    }


