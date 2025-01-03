package com.github.ringoame196_s_mcPlugin

import com.github.ringoame196_s_mcPlugin.commands.Command
import com.github.ringoame196_s_mcPlugin.commands.TabCompleter
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    private val plugin = this
    override fun onEnable() {
        super.onEnable()
        val command = getCommand("teamvc")
        command!!.setExecutor(Command())
        command.tabCompleter = TabCompleter()
    }
}
