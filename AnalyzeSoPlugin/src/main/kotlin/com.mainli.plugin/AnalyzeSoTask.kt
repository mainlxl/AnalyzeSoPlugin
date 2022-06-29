package com.mainli.plugin


import com.google.gson.GsonBuilder
import org.gradle.api.DefaultTask
import org.gradle.api.artifacts.Configuration
import org.gradle.api.attributes.Attribute
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.util.*

data class MoudleSoList(val name: String, val sofileList: List<String>, val path: String)
abstract class AnalyzeSoTask : DefaultTask() {


    @get:Input
    abstract val variantName: Property<String>

    @get:Input
    abstract val reportJSONDir: DirectoryProperty

    @TaskAction
    fun analyze() {
        val configuration = project.configurations.getByName("${variantName.get()}RuntimeClasspath")
        val result = parse(configuration)
        val outDir = reportJSONDir.asFile.get()
        outDir.mkdirs()
        val reportFile = outDir.resolve("analyze-so-report.json")
        val gson = GsonBuilder().setPrettyPrinting().create()
        val toJson = gson.toJson(result)
        println(toJson)
        reportFile.writeText(toJson)
    }

    fun parse(configuration: Configuration): List<MoudleSoList> {
        val artifactView = configuration.incoming.artifactView { viewConfiguration ->
            viewConfiguration.attributes { attributeContainer ->
                attributeContainer.attribute(
                    Attribute.of("artifactType", String::class.java),
                    "android-jni"
                )
            }
        }

        return artifactView.artifacts.artifacts.map { artifactResult ->
            val dirFile = artifactResult.file
            val absoluteFile = dirFile.absolutePath
            val length = absoluteFile.length
            val allFileByDir = getAllFileByDir(dirFile)
            val soList = allFileByDir.map { it.absolutePath.substring(length) }
            val displayName = artifactResult.id.componentIdentifier.displayName
            MoudleSoList(displayName, soList, absoluteFile)
        }.filter { it.sofileList.isNotEmpty() }
    }

    open fun getAllFileByDir(dirFile: File): List<File> {
        if (!dirFile.exists()) {
            return Collections.emptyList()
        }
        val listFiles = dirFile.listFiles()
        val list = ArrayList<File>()
        for (file in listFiles) {
            if (file.isDirectory) {
                list.addAll(getAllFileByDir(file))
            } else {
                list.add(file)
            }
        }
        return list
    }

}
