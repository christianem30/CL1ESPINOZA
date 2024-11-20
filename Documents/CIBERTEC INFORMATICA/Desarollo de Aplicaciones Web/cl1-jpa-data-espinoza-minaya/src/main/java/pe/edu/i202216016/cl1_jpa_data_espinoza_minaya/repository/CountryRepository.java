package pe.edu.i202216016.cl1_jpa_data_espinoza_minaya.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.i202216016.cl1_jpa_data_espinoza_minaya.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {
}
