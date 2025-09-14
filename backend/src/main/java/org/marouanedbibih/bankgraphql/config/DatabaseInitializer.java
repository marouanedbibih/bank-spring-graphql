
package org.marouanedbibih.bankgraphql.config;

import java.util.Arrays;
import java.util.Date;
import java.util.logging.Logger;

import org.marouanedbibih.bankgraphql.compte.Compte;
import org.marouanedbibih.bankgraphql.compte.CompteRepository;
import org.marouanedbibih.bankgraphql.compte.TypeCompte;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseInitializer {

    Logger logger = Logger.getLogger(getClass().getName());

    @Bean
    public CommandLineRunner initDatabase(CompteRepository compteRepository) {
        return args -> {
            compteRepository.saveAll(Arrays.asList(
                Compte.builder()
                    .solde(1000.0)
                    .dateCreation(new Date())
                    .type(TypeCompte.COURANT)
                    .build(),
                Compte.builder()
                    .solde(2000.0)
                    .dateCreation(new Date())
                    .type(TypeCompte.EPARGNE)
                    .build(),
                Compte.builder()
                    .solde(3000.0)
                    .dateCreation(new Date())
                    .type(TypeCompte.COURANT)
                    .build(),
                Compte.builder()
                    .solde(4000.0)
                    .dateCreation(new Date())
                    .type(TypeCompte.EPARGNE)
                    .build(),
                Compte.builder()
                    .solde(5000.0)
                    .dateCreation(new Date())
                    .type(TypeCompte.COURANT)
                    .build()
            ));

            logger.info("5 comptes have been inserted into the database.");
        };
    }
}
