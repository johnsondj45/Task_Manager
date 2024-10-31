package com.example.task_manager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.task_manager.ui.theme.Task_ManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Task_ManagerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    StartingImage(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Composable
fun Texts(textOne: String, textTwo: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = textOne,
            modifier = modifier,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = textTwo,
            modifier = modifier
        )

    }
}

@Composable
fun StartingImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier.fillMaxWidth()
        )
        Texts(
            textOne = stringResource(R.string.tasks_completed),
            textTwo = stringResource(R.string.nice_work),

            )
    }

}


