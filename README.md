# Android CI/CD Demo

這是一個Android應用程式的CI/CD自動化部署學習專案，使用GitHub Actions進行持續整合和部署。

## 專案特色

- ✅ 完整的Android Gradle腳本配置
- ✅ GitHub Actions自動化建置
- ✅ 自動化測試執行
- ✅ APK自動建置和發布
- ✅ 版本管理自動化

## 技術堆疊

- **開發語言**: Kotlin
- **建置工具**: Gradle (Kotlin DSL)
- **CI/CD**: GitHub Actions
- **版本控制**: Git & GitHub

## 專案結構

```
AndroidCIDemo/
├── app/                    # 主應用程式模組
├── .github/workflows/      # GitHub Actions工作流程
├── gradle/                 # Gradle包裝器
├── build.gradle.kts        # 根層級建置腳本
├── settings.gradle.kts     # 專案設定
└── README.md              # 專案說明
```

## 本地開發

### 環境需求

- Android Studio 2023.1+
- JDK 11+
- Android SDK API 34+

### 建置指令

```bash
# 清理專案
./gradlew clean

# 建置Debug版本
./gradlew assembleDebug

# 建置Release版本
./gradlew assembleRelease

# 執行測試
./gradlew test

# 顯示專案資訊
./gradlew projectInfo
```

## CI/CD流程

1. **程式碼推送** → 觸發GitHub Actions
2. **環境準備** → 設定Android建置環境
3. **程式碼檢查** → 執行程式碼品質檢查
4. **單元測試** → 執行所有測試案例
5. **建置APK** → 建置Debug和Release版本
6. **工件上傳** → 保存建置產物

## 版本資訊

- 當前版本: v1.0.0
- 版本代碼: 1
- 最低Android版本: API 24 (Android 7.0)
- 目標Android版本: API 34 (Android 14)

## 授權

此專案僅供學習用途。