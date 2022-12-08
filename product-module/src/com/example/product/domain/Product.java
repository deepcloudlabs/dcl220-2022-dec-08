package com.example.product.domain;

public record Product(int productId, String name, String description, byte[] photo, double price) {
}