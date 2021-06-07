package br.com.queiroz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/*Basic Security Config*/
//@Configuration
//@EnableWebSecurity
//public class BasicSecurityConfigInMemory extends WebSecurityConfigurerAdapter {
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////		auth.inMemoryAuthentication().withUser("admin").password("$2a$10$L44rTH7Kr4fJKHofolR6OushTu9uYykeSLitNDIcm.QpN1K2oP862").roles("ADMIN");
//		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("ADMIN");
//	}
//	
//	//gerar senha codificada
////	public static void main(String[] args) {
////		System.out.print(new BCryptPasswordEncoder().encode("admin"));
////		//$2a$10$L44rTH7Kr4fJKHofolR6OushTu9uYykeSLitNDIcm.QpN1K2oP862
////	}
//	
////	@Bean
////	public BCryptPasswordEncoder passwordEncoder() {
////	    return new BCryptPasswordEncoder();
////	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//			.antMatchers("/categorias").permitAll()
//			.anyRequest().authenticated()
//			.and()
//			.httpBasic()
//			.and()
//			.sessionManagement()
//				.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//			.and()
//			.csrf().disable();
//	}
//}
