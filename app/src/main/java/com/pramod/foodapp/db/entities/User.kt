package com.pramod.foodapp.db.entities
import androidx.room.Entity
import androidx.room.PrimaryKey

const val CURRENT_USER_ID =0

@Entity
data class User(
    var id:Int? = null,
    var name:String? = null,
    var email:String?  = null,
    var school:String?  = null
){
    @PrimaryKey(autoGenerate = false)
    var uid: Int = CURRENT_USER_ID
}
