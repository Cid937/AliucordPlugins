rootProject.name = "AliucordPlugins"

include(":Gnuify")
include(":HideBloat")
include(":Lyrics")
include(":NitroSpoof")
include(":ShowHiddenChannels")
include(":Stallman")

include(":DiscordStubs")
project(":DiscordStubs").projectDir = File("../repo/DiscordStubs")

include(":Aliucord")
project(":Aliucord").projectDir = File("../repo/Aliucord")