package com.wordbluff.party

import kotlin.random.Random

object GameEngine {
    val words = listOf("Samosa", "Auto", "Cricket", "Temple", "Phone")

    fun getWord(): String = words.random()

    fun isBluffer(): Boolean = Random.nextBoolean()
}