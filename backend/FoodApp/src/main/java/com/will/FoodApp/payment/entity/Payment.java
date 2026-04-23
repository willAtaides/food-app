package com.will.FoodApp.payment.entity;

import com.will.FoodApp.auth_users.entity.User;
import com.will.FoodApp.enums.PaymentGateway;
import com.will.FoodApp.enums.PaymentStatus;
import com.will.FoodApp.order.entity.Order;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tb_payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Enumerated(EnumType.STRING)
    private PaymentGateway paymentGateway;

    private String transactionId;

    private String failureReasons;

    private LocalDateTime paymentDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // The user who made the payment;
}
