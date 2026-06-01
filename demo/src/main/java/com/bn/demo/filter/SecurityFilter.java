package com.bn.demo.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // é usada para indicar que uma classe declara um ou mais métodos anotados com @Bean.
@EnableWebSecurity // ativa o suporte à segurança web da aplicação e a integração com o Spring MVC.
public class SecurityFilter {

    @Bean // indica que um método produz um objeto que deve ser gerenciado pelo contêiner do Spring.
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity){
        return httpSecurity.csrf(csrf -> csrf.disable())
                .sessionManagement(session ->
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(auth ->
                        auth.requestMatchers(HttpMethod.GET, "/produtos").permitAll()
                            .requestMatchers(HttpMethod.POST, "/produtos").permitAll()
                            .requestMatchers(HttpMethod.DELETE, "/produtos/**").permitAll()
                            .requestMatchers(HttpMethod.GET, "/produtos/**").permitAll()
                            .anyRequest().authenticated()
                )
                .build();
    }

}
