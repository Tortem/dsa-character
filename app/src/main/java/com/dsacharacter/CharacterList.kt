package com.dsacharacter

// this is a compose function which shows a list of multiple characters
// the list is scrollable
// when a character is clicked, the CharacterOverview composable is shown
// the is filled from a folder in the assets folder
// the folder contains json files with the data of the characters
// the data is imported into the app and used to fill the list

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share

import androidx.compose.material3.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.dsacharacter.model.CharacterDTO
import com.dsacharacter.model.DSACharacter
import com.google.gson.Gson
import kotlinx.serialization.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharacterList(onCharacterSelection: (DSACharacter) -> Unit) {
    val context = LocalContext.current
    val characterList = context.assets.list("characters")?.toList() ?: emptyList()
    val characterListSize = characterList.size

    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text(text = "Characters") },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Filled.Settings, contentDescription = "Settings")
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Filled.Share, contentDescription = "Share")
                }
            }
        )
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(characterListSize) { index ->
                CharacterListItem(characterList[index], onCharacterSelection)
            }
        }
    }
}

// this is a compose function which shows a single character
@OptIn(ExperimentalSerializationApi::class)
@Composable
fun CharacterListItem(characterName: String = "Edwin Talham", onCharacterSelection: (DSACharacter) -> Unit) {
    val context = LocalContext.current
    val characterData = context.assets.open("characters/$characterName").bufferedReader().use {
        it.readText()
    }
    var character = DSACharacter.fromDTO(Gson().fromJson(characterData, CharacterDTO::class.java))

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = MaterialTheme.shapes.medium,
        color = Color.Transparent,
        onClick =  {
            onCharacterSelection(character)
        }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = character.name,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = character.ap.toString(),
                modifier = Modifier.weight(1f)
            )
        }
    }
}