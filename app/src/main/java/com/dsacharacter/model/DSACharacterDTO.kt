package com.dsacharacter.model

data class CharacterDTO(
    val clientVersion: String,
    val dateCreated: String,
    val dateModified: String,
    val id: String,
    val phase: Int,
    val locale: String,
    val name: String,
    val ap: AP,
    val el: String,
    val r: String,
    val rv: String,
    val c: String,
    val p: String,
    val pv: String,
    val sex: String,
    val pers: Pers,
    val attr: Attr,
    val activatable: Activatable,
    val talents: Talents,
    val ct: CT,
    val spells: Spells,
    val cantrips: List<String>,
    val liturgies: Liturgies,
    val blessings: List<String>,
    val belongings: Belongings,
    val rules: Rules,
    val pets: Pets
)

data class AP(val total: Int)

data class Pers(
    val placeOfBirth: String,
    val hairColor: Int,
    val eyeColor: Int,
    val size: String,
    val weight: String,
    val socialStatus: Int,
    val cultureAreaKnowledge: String
)

data class Attr(
    val values: List<AttrValue>,
    val attributeAdjustmentSelected: String,
    val ae: Int,
    val kp: Int,
    val lp: Int,
    val permanentAE: PermanentAE,
    val permanentKP: PermanentKP,
    val permanentLP: PermanentLP
)

data class AttrValue(val id: String, val value: Int)

data class PermanentAE(val lost: Int, val redeemed: Int)

data class PermanentKP(val lost: Int, val redeemed: Int)

data class PermanentLP(val lost: Int)

data class Activatable(
    val adv50: List<Adv50>,
    val adv23: List<Adv23>,
    val adv42: List<Adv42>,
    val adv45: List<Adv45>,
    val disadv5: List<Any>,
    val disadv50: List<Disadv50>,
    val disadv26: List<Any>,
    val disadv38: List<Any>,
    val sa316: List<Sa316>,
    val sa29: List<Sa29>,
    val sa27: List<Sa27>,
    val sa76: List<Sa76>,
    val sa681: List<Any>,
    val sa70: List<Sa70>,
    val sa1331: List<Sa1331>
)

data class Adv50(val tier: Int)

data class Adv23(val tier: Int)

data class Adv42(val tier: Int)

data class Adv45(val tier: Int) // Update accordingly

data class Disadv50(val sid: Int, val tier: Int)

data class Sa316(val field: String) // Update accordingly

data class Sa29(val sid: Int, val tier: Int)

data class Sa27(val sid: Int)

data class Sa76(val field: String) // Update accordingly

data class Sa681(val field: String) // Update accordingly

data class Sa70(val sid: String)

data class Sa1331(val field: String) // Update accordingly

data class Talents(val field: String) // Update accordingly

data class CT(val field: String) // Update accordingly

data class Spells(val field: String) // Update accordingly

data class Liturgies(val field: String) // Update accordingly

data class Belongings(val field: String) // Update accordingly

data class Rules(val field: String) // Update accordingly

data class Pets(val field: String) // Update accordingly
