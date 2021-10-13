package com.harisewak.kotflinflows

import android.util.Log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

const val TAG = "KotlinFlowsHere"

const val NAME = "Kamlesh "

const val UPDATE_INTERVAL = 1000L

class Repository {

    val updatedNames = flow {
        var counter = 0
        while (true) {
            counter++
            emit("$NAME$counter")
            delay(UPDATE_INTERVAL)
        }
    }

    val flowOfUsers = flow {
        var index = -1

        while (index < users.size) {

            index++

            if (index == users.size) {
                index = 0
            }

            emit(users[index])

            delay(UPDATE_INTERVAL)

        }
    }

    private val users = listOf<User>(
        User("Kamlesh", 34, "Android Engineer"),
        User("Karthik", 32, "Android Engineer"),
        User("Gaurav", 30, "Android Engineer"),
        User("Vijay", 28, "Android Engineer"),
        User("Suraj", 30, "Android Engineer"),
        User("Chandrashekhar", 35, "Backend Engineer"),
        User("Mahesh", 34, "Backend Engineer"),
        User("Sanjay", 36, "Sr Backend Engineer"),
        User("Shrikant", 36, "Sr Android Engineer"),
        User("Akshay", 32, "Android Engineer"),
        User("Anuj", 32, "iOS Engineer"),
        User("Divya", 32, "iOS Engineer"),
        User("Sonali", 32, "iOS Engineer"),
        User("Archana", 32, "iOS Engineer"),
        User("Nida", 32, "Project Manager"),
        User("Nilesh", 35, "Mobile UI Designer"),
    )

}

data class User(
    var name: String,
    val age: Int,
    val occupation: String = "Professional"
)