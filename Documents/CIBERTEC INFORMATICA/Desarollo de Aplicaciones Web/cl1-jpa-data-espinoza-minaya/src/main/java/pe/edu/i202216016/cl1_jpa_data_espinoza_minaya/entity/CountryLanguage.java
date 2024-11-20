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

public class CountryLanguage {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private String CountryCode;
    private String Language;
    private String isOfficial;
    private String Percentage;
}
