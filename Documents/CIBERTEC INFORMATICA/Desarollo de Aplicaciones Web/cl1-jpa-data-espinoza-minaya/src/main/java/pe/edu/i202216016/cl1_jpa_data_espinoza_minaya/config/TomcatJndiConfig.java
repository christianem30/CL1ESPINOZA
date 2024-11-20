package pe.edu.i202216016.cl1_jpa_data_espinoza_minaya.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatJndiConfig {

    @Bean
    public HikariDataSource hikariDataSource() {

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/world");
        config.setUsername("root");
        config.setPassword("123456");
        config.setDriverClassName("com.mysql.jdbc.Driver");

        //config
        config.setMaximumPoolSize(30);
        config.setMinimumIdle(4);
        config.setIdleTimeout(240000); //4min
        config.setConnectionTimeout(45000); //45 segundos

        return new HikariDataSource(config);
    }


}
