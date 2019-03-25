package com.miscbits.demo.entities

import javax.persistence.{Entity, GeneratedValue, Id}

@Entity
class User {

  @Id
  @GeneratedValue
  var id: Long = _
  var name: String = _
  var address: String = _
  var age: Integer = _



}
