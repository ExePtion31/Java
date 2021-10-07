package mx.com.gm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    @Override
    //Creamos varios usuarios asignandoles nombre, pass y rol
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication().withUser("Admin").password("{noop}acm1ptchonta").roles("ADMIN", "USER")
                .and().withUser("User").password("{noop}1234").roles("USER");
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests().antMatchers("/editar/**", "/agregar", "/eliminar/**").hasRole("ADMIN")
                .antMatchers("/").hasAnyRole("USER", "ADMIN")
                .and().formLogin().loginPage("/login")
                .and().exceptionHandling().accessDeniedPage("/errores/403");
                
    }
}
