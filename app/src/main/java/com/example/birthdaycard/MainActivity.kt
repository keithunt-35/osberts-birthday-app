package com.example.birthdaycard

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayCardTheme {
                //  A surface container using the background color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    GreetingText(
                        message = "Happy Birthday Osbert!",
                        from = "from Keith",
                        modifier = Modifier.padding(8.dp)
                    )


                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier){
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ){
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 20.sp,
            modifier = Modifier.padding(16.dp).align(alignment = Alignment.End)
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier){

}


@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    BirthdayCardTheme {
        GreetingText(message = "Happy Birthday Osbert",from = "from Keith")
    }
}