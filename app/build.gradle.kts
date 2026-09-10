plugins { id("com.android.application") }
dependencies { implementation("androidx.media3:media3-exoplayer:1.5.1"); implementation("androidx.media3:media3-exoplayer-hls:1.5.1"); implementation("androidx.media3:media3-ui:1.5.1") }
android { namespace="com.drama.nanas"; compileSdk=35
 defaultConfig { applicationId="com.drama.nanas"; minSdk=24; targetSdk=35; versionCode=2; versionName="1.1.0" }
 compileOptions { sourceCompatibility=JavaVersion.VERSION_1_8; targetCompatibility=JavaVersion.VERSION_1_8 }
 val p=System.getenv("NANASDRAMA_KEYSTORE_PATH"); if(!p.isNullOrBlank()){ signingConfigs { create("release"){storeFile=file(p);storePassword=System.getenv("NANASDRAMA_KEYSTORE_PASSWORD");keyAlias=System.getenv("NANASDRAMA_KEY_ALIAS");keyPassword=System.getenv("NANASDRAMA_KEY_PASSWORD")} }; buildTypes.getByName("release").signingConfig=signingConfigs.getByName("release") }
}
