package com.payroll;

import org.springframework.data.jpa.repository.JpaRepository;




interface GoodsRepository extends JpaRepository<Goods, Long> {

    Goods findByName(String name);


}