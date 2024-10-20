package be.iccbxl.pid.reservationspringboot.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import org.springframework.data.annotation.Id;

import java.util.Set;

@Entity
public class Spectacle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String location;

    @OneToMany(mappedBy = "spectacle")
    private Set<Representation> representations;

    // Getters et setters
}
