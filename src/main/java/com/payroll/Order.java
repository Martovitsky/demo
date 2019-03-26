package com.payroll;

import lombok.*;

import javax.persistence.*;

import java.util.Date;
import java.util.List;


@Data
@Entity
@NoArgsConstructor
@Table(name = "orderTable", schema = "payroll")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String client;
    private String address;
    private Date date;


   @OneToMany(fetch = FetchType.EAGER, mappedBy = "order",cascade = CascadeType.REMOVE, orphanRemoval = true)
   private List<OrderLine> orderLineList;

    public Order(String client,  Date date, String address) {
        this.client = client;
        this.date = date;
        this.address = address;

    }

}