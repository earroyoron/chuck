package com.example.chuck.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class ChuckController() {

    lateinit var jokesService: JokesService

    fun funnyQuote(model: Model): String {
        model.addAttribute("joke", jokesService.getJoke() )

        return "index"

    }
}