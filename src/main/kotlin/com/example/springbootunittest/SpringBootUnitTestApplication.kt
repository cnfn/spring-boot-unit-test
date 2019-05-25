package com.example.springbootunittest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootUnitTestApplication : CommandLineRunner {
    @Autowired
    private lateinit var userService: UserService

	override fun run(vararg args: String?) {
		println(userService.getUser(12345L))
	}
}

fun main(args: Array<String>) {
	runApplication<SpringBootUnitTestApplication>(*args)
}