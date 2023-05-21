package hu.viberclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ViberClientApplication

fun main(args: Array<String>) {
    runApplication<ViberClientApplication>(*args)
}
