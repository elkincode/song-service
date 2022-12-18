package com.mirea.songservice.service

import com.mirea.songservice.entity.Song
import com.mirea.songservice.repository.SongRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class SongService(
        private val songRepository: SongRepository,
) {

    fun saveSong(jpaUser: Song): Song {
        return songRepository.save(jpaUser)
    }

    fun getSong(songId: UUID?): Song? {
        return songRepository.findById(songId)
    }
}