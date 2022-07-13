package com.design.pattern.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private int id;
    private String productName;
    private double price;
    private boolean isAvailable;

    public static class ProductBuilder {
        private int id;
        private String productName;
        private double price;
        private boolean isAvailable;

        public ProductBuilder() {}

        public static ProductBuilder builder() {
            return new ProductBuilder();
        }

        public ProductBuilder(String productName, double price, boolean isAvailable) {
            this.productName = productName;
            this.price = price;
            this.isAvailable = isAvailable;
        }

        public ProductBuilder id(int id) {
            this.id = id;
            return this;
        }

        public ProductBuilder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public ProductBuilder price(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder isAvailable(boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }

        public Product build() {
            return new Product(id, productName, price, isAvailable);
        }
    }
}
