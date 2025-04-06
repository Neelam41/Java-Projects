package com.ecommerce.sb_ecom.repositories;

import com.ecommerce.sb_ecom.com.ecommerce.sb_ecom.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// extends JpaRepository<Class, Primary Key type>
//@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
