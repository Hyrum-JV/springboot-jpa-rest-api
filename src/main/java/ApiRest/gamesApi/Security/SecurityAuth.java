package ApiRest.gamesApi.Security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityAuth {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(request -> request
                        .requestMatchers(HttpMethod.GET, "/juegos/**").permitAll()
                        .requestMatchers(HttpMethod.POST, "/juegos/**").authenticated()
                        .requestMatchers(HttpMethod.PUT, "/juegos/**").authenticated()
                        .requestMatchers(HttpMethod.DELETE, "/juegos/**").authenticated()
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults())
                .csrf(csrf -> csrf.disable());

        return http.build();
    }

    @Bean
    public UserDetailsService testUser(PasswordEncoder passwordEncoder) {
        User.UserBuilder user = User.builder();
        UserDetails user1 = user.username("admin1")
                .password(passwordEncoder.encode("abc123"))
                .roles("ADMIN") // Agregué "ADMIN" aquí como ejemplo, ya que roles() vacío puede causar un error.
                .build();

        return new InMemoryUserDetailsManager(user1);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
