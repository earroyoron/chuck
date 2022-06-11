package com.example.chuck

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChuckApplication

fun main(args: Array<String>) {
	runApplication<ChuckApplication>(*args)
}
