package com.jahid.shoppingapp.domain.models

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val name: String = "",
    val category: String = "",
    val description: String = "",
    val price: Int = 0,
    val available_units: Int = 0,
    val brand: String = "",
    val size: List<String> = listOf(),
    val color: List<String> = listOf(),
    val discount: String = "",
    val image: String = ""
)