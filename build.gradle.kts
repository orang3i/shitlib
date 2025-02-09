plugins {
    id("java")
}

group = "us.and.everyone.else.who.wants.to.contribute"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

fun useSpigotRepo() {
    repositories {
        maven(url = "https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    }
}

fun ohAndAlsoUseSpigotAsDependency(version: String) {
    dependencies {
        implementation("org.spigotmc:spigot-api:${version}-R0.1-SNAPSHOT")
    }
}

useSpigotRepo()

// ...

// ...

ohAndAlsoUseSpigotAsDependency("1.8.8") // best version