package payroll;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(OrderRepository repository,GoodsRepository goodsRepository, Order_LineRepository order_lineRepository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar",30)));
            log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief",30)));
            log.info("Preloading " + repository.save(new Employee("Fo Bags", "thf",3)));
        };
    }

}

