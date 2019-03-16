package payroll;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Set;


@Data
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "order_table", schema = "")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String client;
    private String address;
    private Date date;



   @OneToMany(fetch = FetchType.EAGER, mappedBy = "order",cascade = CascadeType.REMOVE, orphanRemoval = true)
   private List<Order_Line> order_lineList;



    public Order(String client,  Date date, String address) {
        this.client = client;
        this.date = date;
        this.address = address;

    }

}