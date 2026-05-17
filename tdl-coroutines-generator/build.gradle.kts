plugins {
    alias(notation = catalog.plugins.gradle.application)
    alias(notation = catalog.plugins.jetBrains.kotlin.jvm)
}

application {
    mainClass = "dev.g000sha256.tdl.generator.TdlGeneratorKt"
}

kotlin {
    explicitApi()
    jvmToolchain(jdkVersion = 17)
}

dependencies {
    implementation(dependencyNotation = catalog.libraries.squareUp.kotlinPoet)
}
