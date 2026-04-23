package com.will.FoodApp.order.repository;


import com.will.FoodApp.auth_users.entity.User;
import com.will.FoodApp.enums.OrderStatus;
import com.will.FoodApp.order.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    Page<Order> fyndByOrderStatus(OrderStatus orderStatus, Pageable pageable);

    List<Order> findByUserOrderDateDesc(User user);

    @Query("SELECT COUNT(DISTINCT o.user.id)FROM Order o")
    long countDistinctUsers();
}
