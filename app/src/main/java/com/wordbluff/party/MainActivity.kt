package com.wordbluff.party

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WordBluffApp()
        }
    }
}

@Composable
fun WordBluffApp() {
    var word by remember { mutableStateOf("") }
    var role by remember { mutableStateOf("") }

    val words = listOf("Samosa", "Cricket", "Temple", "Laptop", "Chai")

    Column {
        Text("Word Bluff Party 🎭")

        Button(onClick = {
            val isBluffer = Random.nextBoolean()
            role = if (isBluffer) "BLUFFER" else "WORD"
            word = if (isBluffer) "" else words.random()
        }) {
            Text("Start Round")
        }

        Text("Role: $role")
        Text("Word: $word")
    }
}