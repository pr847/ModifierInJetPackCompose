package com.prabhat.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.prabhat.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Column(
               modifier = Modifier
                   .background(Color.Green)
                   .fillMaxHeight(0.5f)
                   .fillMaxWidth()
                   //.padding(16.dp)

                   //.requiredWidth(600.dp)
                   //.padding(top = 50.dp)
                   .border(5.dp, Color.Magenta)
                   .padding(5.dp)
                   .border(8.dp, Color.Cyan)
                   .padding(8.dp)
                   .border(12.dp,Color.Transparent)
                   .padding(12.dp)



           ) {

               Text(text = "Hello"/*, modifier = Modifier.offset(0.dp,20.dp)*/
               , /*modifier = Modifier.border(5.dp, Color.Yellow)
                       .padding(5.dp)
                       .offset(20.dp,20.dp)
                       .border(8.dp,Color.Black)
                       .padding(8.dp)*/
               modifier = Modifier.clickable {  }
                   .height(40.dp))
               Spacer(modifier = Modifier.height(50.dp))
               Text(text = "World")

           }
        }
    }
}

