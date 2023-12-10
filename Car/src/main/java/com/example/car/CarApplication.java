package com.example.car;


import Dao.CarDao;
import Bean.Car;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarApplication {

    @Bean
    CommandLineRunner initialiseClients(CarDao cardao)
    {
        return  args -> { cardao.save(new Car(Long.parseLong("1"),"FAKE FRIEND 1",Float.parseFloat("23")));
            cardao.save(new Car(Long.parseLong("2"),"FAKE FRIEND 2",Float.parseFloat("23")));

        };

    }



    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class, args);
    }

}
