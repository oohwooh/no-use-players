package com.oohwooh;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class NoUsePlayerTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(NoUsePlayerPlugin.class);
		RuneLite.main(args);
	}
}