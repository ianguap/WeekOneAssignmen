package com.example.weekoneassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.weekoneassignment.ui.theme.WeekOneAssignmentTheme
import java.time.LocalDateTime

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeekOneAssignmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Ian Guapisaca")
                }
            }
        }
    }
}
@Composable
fun Greeting(name: String) {
    Text(text = "$name")
}
fun main(args: Array<String>) {
    val current = LocalDateTime.now()
    println("Current Date and Time is: $current")

    @Composable
    fun main(args: LocalDateTime) {
        val current = LocalDateTime.now()

        println("Current Date and Time is: $current")
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        WeekOneAssignmentTheme {
            Greeting("Ian Guapisaca")
            main(current)
        }
    }
}


