package com.mirea.songservice.controller

import com.mirea.songservice.entity.Song
import com.mirea.songservice.service.SongService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/song")
class SongController(
        private val songService: SongService,

        ) {

    @PostMapping("/")
    fun saveSong(@RequestParam title: String, @RequestParam artistId: String): Song {
        return songService.saveSong(
            Song(
                id = UUID.randomUUID(),
                title = title,
                artistId = UUID.fromString(artistId)
            )
        )
    }

    @GetMapping("/{id}")
    fun getSongById(@PathVariable("id") songId: String): Song? {
        return songService.getSong(UUID.fromString(songId))
    }

    @GetMapping ("/__health/")
    fun  checkHealth():Boolean{
        return true
    }
}