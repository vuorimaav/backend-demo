package com.vvv.vvdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.transaction.annotation.EnableTransactionManagement

@SpringBootApplication
@EnableTransactionManagement
class VvDemoApplication

fun main(args: Array<String>) {
	runApplication<VvDemoApplication>(*args)
}
