package com.ecommerce.model;

import jakarta.annotation.security.DenyAll;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer discount;

    @OneToOne
    private HomeCategory category;


}
