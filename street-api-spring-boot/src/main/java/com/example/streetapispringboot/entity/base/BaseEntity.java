package com.example.streetapispringboot.entity.base;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    public abstract class BaseEntity {
        @CreatedDate
        private LocalDateTime createdAt;
    }
