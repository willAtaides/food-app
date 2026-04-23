package com.will.FoodApp.order.entity;

import com.will.FoodApp.menu.entity.Menu;
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
@Table(name = "tb_order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;

@ManyToOne
@JoinColumn(name= "order_id")
private Order order;

@ManyToOne
@JoinColumn(name = "menu_id")
private Menu menu;

private int quantity;

private BigDecimal pricePerUnit;

private BigDecimal subtotal;
}