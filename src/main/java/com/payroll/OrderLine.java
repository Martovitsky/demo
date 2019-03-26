package com.payroll;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orderLine", schema = "payroll")
public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn (name="orderId",referencedColumnName="id")
    private Order order;

    private Long goodsId;
    private int count;

    public OrderLine(Long goodsId, int count) {

        this.goodsId = goodsId;
        this.count = count;

    }


}
