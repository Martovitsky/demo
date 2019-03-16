package payroll;

import org.springframework.data.jpa.repository.JpaRepository;




interface GoodsRepository extends JpaRepository<Goods, Long> {

    Goods findByName(String name);


}