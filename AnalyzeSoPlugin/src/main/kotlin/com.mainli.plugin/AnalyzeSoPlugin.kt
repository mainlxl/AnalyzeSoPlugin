package com.mainli.plugin

import com.android.build.gradle.AppExtension
import org.codehaus.groovy.runtime.StringGroovyMethods
import org.gradle.api.Plugin
import org.gradle.api.Project


class AnalyzeSoPlugin : Plugin<Project> {

    private val name: String = "mainli"
    private lateinit var android: AppExtension

    override fun apply(project: Project) {
        android = project.extensions.getByType(AppExtension::class.java)
        android.buildTypes.stream().map { it.name }.forEach {
            val variantName = StringGroovyMethods.capitalize(it)
            project.tasks.register(
                "analyze${variantName}So",
                AnalyzeSoTask::class.java
            ) { task ->
                task.group = name
                task.variantName.set(project.provider { it })
                task.reportJSONDir.set(project.layout.buildDirectory.dir("outputs/analyze-so/${it}"))
            }
            project.tasks.register(
                "assembleAnalyze${variantName}So",
                AnalyzeSoTask::class.java
            ) { task ->
                task.group = name
                task.dependsOn.add("assemble${variantName}")
                task.variantName.set(project.provider { it })
                task.reportJSONDir.set(project.layout.buildDirectory.dir("outputs/analyze-so/${it}"))
            }
        }
    }
}