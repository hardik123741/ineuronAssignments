package com.guesser;

public class Player {

	private String player_Name;

	public String getPlayer_Name() {
		return player_Name;
	}

	public void setPlayer_Name(String player_Name) {
		this.player_Name = player_Name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private int number;

	public Player(String player_Name) {
		this.player_Name = player_Name;
	}

}
