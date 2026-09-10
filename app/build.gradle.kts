plugins { id("com.android.application") }

android {
    namespace = "com.nanasdrama.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.nanasdrama.app"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }

    val keyStorePath = System.getenv("NANASDRAMA_KEYSTORE_PATH")
    if (!keyStorePath.isNullOrBlank()) {
        signingConfigs {
            create("release") {
                storeFile = file(keyStorePath)
                storePassword = System.getenv("NANASDRAMA_KEYSTORE_PASSWORD")
                keyAlias = System.getenv("NANASDRAMA_KEY_ALIAS")
                keyPassword = System.getenv("NANASDRAMA_KEY_PASSWORD")
            }
        }
        buildTypes.getByName("release").signingConfig = signingConfigs.getByName("release")
    }
}
