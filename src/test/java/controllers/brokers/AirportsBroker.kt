package controllers.brokers

import controllers.controllers.AirportsController
import mindf.ddata.controllers.Broker
import java.util.Properties

class AirportsBroker(override val controller: AirportsController, databaseProperties: Properties) : Broker(databaseProperties)