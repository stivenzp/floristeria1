package com.floristeria.floristeria.Configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((requests) -> requests
                .anyRequest().authenticated()  // Cualquier otra ruta requiere autenticación
            )
            .formLogin((form) -> form
                .loginPage("/main")  // Página personalizada para iniciar sesión
                .permitAll()  // Permite el acceso a todos a la página de login
            )
            .logout((logout) -> logout.permitAll());  // Permite que todos puedan cerrar sesión

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        @SuppressWarnings("deprecation")
        UserDetails user =
             User.withDefaultPasswordEncoder()
                .username("stiven")  // Nombre de usuario
                .password("123")  // Contraseña
                .roles("Admin")  // Rol de usuario
                .build();

        return new InMemoryUserDetailsManager(user);
    }
}
