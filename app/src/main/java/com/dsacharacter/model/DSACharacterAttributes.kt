package com.dsacharacter.model

class DSACharacterAttributes {

    var courage: Int = 0
    var sagacity: Int = 0
    var intuition: Int = 0
    var charisma: Int = 0
    var dexterity: Int = 0
    var agility: Int = 0
    var constitution: Int = 0
    var strength: Int = 0

    companion object {
        fun fromDTO(dto: Attr): DSACharacterAttributes {
            val characterAttributes = DSACharacterAttributes()
            characterAttributes.courage = dto.values[0].value
            characterAttributes.sagacity = dto.values[1].value
            characterAttributes.intuition = dto.values[2].value
            characterAttributes.charisma = dto.values[3].value
            characterAttributes.dexterity = dto.values[4].value
            characterAttributes.agility = dto.values[5].value
            characterAttributes.constitution = dto.values[6].value
            characterAttributes.strength = dto.values[7].value

            return characterAttributes
        }
    }
}