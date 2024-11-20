package pe.edu.i202216016.cl1_jpa_data_espinoza_minaya.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private String Code;
    private String Name;
    private String Continent;
    private String Region;
    private Double SurfaceArea;
    private Integer IndepYear;
    private Integer Population;
    private Double LifeExpectancy;
    private Double GNP;
    private Double GNPOld;
    private String LocalName;
    @Column(name = "GovernmentForm")
    private String GovernmentForm;
    private String HeadOfState;
    private Integer Capital;
    private String Code2;

}
