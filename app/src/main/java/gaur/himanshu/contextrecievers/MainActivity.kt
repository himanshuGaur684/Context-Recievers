package gaur.himanshu.contextrecievers

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import gaur.himanshu.contextrecievers.ui.theme.ContextRecieversTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContextRecieversTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Logger().apply {
                        fake()
                        showLog()
                        this@MainActivity.showToast()
                        a()
                    }

                    this.showToast()
                    a()
                }
            }
        }
    }
}

context(Logger)
fun a() {

}

context(Logger)
fun Context.showToast() {

}


class Logger {
    fun showLog() {
        fake()
    }

    fun fake() {

    }
}












