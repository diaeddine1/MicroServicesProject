package Bean;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    private  String marque;
    private String matricule;
    private String model;
    private Long id_client;
    @Transient @ManyToOne
    private Client client;
}
