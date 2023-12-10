package org.emsi.client;

import org.emsi.client.Bean.Client;
import org.emsi.client.Dao.ClientDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {
    @Bean
    CommandLineRunner initialiseClients(ClientDao clientDao)
    {
        return  args -> { clientDao.save(new Client(Long.parseLong("1"),"FAKE FRIEND 1",Float.parseFloat("23")));
            clientDao.save(new Client(Long.parseLong("2"),"FAKE FRIEND 2",Float.parseFloat("23")));

        };

    }

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}
