package com.xbf97.shuucan

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
import com.xbf97.shuucan.ui.theme.ShuucanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShuucanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true,
    backgroundColor = 0xFF00FF00,
    //widthDp = 50, heightDp = 50
)
//@CombinedPreviews
@Preview(showSystemUi = true)

@Composable
fun DefaultPreview() {
    ShuucanTheme {
        Greeting("Android")
    }
}
/*
class UserPreviewParameterProvider : PreviewParameterProvider<User> {
    override val values = sequenceOf(
        User("Elise"),
        User("Frank"),
        User("Julia")
    )
}*/
/*
@Preview
@Composable
fun UserProfilePreview(
    @PreviewParameter(UserPreviewParameterProvider::class, limit = 2) user: User
) {
    UserProfile(user)
}*/

