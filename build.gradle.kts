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
    set("kotlinVersion", "2.0.20")
    set("gradleVersion", "8.7.3")
}

// 清理任務
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
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


// 自訂任務：CI/CD流程驗證
tasks.register("cicdValidation") {
    group = "verification"
    description = "驗證CI/CD流程的完整性"

    doLast {
        println("=== CI/CD 流程驗證 ===")

        // 檢查關鍵檔案
        val keyFiles = listOf(
            ".github/workflows/ci.yml",
            ".github/workflows/release.yml",
            ".github/workflows/status.yml",
            "app/build.gradle.kts",
            "gradle.properties"
        )

        keyFiles.forEach { file ->
            val exists = rootProject.file(file).exists()
            println("${if (exists) "✅" else "❌"} $file")
        }

        // 檢查簽名配置
        val keystoreExists = rootProject.file("keystore.properties").exists()
        println("${if (keystoreExists) "✅" else "⚠️"} keystore.properties ${if (!keystoreExists) "(Release簽名將使用debug)" else ""}")

        println("=====================")
    }
}