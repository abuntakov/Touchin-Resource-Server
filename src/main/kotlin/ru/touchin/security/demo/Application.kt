package ru.touchin.security.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application

fun main(args: Array<String>) {
	val app = SpringApplication(Application::class.java)
	app.run(*args)
}
