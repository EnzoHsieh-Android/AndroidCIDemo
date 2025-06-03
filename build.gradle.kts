// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}

// 定義專案層級的變數
ext {
    set("compileSdkVersion", 35)
    set("targetSdkVersion", 35)
    set("minSdkVersion", 26)
    set("versionCode", 1)
    set("versionName", "1.0.0")

    // 版本管理
    set("kotlinVersion", "2.0.21")
    set("gradleVersion", "8.10.0")
}

// 定義專案層級的變數
ext {
    set("compileSdkVersion", 35)
    set("targetSdkVersion", 35)
    set("minSdkVersion", 26)
    set("versionCode", 1)
    set("versionName", "1.0.0")

    // 版本管理
    set("kotlinVersion", "2.0.21")
    set("gradleVersion", "8.10.0")
}

// 自訂任務：顯示專案資訊
tasks.register("projectInfo") {
    group = "help"
    description = "顯示專案基本資訊"

    doLast {
        println("=== 專案資訊 ===")
        println("專案名稱: ${rootProject.name}")
        println("版本號: ${project.ext.get("versionName")}")
        println("版本代碼: ${project.ext.get("versionCode")}")
        println("目標SDK版本: ${project.ext.get("targetSdkVersion")}")
        println("最低SDK版本: ${project.ext.get("minSdkVersion")}")
        println("===============")
    }
}