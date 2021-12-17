plugins {
    java
    idea
}

group = "com.github.igrek"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val lombokVersion = "1.18.22"

dependencies {
    implementation("org.projectlombok:lombok:$lombokVersion")
    annotationProcessor("org.projectlombok:lombok:$lombokVersion")
}

tasks.compileJava {
    sourceCompatibility = "16"
    targetCompatibility = "16"
    options.encoding = "UTF-8"
}

