package com.otakushelter.manga.android

import android.os.*
import androidx.activity.compose.*
import androidx.appcompat.app.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import com.otakushelter.manga.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    var counter by remember { mutableStateOf(Counter()) }
    MaterialTheme {
        Row {
            Button(onClick = {
                counter = counter.copy(count = counter.count - 1)
            }) {
                Text("-")
            }
            Text(counter.count.toString())
            Button(onClick = {
                counter = counter.copy(count = counter.count + 1)
            }) {
                Text("+")
            }
        }

    }
}
