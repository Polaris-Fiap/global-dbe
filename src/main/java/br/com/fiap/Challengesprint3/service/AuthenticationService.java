package br.com.fiap.Challengesprint3.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.fiap.Challengesprint3.model.Mulher;
import br.com.fiap.Challengesprint3.repository.MulherRepository;

@Service
public class AuthenticationService implements UserDetailsService {

    @Autowired
    MulherRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Mulher> mulher = repository.findByEmail(username);
        if (mulher.isPresent())
            return mulher.get();
        throw new UsernameNotFoundException("user not found " + username);
    }

}
