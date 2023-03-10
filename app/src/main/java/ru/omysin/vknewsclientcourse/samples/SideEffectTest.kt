package ru.omysin.vknewsclientcourse.samples

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun SideEffectTest(number: MyNumber) {
    Column {
        LazyColumn {
            repeat(5) {
                item {
                    Text(text = "Number: ${number.a}", color = Color.Black)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        number.a = 5
        LazyColumn {
            repeat(5) {
                item {
                    Text(text = "Number: ${number.a}", color = Color.Black)
                }
            }
        }
    }


}

data class MyNumber(var a: Int)