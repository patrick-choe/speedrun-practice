package xyz.hyeontrick.speedrun

import org.bukkit.plugin.java.JavaPlugin

class SpeedrunPlugin : JavaPlugin() {
    companion object {
        lateinit var instance: SpeedrunPlugin
            private set
    }

    override fun onEnable() {
        instance = this
    }
}