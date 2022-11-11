package br.com.fiap.Challengesprint3.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.fiap.Challengesprint3.model.Mulher;
import br.com.fiap.Challengesprint3.model.Role;
import br.com.fiap.Challengesprint3.repository.LocalEscolhidoRepository;
import br.com.fiap.Challengesprint3.repository.MulherRepository;

@Configuration
public class DatabaseSeed implements CommandLineRunner {

    @Autowired
    MulherRepository mulherRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    LocalEscolhidoRepository localRepository;

    @Override
    public void run(String... args) throws Exception {
        mulherRepository.save(
                new Mulher()
                        .nome("Paula Pereira")
                        .email("paula@gmail.com")
                        .senha(passwordEncoder.encode("123"))
                        .dtNascimento("01/01/2000")
                        .cpf(123456789)
                        .cpfDigito(22)
                        .telefone(123456)
                        .telefoneDDD(11)
                        .role(new Role("ROLE_USER"))

        );

        // localRepository.save(
        // new LocalEscolhido()
        // .incidente("dois caras numa moto")
        // .dtOcorrencia("12/06/2006")
        // .avaliacaoPerigo(5)
        // .mulher(new Mulher(0,"silvia", "silvia@gmail.com", 123, new date))
        // );
    }

}
