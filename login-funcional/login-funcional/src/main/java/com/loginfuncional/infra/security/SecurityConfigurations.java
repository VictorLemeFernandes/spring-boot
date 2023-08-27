/*
 - Essa classe sera concentrada em manusear as configuracoes de seguranca.
*/

package com.loginfuncional.infra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfigurations {

    @Bean
    // Desabilita contra ataques CSRF pois o token JWT ja fara uma certa protecao
    // Coloca a autenticacao para stateless
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf(AbstractHttpConfigurer::disable)
                .sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .build();
    }

}