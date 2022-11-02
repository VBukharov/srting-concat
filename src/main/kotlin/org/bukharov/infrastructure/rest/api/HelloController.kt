package org.bukharov.infrastructure.rest.api

import org.bukharov.infrastructure.core.services.GreetingsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController @Autowired constructor(
    private val greetingsService: GreetingsService
) {

    @GetMapping("/hello")
    fun hello(): String {
        return greetingsService.getGreetings()
    }
}
