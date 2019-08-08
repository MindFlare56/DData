package models

import mindf.ddata.model.DData
import mindf.ddata.model.DModel

@DModel @DData class Airports {

    @DData lateinit var name: String
    @DData var latitude: Double? = null
    @DData var longitude: Double? = null
}