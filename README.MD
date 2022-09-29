# 分析so库来自那个库

配置：

```groovy
//在项目根目录中build.gradle添加如下
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
buildscript {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
    dependencies {
        ...
        classpath("com.github.Android-Mainli:AnalyzeSoPlugin:${last_version}")
    }
}

//在项目app module中添加应用
apply plugin: "analyze-so"
```

gradle命令执行

```shell
./gradlew :app:analyzeReleaseSo -q
```

会在`app/build/outputs/analyze-so/release`保存一份json输出
