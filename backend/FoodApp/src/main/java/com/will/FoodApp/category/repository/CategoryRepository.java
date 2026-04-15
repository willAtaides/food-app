package com.will.FoodApp.category.repository;

import com.will.FoodApp.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
