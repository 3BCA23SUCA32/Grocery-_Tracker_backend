package com.example.grocerytracker.model;

import jakarta.persistence.*;

@Entity
public class GroceryItem {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String itemName;
        private int quantity;
        private boolean purchased;

        // ✅ REQUIRED no-args constructor
        public GroceryItem() {
        }

        // getters & setters
        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getItemName() {
                return itemName;
        }

        public void setItemName(String itemName) {
                this.itemName = itemName;
        }

        public int getQuantity() {
                return quantity;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }

        public boolean isPurchased() {
                return purchased;
        }

        public void setPurchased(boolean purchased) {
                this.purchased = purchased;
        }
}
