package org.emsi.client.Dao;

import org.emsi.client.Bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientDao extends JpaRepository<Client,Long> {
}
