package com.example.streetapispringboot.entity;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "districts")
public class District {
    @Id
    private String name;
    private Street street;
    @ManyToOne
    @JoinColumn(name = "street_name")
    private String cityOf;
    @MapsId("streetName")
    private String description;
    private LocalDateTime createdAt;
}
