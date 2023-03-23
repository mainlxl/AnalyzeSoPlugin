package com.mainli.plugin

import com.android.build.api.variant.ApplicationAndroidComponentsExtension
import org.codehaus.groovy.runtime.StringGroovyMethods
import org.gradle.api.Plugin
import org.gradle.api.Project


class AnalyzeSoPlugin : Plugin<Project> {

    private val name: String = "Analyze So Library"
    private lateinit var android: ApplicationAndroidComponentsExtension

    override fun apply(project: Project) {
        android = project.extensions.getByType(ApplicationAndroidComponentsExtension::class.java)
        android.onVariants { variant ->
            val variantName = variant.name
            val variantNameBycapitalize = StringGroovyMethods.capitalize(variantName)
            project.tasks.register(
                "analyze${variantNameBycapitalize}So",
                AnalyzeSoTask::class.java
            ) { task ->
                task.group = name
                task.variantName.set(project.provider { variantName })
                task.reportJSONDir.set(project.layout.buildDirectory.dir("outputs/analyze-so/${variantName}"))
            }
            project.tasks.register(
                "assembleAnalyze${variantNameBycapitalize}So",
                AnalyzeSoTask::class.java
            ) { task ->
                task.group = name
                task.dependsOn.add("assemble${variantNameBycapitalize}")
                task.variantName.set(project.provider { variantName })
                task.reportJSONDir.set(project.layout.buildDirectory.dir("outputs/analyze-so/${variantName}"))
            }
        }
    }
}