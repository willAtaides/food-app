package com.will.FoodApp.payment.repository;

import com.will.FoodApp.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
