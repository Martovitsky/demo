package com.payroll;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(OrderRepository repository,GoodsRepository goodsRepository, OrderLineRepository order_lineRepository) {
        return args -> {
            log.info("Preloading " + repository.save(new Order("Test", new Date(),"Rostov on Don")));
            log.info("Preloading " + goodsRepository.save(new Goods("Tomato", 3.5)));
            log.info("Preloading " + goodsRepository.save(new Goods("Cucumber", 10.5)));
            log.info("Preloading " + goodsRepository.save(new Goods("testo", 3000.5)));
            log.info("Preloading " + order_lineRepository.save(new OrderLine(1l,1l,25)));
        };
    }

}

