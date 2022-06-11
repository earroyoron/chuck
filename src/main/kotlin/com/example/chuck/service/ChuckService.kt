package com.example.chuck.service

import com.example.chuck.controller.JokesService
import org.springframework.stereotype.Service
//import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
class ChuckNorrisJokes : JokesService {
    override fun getJoke() = "Hahaha"
}