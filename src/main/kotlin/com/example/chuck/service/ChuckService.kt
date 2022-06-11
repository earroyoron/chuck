package com.example.chuck.service

import com.example.chuck.controller.JokesService
import org.springframework.stereotype.Service
import guru.springframework.norris.chuck.ChuckNorrisQuotes
@Service
class ChuckJokes(val jokes: ChuckNorrisQuotes ) : JokesService {
    override fun getJoke(): String {
       return jokes.randomQuote
    }
}