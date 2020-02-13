package io.johander.reactivedemo

import io.johander.reactivedemo.model.User
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.annotation.PostConstruct

@SpringBootApplication
class ReactiveDemoApplication

@PostConstruct

fun main(args: Array<String>) {
    runApplication<ReactiveDemoApplication>(*args)
    val ted = User("00716dd4-c028-4a30-ad9f-f03267a3f36e", "capreses@ovowin.biz", "Ted", "Capreses", null)
    val kim = User("72559a02-a3d7-474a-8026-d96eafc83b4f", "lorem@firasbizzari.com", "Kim","Lorem", null)
}
