package ru.touchin.security.demo.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {

    @RequestMapping("settings", method = [RequestMethod.GET])
    fun getSettings(): String {
        return "OK settings"
    }

    @RequestMapping("help", method = [RequestMethod.GET])
    fun getHelp(): String {
        return "OK help"
    }

    @RequestMapping("profile", method = [RequestMethod.GET])
    fun getProfile(): String {
        return "OK profile"
    }

}
