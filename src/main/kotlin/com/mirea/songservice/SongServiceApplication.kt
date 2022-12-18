package com.mirea.songservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SongServiceApplication

fun main(args: Array<String>) {
	runApplication<SongServiceApplication>(*args)
}
