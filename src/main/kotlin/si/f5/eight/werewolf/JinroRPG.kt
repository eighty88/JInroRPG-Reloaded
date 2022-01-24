package si.f5.eight.werewolf

import org.bukkit.Bukkit
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class JinroRPG : JavaPlugin() {
    companion object {
        lateinit var INSTANCE: JinroRPG private set
    }

    override fun onEnable() {
        INSTANCE = this

        registerEventListeners(

        )
    }

    override fun onDisable() {

    }

    private fun registerEventListeners(vararg listeners: Listener) {
        listeners.forEach {
            Bukkit.getPluginManager().registerEvents(it, this)
        }
    }
}