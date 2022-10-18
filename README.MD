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
./gradlew :app:analyzeDebugSo -q
./gradlew :app:analyzeReleaseSo -q
//上述两个命令如果之前未执行assemble相关任务时可能获取到的so不全，可以使用如下两个命令 先进行打包再执行分析
./gradlew :app:assembleAnalyzeDebugSo -q
./gradlew :app:assembleAnalyzeReleaseSo -q
```

会在`app/build/outputs/analyze-so/release(debug)`保存一份json输出

> 参考[spotify ruler](https://github.com/spotify/ruler)进行实现
