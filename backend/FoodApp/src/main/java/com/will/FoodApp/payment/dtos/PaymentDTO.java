package com.will.FoodApp.payment.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.will.FoodApp.auth_users.dtos.UserDTO;
import com.will.FoodApp.enums.PaymentGateway;
import com.will.FoodApp.enums.PaymentStatus;
import com.will.FoodApp.order.dtos.OrderDTO;
import com.will.FoodApp.order.entity.Order;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDTO {

    private Long id;

    private Long orderId;

    private BigDecimal amount;

    private PaymentStatus paymentStatus;

    private PaymentGateway paymentGateway;

    private String transactionId;

    private String failureReasons;

    private LocalDateTime paymentDate;

    private boolean success;

    private OrderDTO order;

    private UserDTO user;

}
