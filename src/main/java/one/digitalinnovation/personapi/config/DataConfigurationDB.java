package one.digitalinnovation.personapi.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Data
public class DataConfigurationDB {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("mysql")
    @Bean
    public String mysqlDatabaseConnection(){
        System.out.println("DB Connection for MYSQL ");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to MYSQL_TEST - Test instance ";
    }


    @Profile("postgresql")
    @Bean
    public String postgresqlDatabaseConnection(){
        System.out.println("DB Connection for PostgreSQL ");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to PostgreSQL_TEST - Test instance ";
    }

}