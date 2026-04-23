package com.will.FoodApp.order.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.will.FoodApp.auth_users.dtos.UserDTO;
import com.will.FoodApp.auth_users.entity.User;
import com.will.FoodApp.enums.OrderStatus;
import com.will.FoodApp.enums.PaymentStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDTO {

    private Long id;

    private LocalDateTime orderDate;

    private BigDecimal totalAmount;


    private OrderStatus orderStatus;


    private PaymentStatus paymentStatus;


    private UserDTO user; // Customer who is making/made the order

    private List<OrderItemDTO> orderItems;
}
