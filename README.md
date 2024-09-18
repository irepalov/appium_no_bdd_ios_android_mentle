# Инструкция по развертыванию рабочего окружения на Windows и MacOS, развертыванию проекта и локальному запуску тестов.
На данный момент в качестве платформы для запуска тестов, используются реальные девайсы.

[Инструкция по настройке реального девайса](https://wiki.corp.dev.vtb/pages/viewpage.action?pageId=187410676)

[Инструкция по загрузке тестируемого приложения](https://wiki.corp.dev.vtb/pages/viewpage.action?pageId=39039227)

## Развертывание среды разработки на Windows
### Установка Node.js
[Загрузите](https://nodejs.org/ru/download/) установочный пакет в формате `.msi` и запустите его. Следуйте инструкциям и установите пакет.  
Чтобы проверить, что установка прошла успешно, в Командной строке введите команду `npm -v`, которая покажет версию установленного NPM.
### Установка IntelliJ IDEA
[Загрузите](https://www.jetbrains.com/idea/download/) установочный файл и запустите его. Следуйте инструкциям и установите программу.

### Установка JDK
Откройте IntelliJ IDEA, перейдите во вкладку File - Project Structure - Project. Далее нажмите на выпадающий список в блоке Project SDK и выберите Add SDK - Download JDK. Версия: 1.8, вендор: Amazon corretto. Нажмите 'Download' и дождитесь установки.

### Установка Maven
Откройте Командную строку и введите команду `npm i maven`.

### Установка Appium server GUI
[Загрузите](https://github.com/appium/appium-desktop/releases) последний релиз программы и установите его.

### Установка Appium inspector
[Загрузите](https://github.com/appium/appium-inspector/releases) последний релиз программы и установите его.

### Установка Android Studio и Android SDK
[Загрузите](https://developer.android.com/studio) установочный файл и запустите его.

Во время установки Android Studio вам предложится установка Android SDK - установите необходимую версию.

### Добавление необходимых глобальных переменных.
Откройте поиск приложений и введите `Изменение системных переменных среды` и откройте его. Откроется окно "Свойство системы" на вкладке "Дополнительно". Нажмите "Переменные среды..."

Далее создайте 3 переменные:  
Имя: ANDROID_HOME  
Значение: <путь>/<до>/android/sdk

Имя: JAVA_HOME  
Значение: <путь>/<до>/JDK

Имя: ANDROID_SDK  
Значение: <путь>/<до>/android/sdk

Далее нужно изменить переменную PATH: добавьте в нее следующие строки:  
%ANDROID_HOME%\platform-tools  
%JAVA_HOME%\bin

### Проверка того, что все необходимые элементы установлены и настроены корректно
Установите appium-doctor с помощью npm: откройте Командную строку и введите команду `npm i appium-doctor`.
После установки, введите `appium-doctor --android`. В результате вы получите отчет, в котором будет видно, что все в порядке или необходимы дополнительные действия.

## Развертывание среды разработки на MacOS
### Установка Xcode и инструментов разработчика
Откройте `App Store` и установите приложение `Xcode`.  
Для установки инструментов разработчика, откройте Терминал и введите `xcode-select --install`.

### Установка Brew
Откройте `Терминал` и введите  
`/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"`.


### Установка Node.js
Откройте `Терминал` и введите  
`brew install npm`

### Установка Maven
Откройте `Терминал` и введите  
`npm install -g maven`

### Установка IntelliJ IDEA
[Загрузите](https://www.jetbrains.com/idea/download/) установочный файл и запустите его. Следуйте инструкциям и установите программу.

### Установка JDK
Откройте `IntelliJ IDEA`, перейдите во вкладку File - Project Structure - Project. Далее нажмите на выпадающий список в блоке Project SDK и выберите Add SDK - Download JDK. Версия: 1.8, вендор: Amazon corretto. Нажмите 'Download' и дождитесь установки.

### Установка Appium server GUI
[Загрузите](https://github.com/appium/appium-desktop/releases) последний релиз программы и установите его.

### Установка Appium inspector
[Загрузите](https://github.com/appium/appium-inspector/releases) последний релиз программы и установите его.

### Установка Android Studio и Android SDK
[Загрузите](https://developer.android.com/studio) установочный файл и запустите его.  
Во время установки Android Studio вам предложится установка Android SDK - установите необходимую версию.

### Добавление необходимых глобальных переменных.
Откройте загрузочный скрипт (например, .bash_profile) и добавьте туда следующие строчки:
```
export JAVA_HOME="/<путь>/<до>/JDK/Contents/Home"  
export ANDROID_HOME="/<путь>/<до>/Android/sdk"  
export PATH=~/Library/Android/sdk/tools:$PATH  
export PATH=~/Library/Android/sdk/platform-tools:$PATH  
export ANDROID_SDK=~/Library/Android/sdk  
export PATH=$ANDROID_SDK/emulator:$ANDROID_SDK/tools:$PATH
```

### Проверка того, что все необходимые элементы установлены и настроены корректно
Установите appium-doctor с помощью npm: откройте `Терминал` и введите команду `npm i appium-doctor`.
После установки, введите `appium-doctor`. В результате вы получите отчет, в котором будет видно, что все в порядке или необходимы дополнительные действия.

## Развертывание проекта
1. Клонируйте репозиторий
2. Откройте проект в `IntelliJ IDEA`
3. Отредактируйте файл `_global.config.json` в зависимости от своего тестового устройства.
4. Подключите к компьютеру подготовленный смартфон с включенной Check Point Capsule и установленным приложением "Мобильный банк ВТБ"
5. Запустите `Appium server`
6. Нажмите кнопку "Run test" около любого теста