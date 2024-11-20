package pe.edu.i202216016.cl1_jpa_data_espinoza_minaya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202216016.cl1_jpa_data_espinoza_minaya.repository.CountryRepository;

@SpringBootApplication
public class Cl1JpaDataEspinozaMinayaApplication implements CommandLineRunner {

	@Autowired
	CountryRepository CountryRepository;

	public static void main(String[] args) {

		SpringApplication.run(Cl1JpaDataEspinozaMinayaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CountryRepository.findAll().forEach(System.out::println);


	}
}
