package org.emsi.client.Controller;


import jakarta.ws.rs.Path;
import org.emsi.client.Bean.Client;
import org.emsi.client.Dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    ClientDao clientDao;

    @GetMapping("clients")
    public List findAll()
    {
        return clientDao.findAll();
    }

    @GetMapping("clients/{id}")
    public Client getByid(@PathVariable Long id) throws Exception
    {
        return clientDao.findById(id).orElseThrow(()-> new Exception("Client Does'nt exist"));


    }


}
