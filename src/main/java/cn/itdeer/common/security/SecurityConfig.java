package cn.itdeer.common.security;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * 描述：Security主配置
 * 创建人：Itdeer
 * 创建时间：2017/10/9 21:43
 */

//@EnableWebSecurity
//@EnableAutoConfiguration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService customUserService(){
        return new CustomUserService();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers("/resources/*","/common/**","/modules/**");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(customUserService());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.csrf()
                .disable().headers().frameOptions().disable();
        http.authorizeRequests()
                .antMatchers("/","/admin/login","/blog/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/admin")
                .failureUrl("/login?error")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

}
