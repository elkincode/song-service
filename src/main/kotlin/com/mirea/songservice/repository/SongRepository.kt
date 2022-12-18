package com.mirea.songservice.repository

import com.mirea.songservice.entity.Song
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*


@Repository
interface SongRepository : JpaRepository<Song?, UUID?> {
    fun findById(id: UUID?): Song?
}