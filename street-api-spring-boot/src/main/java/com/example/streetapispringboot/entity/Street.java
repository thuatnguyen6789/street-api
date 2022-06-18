package com.example.streetapispringboot.entity;

import com.example.streetapispringboot.entity.base.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "streets")

public class Street extends BaseEntity {
    @Id
    private String name;
    private String districtOf;
    private LocalDateTime createdAt;
    private String description;
    private int status;
}
