package com.dsacharacter

import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.dsacharacter.theme.TestTheme

@Composable
fun CharacterOverview() {
    Column() {
        Text(
            text = "Hello"
        )
        Text(
            text = "kaljsdf"
        )
    }

}

@Preview(showBackground = true)
@Composable
fun Background() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.mittlerer_wertekasten_lq),
            contentDescription = "defaultBackground",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
        TestTheme {
            CharacterOverview()
        }
    }
}