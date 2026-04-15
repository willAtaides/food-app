package com.will.FoodApp.menu.entity;

import com.will.FoodApp.category.entity.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tb_menus")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private  String description;
    private BigDecimal price;
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "category_id") //Link to the Category entity
    private Category category;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;


    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews;
}
