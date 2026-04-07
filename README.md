# Small Stairs Updated (日本語)
このMODは小階段を追加します。<br />
1/3サイズの階段を追加します。あまりスペースを取らないので、階段を採掘した後にインストールすればスムーズに移動できます。
前提MOD: MCPitanLib, Architectury API (Fabric 26.1以降では不要) <br />
(Fabric Loaderの場合はFabric APIが必須)

1.12.2: https://www.curseforge.com/minecraft/mc-mods/smallstairs <br />
1.11.2: https://github.com/eyeq/mod-1.11.2-SmallStairs <br />
1.7.10: https://www.curseforge.com/minecraft/mc-mods/small-stairs <br />
origin: https://web.archive.org/web/20180927195210/http://minecraft125user.nisfan.net/forum/viewtopic.php?f=11&t=147
(これは125フォーラムのアーカイブですが、現在はダウンロードできません。)

このMODはさよさんの「SmallStairs125　小階段MOD」を再現しています。

## アドオン
* [Additional Small Stairs](https://www.curseforge.com/minecraft/mc-mods/additional-small-stairs)...バニラの小階段を追加するMOD

### 開発 (Fabric)
```build.gradle
repositories {
    maven { url 'https://maven.pitan76.net/' }
}

dependencies {
    modApi "net.pitan76:mcpitanlib-fabric-1.20.4:3.6.3"
    modApi "net.pitan76:smallstairs-fabric:1.2.2-SNAPSHOT"
}
```

# Small Stairs Updated (English)
The mod adds some small stairs. <br />
Add a 1/3 size stairs. It doesn't take up much space, so you can move it smoothly if you install it after mining the stairs.

Required mods: MCPitanLib, Architectury API (Not required for Fabric 26.1 or later) <br />
(When using on Fabric Loader, Fabric API is also required)

1.12.2: https://www.curseforge.com/minecraft/mc-mods/smallstairs <br />
1.11.2: https://github.com/eyeq/mod-1.11.2-SmallStairs <br />
1.7.10: https://www.curseforge.com/minecraft/mc-mods/small-stairs <br />
origin: https://web.archive.org/web/20180927195210/http://minecraft125user.nisfan.net/forum/viewtopic.php?f=11&t=147
(This is a forum archive, created in 1.2.5, but no longer available for download.)

This mod is based on Sayo's "SmallStairs125　小階段MOD".

## Addons
* [Additional Small Stairs](https://www.curseforge.com/minecraft/mc-mods/additional-small-stairs)...The mod adds vanilla small stairs

### Development (Fabric)
```build.gradle
repositories {
    maven { url 'https://maven.pitan76.net/' }
}

dependencies {
    modApi "net.pitan76:mcpitanlib-fabric-1.20.4:3.6.3"
    modApi "net.pitan76:smallstairs-fabric:1.2.2-SNAPSHOT"
}
``` 
