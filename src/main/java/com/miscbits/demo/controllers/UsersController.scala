package com.miscbits.demo.controllers

import com.miscbits.demo.repositories.UserRepository
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.stereotype.Controller
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.Model

@Controller
@RequestMapping(Array("/hotels"))
class UsersController @Autowired() (private val userRepository: UserRepository) {

  @RequestMapping(Array("/users"))
  def list(model: Model) = {
    val users = userRepository.findAll()
    model.addAttribute("users", users)
    "users"
  }
}
