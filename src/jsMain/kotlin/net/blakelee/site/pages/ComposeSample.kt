package net.blakelee.site.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.text.Text
import net.blakelee.site.components.layouts.PageLayout
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.dom.Input

@Page
@Composable
fun ComposeSample() {
    val ctx = rememberPageContext()
    val name = ctx.params.getOrElse("name") { "Guest" }

    var valueToChange: String by remember { mutableStateOf("") }

    PageLayout("Compose Sample") {
        Text(name)
        Input(InputType.Text) {
            onInput { valueToChange = it.value }
        }
        Text(valueToChange)
    }
}