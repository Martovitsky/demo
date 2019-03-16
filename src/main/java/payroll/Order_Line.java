package payroll;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order_line", schema = "")
public class Order_Line {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn (name="order_table",referencedColumnName="id")

    private Order order;

    /*@OneToOne(cascade=CascadeType.REMOVE)
    @JoinColumn (name="goods",referencedColumnName="id")
    private Goods goods;
    */
    private Long order_id;
    private Long goods_id;
    private int count;

    public Order_Line(Long order_id, Long goods_id, int count) {
        this.goods_id=order_id;
        this.goods_id = goods_id;
        this.count = count;

    }


}
