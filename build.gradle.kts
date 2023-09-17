plugins {
    id("java")
}

group = "com.smartbrain"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.junit:junit-bom:5.9.1"))
    implementation("org.junit.jupiter:junit-jupiter")
    implementation("com.codeborne:selenide:6.17.0")
    testImplementation("org.testng:testng:7.5.1")
    implementation("org.seleniumhq.selenium:selenium-java:4.12.1")
    implementation("org.assertj:assertj-core:3.24.2")
    implementation("junit:junit:4.13.1")
    implementation("org.projectlombok:lombok:1.18.28")
    compileOnly("org.projectlombok:lombok:1.18.28")
}

tasks.test {
    useJUnitPlatform()
}
