package com.grrenfox.springsecurityexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@EnableWebSecurity
@Configuration
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                //.antMatchers("**/rest/*")
                //.antMatchers("*/hello").hasRole("USER")
                .anyRequest()
                .permitAll()
                .and()
                .addFilterBefore(customFilter(), BasicAuthenticationFilter.class)
                //.fullyAuthenticated()
                //.and()
                .httpBasic();
        http.csrf().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("valentin").password("test").roles("USER").and()
                .withUser("demo").password("test2").roles("ADMIN");
    }

    @Bean
    public CustomFilter customFilter() {
        return new CustomFilter();
    }

}
