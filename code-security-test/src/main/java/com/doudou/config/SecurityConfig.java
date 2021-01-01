package com.doudou.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author DouDou
 * @date 2021/1/1
 * @Description
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String encode = passwordEncoder.encode("123");
//        System.out.println(encode);
//        auth.inMemoryAuthentication().withUser("doudou").password("123").roles("ADMIN").and();
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage("/login.html")  // 跳转的登录页面
                .loginProcessingUrl("/user/login")  // 登录的url
                .defaultSuccessUrl("/test/index").permitAll() // 登录成功后访问的路径
            .and()
                .authorizeRequests()
                .antMatchers("/","/test/hello","/user/login").permitAll() // 不需要认证的路径
                .antMatchers("/test/index")
                .hasAuthority("admins")
                .anyRequest().authenticated() // 除上面的路径外 其他的路径都需要认证
            .and()
                .csrf().disable(); // 关闭scrf防护

    }
}
