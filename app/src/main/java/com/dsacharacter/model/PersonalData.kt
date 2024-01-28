package com.dsacharacter.model

// data class for the following attributes:
//"placeofbirth": "Rommilys",
//"haircolor": 3,
//"eyecolor": 11,
//"size": "179",
//"weight": "87",
//"socialstatus": 2,
//"cultureAreaKnowledge": "Rommilys"

class PersonalData {

    var placeOfBirth: String? = ""
    var hairColor: Int = 0
    var eyeColor: Int = 0
    var size: Int = 0
    var weight: Int = 0
    var socialStatus: Int = 0
    var cultureAreaKnowledge: String = ""

    companion object {
        fun fromDTO(dto: Pers): PersonalData {
            val personalData = PersonalData()
            personalData.placeOfBirth = dto.placeOfBirth
            personalData.hairColor = dto.hairColor
            personalData.eyeColor = dto.eyeColor
            personalData.size = dto.size.toInt()
            personalData.weight = dto.weight.toInt()
            personalData.socialStatus = dto.socialStatus
            personalData.cultureAreaKnowledge = dto.cultureAreaKnowledge

            return personalData
        }
    }
}