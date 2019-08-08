import controllers.Facade
import mindf.ktools.RunnableTask
import mindf.ktools.Tools.Companion.getDatabaseProperties

class Test {

    init {
        var mainController: Facade? = null
        object : RunnableTask("Controllers filled...") {
            override fun run() {
                mainController = Facade()
                println("Loading data from server...")
            }
            override fun progress() {
                progressAfter(!mainController!!.airportsController.list.isNullOrEmpty(), "airports fill", 100)
                //atProgress(78, mainController!!::onFirstFetchDone, "sublist fill", 22)
            }
            override fun end() {

            }
        }.start(1000)
    }
}