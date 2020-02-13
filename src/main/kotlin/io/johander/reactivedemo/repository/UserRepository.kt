package io.johander.reactivedemo.repository

import io.johander.reactivedemo.model.User
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : ReactiveCrudRepository<User, String> {
}
