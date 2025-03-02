package com.example.layout2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.layout2.ui.theme.Layout2Theme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Layout2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Layout2()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout2(){
    Column(modifier = Modifier.fillMaxSize()) {
            TopAppBar(title = { Text("Modern Art UI")})

        Row(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.weight(1f)) {
                Box(modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth()
                    .background(Color(0xFF6A5ACD))) // Azul claro

                Box(modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xFFFF69B4))) // Rosa
            }
            
            Column(modifier = Modifier.weight(1f)) {
                Box(modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xFFB22222))) // Vermelho

                Box(modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xFFDCDCDC))) // Branco acinzentado

                Box(modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xFF00008B))) // Azul escuro
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Layout2Theme {
        Layout2()
    }
}