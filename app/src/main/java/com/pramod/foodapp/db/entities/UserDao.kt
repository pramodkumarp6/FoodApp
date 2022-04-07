package com.pramod.foodapp.db.entities


import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(user: User):Long

   @Query("SELECT * FROM user WHERE  id= $CURRENT_USER_ID")
   fun getuser() : LiveData<User>



}