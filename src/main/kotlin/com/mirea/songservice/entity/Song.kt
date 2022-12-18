package com.mirea.songservice.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
data class Song(
    @Id
    val id: UUID,
    val title: String,
    val artistId: UUID,
)