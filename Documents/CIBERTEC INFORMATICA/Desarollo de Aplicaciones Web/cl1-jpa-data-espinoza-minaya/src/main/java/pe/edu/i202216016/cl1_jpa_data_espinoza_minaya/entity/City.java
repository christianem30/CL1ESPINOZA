package pe.edu.i202216016.cl1_jpa_data_espinoza_minaya.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Integer ID;
    private String Name;
    private String CountryCode;
    private String District;
    private Integer Population;

}
