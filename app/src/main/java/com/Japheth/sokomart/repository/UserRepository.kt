package com.Japheth.sokomart.repository

import com.Japheth.sokomart.data.UserDao
import com.Japheth.sokomart.model.User

class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}