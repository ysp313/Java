package com.wildcodeschool.myProjectWithSecurity.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests() 						// Define access control
                .antMatchers("/").permitAll()
                .antMatchers("/avengers/assemble").hasRole("CHAMPION")
                .antMatchers("/secret-bases").hasAnyRole("DIRECTOR")
                .anyRequest().authenticated()
                .and()
                .formLogin() // Add a login form with default configuration
        ;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser("Steve")
                .password(encoder.encode("CHAMPION"))
                .roles("CHAMPION")
                .and()
                .withUser("Nickflerken")
                .password(encoder.encode("DIRECTOR"))
                .roles("DIRECTOR");
    }
}