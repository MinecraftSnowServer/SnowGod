package org.snowtec.mine.snowgod

import org.bukkit.plugin.java.JavaPlugin

/**
 * @author Davy
 */

class Godfather : JavaPlugin() {
    override fun onEnable() {
        server.logger.info { "SnowGod is up!!!" }
    }
}