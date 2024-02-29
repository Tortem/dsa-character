package com.dsacharacter

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.dsacharacter.model.DSACharacter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
// TODO: 2021-10-14 17:00:00 @Olaf: Building overlay inspired by Opholit
fun CharacterOverview(character: DSACharacter, onCharacterDeselect: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        // a top app bar with the name of the character
        // and a return button
        TopAppBar(
            title = { Text(text = character.name) },
            navigationIcon = {
                IconButton(onClick = { onCharacterDeselect() }) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                }
            }
        )
        Box(modifier = Modifier.fillMaxSize().background(color = Color.Black)) {
            Image(painterResource(id = R.drawable.nameless), contentDescription = "", Modifier.align(
                Alignment.TopEnd))
            Column() {
                Text(text = "AP: " + character.ap.toString())
                Text(text = "Charisma: " + character.attributs.charisma.toString())
            }
        }
    }
}