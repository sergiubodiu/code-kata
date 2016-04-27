package io.pivotal.apac

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class CodeKataApplication

fun main(args: Array<String>) {
    SpringApplication.run(CodeKataApplication::class.java, *args)
}
