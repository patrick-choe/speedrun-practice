plugins {
    kotlin("jvm") version "1.5.21"
}

repositories {
    mavenCentral() // Tap, Kommand, etc.
    maven("https://papermc.io/repo/repository/maven-public/") // PaperMC
}

dependencies {
    compileOnly(kotlin("stdlib")) // Kotlin
    compileOnly("com.destroystokyo.paper:paper-api:1.16.1-R0.1-SNAPSHOT") // Paper
    compileOnly("io.github.monun:tap-api:4.1.2") // Tap
    compileOnly("io.github.monun:kommand-api:2.4.1") // Kommand
}

tasks {
    processResources {
        filesMatching("**/*.yml") {
            expand(project.properties)
        }
        filteringCharset = "UTF-8"
    }
    jar {
        archiveClassifier.set("dist")
        archiveVersion.set("")
    }
    create<Copy>("dist") {
        from(jar)
        into (".\\.server\\plugins")
    }
}