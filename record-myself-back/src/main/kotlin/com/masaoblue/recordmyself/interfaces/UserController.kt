package com.masaoblue.recordmyself.interfaces

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/users")
class UserController {
    @GetMapping("/")
    fun me(): String {
        return "my name";
    }
}