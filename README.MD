# 分析so库来自那个库

配置：

```groovy
//在项目根目录中build.gradle添加如下
allprojects {
    repositories {
    	  ...
        maven { url "https://raw.githubusercontent.com/Android-Mainli/Maven/master" }
    }
}
buildscript {
    repositories {
        ...
        maven { url "https://raw.githubusercontent.com/Android-Mainli/Maven/master" }
    }
    dependencies {
      	...
        classpath("com.mainli.plugin:analyze-so:1.0.0")
    }
}

//在项目app module中添加应用
apply plugin: "analyze-so"
```

gradle命令执行

```shell
./gradlew :app:analyzeDebugSo -q
#或
./gradlew :app:analyzeReleaseSo -q
```
会在<module>/build/outputs保存一份json输出
