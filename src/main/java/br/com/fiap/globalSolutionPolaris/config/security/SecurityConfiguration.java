package br.com.fiap.globalSolutionPolaris.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.httpBasic()
                .and()
                .authorizeHttpRequests()

                // request api/mulher
                .antMatchers(HttpMethod.POST, "/api/mulher").permitAll()
                .antMatchers(HttpMethod.GET, "/api/mulher").permitAll()
                .antMatchers(HttpMethod.PUT, "/api/mulher/**").authenticated() // auth
                .antMatchers(HttpMethod.DELETE, "/api/mulher/**").authenticated() // auth
                .antMatchers(HttpMethod.GET, "/api/mulher/**").permitAll()

                // request api/local
                .antMatchers(HttpMethod.POST, "/api/localEscolhido").permitAll()
                .antMatchers(HttpMethod.GET, "/api/localEscolhido").permitAll()
                .antMatchers(HttpMethod.PUT, "/api/localEscolhido/**").authenticated() // auth
                .antMatchers(HttpMethod.DELETE, "/api/localEscolhido/**").authenticated() // auth
                .antMatchers(HttpMethod.GET, "/api/localEscolhido/**").permitAll()

                .anyRequest().permitAll()
                .and()
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .headers().frameOptions().disable();
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
