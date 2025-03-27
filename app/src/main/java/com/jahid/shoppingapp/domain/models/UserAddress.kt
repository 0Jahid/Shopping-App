package com.jahid.shoppingapp.domain.models

data class UserAddress(
    val firstName: String = "",
    val lastName: String = "",
    val address: String = "",
    val city: String = "",
    val state: String = "",
    val zipCode: String = "",
    val country: String = "",
    val phoneNumber: String = ""
)
