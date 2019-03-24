package com.payroll;

import lombok.*;

import javax.persistence.*;


@Data
@Entity
@NoArgsConstructor
@Table(name = "Goods", schema = "payroll")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
