package app

import Hero.JohnsonTank
import Hero.PowerTank

fun main() {
    val Johnson = JohnsonTank("Hero Johnson")

    //object class dari turunanmya
    val OoptimusPrimeJohnson = PowerTank("Skin OPtimus")
    OoptimusPrimeJohnson.Sayhello("OptimusPrimeJohnson")
}