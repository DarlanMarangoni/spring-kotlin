package com.darlanmarangoni.personal.finances

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PersonalFinancesApplication

fun main(args: Array<String>) {
	runApplication<PersonalFinancesApplication>(*args)
}
