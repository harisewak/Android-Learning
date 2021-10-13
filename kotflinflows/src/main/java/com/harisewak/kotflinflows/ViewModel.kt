package com.harisewak.kotflinflows

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map

class CustomViewModel : ViewModel() {

    private val repository by lazy {
        Repository()
    }

    private var updateCount = 100

    val updatedNamesFlow: Flow<String> = repository
        .updatedNames
        .map {
            updateCount++

            if (updateCount % 2 == 0) {
                "$it updated: $updateCount Even"
            } else {
                "$it updated: $updateCount Odd"
            }

        }

    val usersFlow: Flow<User> = repository
        .flowOfUsers
        .filter {
            it.occupation.contains("Engineer")
        }.map {
            if (it.occupation.contains("android", ignoreCase = true)
                && !it.name.contains("Bro")
                && !it.name.equals("Kamlesh")
            ) {
                it.name += " Bro"
            }
            it
        }

}