package com.example.chuck

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@SpringBootApplication
class ChuckApplication

fun main(args: Array<String>) {
	runApplication<ChuckApplication>(*args)
}

@Configuration
class AppConfiguration {

	@Bean
	fun chuckNorrisBean() = ChuckNorrisQuotes()

}