package com.tictactoe.main.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.tictactoe.main.TicTacToeMain;

public class DesktopLauncher {
	public static void main (String[] arg) {

		System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Campaign Buddy");

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1080;
		config.height = 675;
		new LwjglApplication(new TicTacToeMain(), config);
	}
}
