package org.bukharov.infrastructure.core.services

import org.springframework.stereotype.Service

@Service
class GreetingsServiceImpl : GreetingsService {

    override fun getGreetings(): String {
        return Constants.GREETINGS
    }
}
