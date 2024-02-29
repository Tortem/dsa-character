package com.dsacharacter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.dsacharacter.model.DSACharacter
import com.dsacharacter.theme.CustomTestTheme

// this is the main activity
// it shows a list of all available characters
// when a character is clicked, the CharacterOverview composable is shown

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // set the content of the activity to the CharacterList composable
        setContent {
            CustomTestTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MainView()
                }
            }
        }
    }
}

@Composable
fun MainView() {
    val selectedCharacter = remember {mutableStateOf(DSACharacter())}

    if (selectedCharacter.value.name.isEmpty()) {
        CharacterList(onCharacterSelection = { character ->
            selectedCharacter.value = character
        })
    } else {
        CharacterOverview(character = selectedCharacter.value, onCharacterDeselect = {
            selectedCharacter.value = DSACharacter()
        })
    }
}