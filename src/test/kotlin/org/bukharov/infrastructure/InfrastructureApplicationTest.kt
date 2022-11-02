package org.bukharov.infrastructure

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

@SpringBootTest
class InfrastructureApplicationTest @Autowired constructor(private val subject: ApplicationContext) {

    @Test
    fun contextLoads() {
        assertThat(subject).isNotNull
    }
}
