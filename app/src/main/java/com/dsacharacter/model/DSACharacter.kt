package com.dsacharacter.model

// this is a dataclass that holds the data of a DSA character
// the data is imported from a json file
// the data is used to fill the CharacterOverview composable

class DSACharacter {

    // the name of the character
    var name: String = ""

    // adventure points
    var ap: Int = 0

    // personal data as separate object
    var personalData: PersonalData = PersonalData()

    // attribute points as separate object
    var attributs: DSACharacterAttributes = DSACharacterAttributes()

    // a static function to create a character from a json string
    companion object {
        fun fromDTO(dto: CharacterDTO): DSACharacter {
            val character = DSACharacter()
            character.name = dto.name
            character.ap = dto.ap.total
            character.personalData = PersonalData.fromDTO(dto.pers)
            character.attributs = DSACharacterAttributes.fromDTO(dto.attr)

            return character
        }
    }
}