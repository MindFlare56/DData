package controllers

import org.reflections.Reflections
import model.DData

object DataGenerator {

    fun build(aPackageObject: Any) {
        val packageName = aPackageObject.javaClass.getPackage().name
        for (_class in Reflections(packageName).getTypesAnnotatedWith(DData::class.java)) {
            for (field in _class.declaredFields) {
                if (field.isAnnotationPresent(DData::class.java)) {
                    println(field.name)
                }
            }
        }
    }
}
