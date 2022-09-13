package com.tycoding.dictionary.feature_dictionary.domain.model

data class Meaning(
    val definition: List<Definition>,
    val partOfSpeech: String
)
