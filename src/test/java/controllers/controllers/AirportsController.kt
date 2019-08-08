package controllers.controllers

import org.json.JSONObject
import controllers.brokers.AirportsBroker
import models.Airports
import mindf.ktools.Tools.Companion.jsonToModel
import mindf.ddata.controllers.Facade
import java.util.*

class AirportsController(override val modelClass: Class<Airports>, databaseProperties: Properties) : Facade() {

    internal val broker = AirportsBroker(this, databaseProperties)
    internal var list: MutableList<Airports> = mutableListOf()

    @Suppress("UNCHECKED_CAST")
    override fun initList(jsonObjects: MutableList<JSONObject>) {
        list = jsonToModel(jsonObjects, modelClass) as MutableList<Airports>
    }
}