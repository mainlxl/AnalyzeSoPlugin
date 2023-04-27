# 分析so库来自那个库
[![](https://jitpack.io/v/mainlxl/AnalyzeSoPlugin.svg)](https://jitpack.io/#mainlxl/AnalyzeSoPlugin)
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
        classpath("com.github.mainlxl:AnalyzeSoPlugin:version")
    }
}

//在项目app module中添加应用
apply plugin: "analyze-so"
```

gradle命令执行

```shell
demo配置了productFlavors可通过如下命令查看不同变体so
./gradlew  tasks 查看所有tasks 本插件分组为Analyze So Library tasks如下

...
Analyze So Library tasks
------------------------
analyzeFlavors1DebugSo
analyzeFlavors1ReleaseSo
analyzeFlavors2DebugSo
analyzeFlavors2ReleaseSo
assembleAnalyzeFlavors1DebugSo
assembleAnalyzeFlavors1ReleaseSo
assembleAnalyzeFlavors2DebugSo
assembleAnalyzeFlavors2ReleaseSo
...

//挑选一个task进行变体分析 如果之前未执行assemble相关任务时可能获取到的so不全 请改用assemble开头task执行打包并分析
./gradlew :app:analyzeFlavors1DebugSo -q

******************************************************************

如果项目未配置了productFlavors可通过如下命令查看不同变体so
./gradlew :app:analyzeDebugSo -q
./gradlew :app:analyzeReleaseSo -q
//上述两个命令如果之前未执行assemble相关任务时可能获取到的so不全，可以使用如下两个命令 先进行打包再执行分析
./gradlew :app:assembleAnalyzeDebugSo -q
./gradlew :app:assembleAnalyzeReleaseSo -q
```

会在`app/build/outputs/analyze-so/变体(release、debug、xxxxx)`保存一份json输出

```json
[
  {
    "name": "com.mainli:blur:1.0.0",
    "sofileList": [
      "/mips/libblur-lib.so",
      "/armeabi-v7a/libblur-lib.so",
      "/mips64/libblur-lib.so",
      "/x86/libblur-lib.so",
      "/arm64-v8a/libblur-lib.so",
      "/armeabi/libblur-lib.so",
      "/x86_64/libblur-lib.so"
    ],
    "path": "home/mainli/.gradle/caches/transforms-3/6552cde9ffd50b892b8858a97522b46b/transformed/blur-1.0.0/jni"
  }
]
```
> 参考[spotify ruler](https://github.com/spotify/ruler)进行实现
