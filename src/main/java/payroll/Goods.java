package payroll;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Data
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "Goods", schema = "")
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
