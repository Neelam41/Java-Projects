package com.ecommerce.sb_ecom.controller;

import com.ecommerce.sb_ecom.com.ecommerce.sb_ecom.model.Category;
import com.ecommerce.sb_ecom.service.CategoryService;
import com.ecommerce.sb_ecom.service.CategorySeviceImp;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

    @RestController
    @RequestMapping("/api")
    public class CategoryController {

        @Autowired
        private CategoryService categoryService;

        @GetMapping("/public/categories")
        //@RequestMapping(value = "/public/categories", method = RequestMethod.GET)
        public ResponseEntity<List<Category>> getAllCategories(){
            List<Category> categories = categoryService.getAllCategories();
            return new ResponseEntity<>(categories, HttpStatus.OK);
        }

        @PostMapping("/public/categories")
        //@RequestMapping(value = "/public/categories", method = RequestMethod.POST)
        public ResponseEntity<String> createCategory(@Valid @RequestBody Category category){
            categoryService.createCategory(category);
            return new ResponseEntity<>("Category added successfully", HttpStatus.CREATED);
        }

        @DeleteMapping("/admin/categories/{categoryId}")
        public ResponseEntity<String> deleteCategory(@PathVariable Long categoryId){
            try {
                String status = categoryService.deleteCategory(categoryId);
                //return new ResponseEntity<>(status, HttpStatus.OK);
                //return ResponseEntity.ok(status);
                return ResponseEntity.status(HttpStatus.OK).body(status);
            } catch (ResponseStatusException e){
                return new ResponseEntity<>(e.getReason(), e.getStatusCode());
            }
        }


        @PutMapping("/public/categories/{categoryId}")
        public ResponseEntity<String> updateCategory(@RequestBody Category category,
                                                     @PathVariable Long categoryId){
            try{
                Category savedCategory = categoryService.updateCategory(category, categoryId);
                return new ResponseEntity<>("Category with category id: " + categoryId, HttpStatus.OK);
            } catch (ResponseStatusException e){
                return new ResponseEntity<>(e.getReason(), e.getStatusCode());
            }
        }
    }

