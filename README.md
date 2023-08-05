# FallenTech GUI API
## What is this?
This is a simple API for creating GUIs in Minecraft. It is designed to be used with the [FallenTech Network](https://fallentech.io/)

## How do I use it?
1. Download the latest JAR: https://github.com/FallenTechPE/NukkitGUIAPI/releases
2. Put it into your `plugins/` directory


Add it to your project's dependencies.
### Maven
```maven
<repositories>
    <repository>
        <id>fallentechpe-repo</id>
        <name>FallenTechPE Repository</name>
        <url>https://maven.pkg.github.com/FallenTechPE/NukkitGUIAPI</url>
    </repository>
</repositories>
```
### Gradle
```gradle
repositories {
    maven {
        url 'https://maven.pkg.github.com/FallenTechPE/NukkitGUIAPI'
    }
}

dependencies {
    implementation 'io.fallentech:GUI:0.0.1'
}
```

In your plugin's `onEnable()` method, add the following:
```
import io.fallentech.gui.GUI;

...

GUI.initalize();
```


Credits:
https://github.com/DenzelCode/FormAPI
https://github.com/ScarletRedMan/FormAPI
https://github.com/GeyserMC/Cumulus
