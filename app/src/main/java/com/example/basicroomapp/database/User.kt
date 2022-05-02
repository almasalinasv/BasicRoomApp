package com.example.basicroomapp.database

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

class User(
    user_id: String,
    user_name: String,
    user_email: String,
    user_password: String
) {

    val user_id: String = user_id
    val user_name: String = user_name
    val user_email: String = user_email
    val user_password: String = user_password

}

fun User.toEntity() = UserEntity(
    user_id ,
    user_name,
    user_email,
    user_password
)