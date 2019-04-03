package com.greenfox.springsecurity2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class Config extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.inMemoryAuthentication()
                .withUser("devuser").password("{noop}dev").roles("USER").and()
                .withUser("adminuser").password("{noop}admin").roles("ADMIN", "USER");
    }

    //Authorization
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeRequests()
                .antMatchers("/protectedByUserRole*").hasRole("USER")
                .antMatchers("/protectedByAdminRole*").hasRole("ADMIN")
                .antMatchers("/", "/notProtected*").permitAll().and()
                .httpBasic();
    }

}
