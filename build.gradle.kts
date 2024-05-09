import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    `java-library`
    id("xyz.jpenilla.run-paper") version "2.3.0"
    id("net.minecrell.plugin-yml.bukkit") version "0.6.0"
}

group = "com.kalimero2.team"
version = "1.0.0"
description = "Plugin Template"

repositories {
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper", "paper-api", "1.20.6-R0.1-SNAPSHOT")
    bukkitLibrary("cloud.commandframework", "cloud-paper", "1.8.4")
}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(21)
}

bukkit {
    main = "com.kalimero2.team.template.TemplatePlugin"
    apiVersion = "1.20.5"
    load = BukkitPluginDescription.PluginLoadOrder.STARTUP
    authors = listOf("Author")
}

tasks {
    runServer {
        minecraftVersion("1.20.6")
    }
    jar {
        manifest {
            attributes["paperweight-mappings-namespace"] = "mojang"
        }
    }
}
