plugins {
    id("java")
    alias(libs.plugins.sonar)
}

sonar {
    properties {
        property("sonar.projectKey", "ch.gatzka:tarkov-master")
        property("sonar.organization", "philippgatzka")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}
