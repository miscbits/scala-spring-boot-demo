package com.miscbits.demo.repositories

import com.miscbits.demo.entities.User
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RestResource


@RestResource(rel = "users", path = "users")
trait UserRepository extends PagingAndSortingRepository[User, Long]{

}
