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
import java.sql.Time
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

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
    Text(text = "$name " + LocalDateTime.now().toString())
}
@Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
    WeekOneAssignmentTheme {
        Greeting("Ian Guapisaca")
    }
}



