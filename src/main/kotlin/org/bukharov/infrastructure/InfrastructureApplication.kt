package org.bukharov.infrastructure

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class InfrastructureApplication

fun main(args: Array<String>) {
    runApplication<InfrastructureApplication>(args = args)
}
