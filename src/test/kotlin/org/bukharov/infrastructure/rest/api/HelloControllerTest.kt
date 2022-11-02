package org.bukharov.infrastructure.rest.api

import org.assertj.core.api.Assertions.assertThat
import org.bukharov.infrastructure.core.services.Constants
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
internal class HelloControllerTest @Autowired constructor(private val restTemplate: TestRestTemplate) {

    @Test
    fun hello() {
        val entity = restTemplate.getForEntity<String>("/hello")
        assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(entity.body).isEqualTo(Constants.GREETINGS)
    }
}
