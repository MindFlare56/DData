package controllers

import controllers.controllers.*
import mindf.ktools.Tools
import models.*

class Facade {

    private val defaultProperties = Tools.getDatabaseProperties("database.properties")
    internal val airportsController = AirportsController(Airports::class.java, defaultProperties)

    init {
        airportsController.broker.fetchAll()
    }
}