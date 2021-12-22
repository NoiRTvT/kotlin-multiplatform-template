import androidx.compose.runtime.*
import com.otakushelter.manga.*
import org.jetbrains.compose.web.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun App() {
    var counter by remember { mutableStateOf(Counter()) }
    return Div({ style { padding(25.px) } }) {
        Button(attrs = {
            onClick { counter = counter.copy(count = counter.count - 1) }
        }) {
            Text("-")
        }
        Span({ style { padding(15.px) } }) {
            Text("${counter.count}")
        }
        Button(attrs = {
            onClick { counter = counter.copy(count = counter.count + 1) }
        }) {
            Text("+")
        }
    }
}

fun main() {
    renderComposable(rootElementId = "root") {
        App()
    }
}