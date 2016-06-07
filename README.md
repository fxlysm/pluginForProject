# pluginForProject

#GsonFormat插件在android studio使用
*
#butterknife 插件在android studio使用
*添加lib至 `build.gradle`:

```groovy
apply plugin: 'android-apt'

android {
  ...
}

dependencies {
  compile 'com.jakewharton:butterknife:8.0.1'
  apt 'com.jakewharton:butterknife-compiler:8.0.1'
}
```
