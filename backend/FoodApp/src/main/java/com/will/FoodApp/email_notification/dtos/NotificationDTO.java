package com.will.FoodApp.email_notification.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.will.FoodApp.email_notification.entity.Notification;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotificationDTO {
    private Long id;

    private String subject;

    @NotBlank(message = "recipient is required")
    private String recipient; //Store the email address of the recipient

    private String body;

    private Notification type;

    private LocalDateTime createdAt;

    private boolean isHtml;

}
