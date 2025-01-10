package com.ecommerce.exception;

public class CategoryNotFoundException extends Exception {
    public CategoryNotFoundException(String categoryNotFound) {
        super(categoryNotFound);
    }
}
