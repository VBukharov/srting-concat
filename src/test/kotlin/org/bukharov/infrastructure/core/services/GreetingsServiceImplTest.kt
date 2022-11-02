package org.bukharov.infrastructure.core.services

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class GreetingsServiceImplTest @Autowired constructor(private val subject: GreetingsService) {

    @Test
    fun getGreetings() {
        assertEquals(Constants.GREETINGS, subject.getGreetings())
    }
}
