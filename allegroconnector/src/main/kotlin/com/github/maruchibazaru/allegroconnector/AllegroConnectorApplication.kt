package com.github.maruchibazaru.allegroconnector

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AllegroConnectorApplication

fun main(args: Array<String>) {
	runApplication<AllegroConnectorApplication>(*args)
}
