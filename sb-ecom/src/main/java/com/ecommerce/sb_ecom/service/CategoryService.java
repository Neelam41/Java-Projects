package com.ecommerce.sb_ecom.service;
import com.ecommerce.sb_ecom.com.ecommerce.sb_ecom.model.Category;

import java.util.List;

// use interface to promote modularity and loose coupling in code
public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);

    String deleteCategory(Long categoryId);

    Category updateCategory(Category category, Long categoryId);
}
