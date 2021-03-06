//package com.example.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//@Configuration
//public class WebSecurityConfig2 extends
//		WebSecurityConfigurerAdapter {
//	protected void registerAuthentication(AuthenticationManagerBuilder auth) throws Exception {
//			auth.inMemoryAuthentication().withUser("user") // #1
//					.password("password").roles("USER").and().withUser("admin") // #2
//					.password("password").roles("ADMIN", "USER");
//	}
//
//	
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/resources/**"); // #3 
//	}
//
//	
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/signup", "/about").permitAll() // #4 所有人都可以看到
//				.antMatchers("/admin/**").hasRole("ADMIN") // #6
//				.anyRequest().authenticated() // #7 其他用户都要认证
//				.and().formLogin() // #8  form表单登录
//				.loginPage("/login") // #9
//				.permitAll(); // #5
//	}
//}