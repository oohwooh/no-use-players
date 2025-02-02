package com.oohwooh;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("no-use-player")
public interface NoUsePlayerConfig extends Config {
    @ConfigItem(
            keyName = "whitelistItemsString",
            name = "Whitelist items",
            description = "Allow certain items to be used on players, separated by commas."
    )
    default String whitelistItemsString() {
        return "neutralising potion, " +
                "weapon store key, " +
                "broken shield, " +
                "half certificate, " +
                "yellow egg, " +
                "poisoned egg, " +
                "spiked/pois. egg, " +
                "omega egg, " +
                "old school bond";
    }
}