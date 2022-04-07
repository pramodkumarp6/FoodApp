package com.pramod.foodapp.model

import com.pramod.foodapp.db.entities.User

data class LoginResponse(
    val error: Boolean? ,
    val message: String? ,
    val user: User?
    )