package com.harisewak.composetour

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.harisewak.composetour.ui.theme.LearningTheme



class ComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Cube()
        }
    }
}

@Composable
fun Cube() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color.Black
            ),
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                color = Color.Green,
                text = "1"
            )
            Text(
                color = Color.Blue,
                text = "2"
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                color = Color.Yellow,
                text = "3"
            )
            Text(
                color = Color.Red,
                text = "4"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Cube()
}