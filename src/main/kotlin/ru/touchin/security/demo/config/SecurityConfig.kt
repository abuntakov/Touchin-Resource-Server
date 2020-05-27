package ru.touchin.security.demo.config

import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.web.servlet.invoke

@EnableWebSecurity
class SecurityConfig : WebSecurityConfigurerAdapter() {

    override fun configure(http: HttpSecurity) {
        http {
            oauth2ResourceServer {
                jwt { }
            }

            authorizeRequests {
                authorize("/profile", hasAuthority("SCOPE_email"))
                authorize("/settings", authenticated)
            }
        }
    }

}
