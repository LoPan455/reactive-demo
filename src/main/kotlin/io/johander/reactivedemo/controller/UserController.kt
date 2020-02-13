package io.johander.reactivedemo.controller

import io.johander.reactivedemo.model.User
import io.johander.reactivedemo.repository.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
@RequestMapping(path = ["/users"])
class UserController(
        val userRepository: UserRepository
) {

    @GetMapping(
            path = ["/"],
            produces = ["application/json"])
    fun getUsers(): List<User> {
        val ted = User("00716dd4-c028-4a30-ad9f-f03267a3f36e", "capreses@ovowin.biz", "Ted", "Capreses", null)
        val kim = User("72559a02-a3d7-474a-8026-d96eafc83b4f", "lorem@firasbizzari.com", "Kim","Lorem", null)
        return listOf(ted, kim)
    }

    @GetMapping(path = ["/{id}"],
            produces = ["application/json"])
    fun getUser(@PathVariable id: String): User {
        return User("72559a02-a3d7-474a-8026-d96eafc83b4f", "lorem@firasbizzari.com", "Kim","Lorem", null)
    }

    @PostMapping(path = ["/"],
            consumes = ["application/json"]
            )
    @ResponseStatus(HttpStatus.CREATED)
     suspend fun createUser(@RequestBody user: User): Any? {
        return userRepository.save(user).subscribe()
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    suspend fun updateUser(
            @PathVariable id: String,
            @RequestBody user: User
            ): User {
        return user
    }
}
