plugins {}

version = "0.0.1"

repositories {}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.6")

    implementation("io.springfox:springfox-boot-starter:3.0.0")

    implementation(project(":domain"))

    testImplementation("io.mockk:mockk:1.12.0")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.+")

    implementation("org.springframework.boot:spring-boot-starter-aop")

    implementation("io.github.microutils:kotlin-logging-jvm:3.0.4")
}