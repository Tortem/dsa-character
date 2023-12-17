package com.dsacharacter

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun CharacterOverview() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painterResource(id = R.drawable.nameless), contentDescription = "", Modifier.align(
            Alignment.TopEnd))
        Column() {
            Text("Edwin Talham", fontSize = 25.sp)
            Text(text = "Hello")
            Text(text = "@strings/")
        }
    }
}

@Preview
@Composable
fun Background() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.mittlerer_wertekasten_lq),
            contentDescription = "defaultBackground",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
        CharacterOverview()
    }
}