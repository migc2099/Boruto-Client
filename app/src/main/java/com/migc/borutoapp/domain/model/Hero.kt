package com.migc.borutoapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.migc.borutoapp.utils.Constants.HERO_DATABASE_TABLE
import kotlinx.serialization.Serializable

@Entity(tableName = HERO_DATABASE_TABLE)
@Serializable
data class Hero(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val rating: Double,
    val power: Int,
    val month: String,
    val day: String,
    val family: List<String>,
    val abilities: List<String>,
    val natureTypes: List<String>
)
