package com.davidp.ejemploroom.data

class UserRepository (
   private val  userDao: UserDao
){
    suspend fun getUsers(): List<User>{
        val entities = userDao.getUsers()
        return entities.map {
            User(name = it.name)
        }
    }

    suspend fun insertUser(user: User){
        val entity = UserEntity(name = user.name)
        userDao.insertUser(entity)
    }
}