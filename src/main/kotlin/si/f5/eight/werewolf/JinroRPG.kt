package si.f5.eight.werewolf

import org.bukkit.Bukkit
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin
import si.f5.eight.werewolf.command.AbstractCommand

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

    private fun registerCommands(name: String, command: AbstractCommand) {
        getCommand(name)?.setExecutor(command)
        getCommand(name)?.tabCompleter = command
    }
}