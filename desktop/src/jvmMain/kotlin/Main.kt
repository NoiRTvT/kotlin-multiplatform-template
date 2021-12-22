import androidx.compose.desktop.ui.tooling.preview.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.window.*
import com.otakushelter.manga.*

@Composable
@Preview
fun App() {
    var counter by remember { mutableStateOf(Counter()) }

    MaterialTheme {
        Row {
            Button(
                onClick = { counter = counter.copy(count = counter.count - 1) },

                ) {
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

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
