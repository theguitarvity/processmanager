package com.facom.mrlopito.processmanager;

public class Main {
	public static void main(String[] args) {
		ProcessBuilder builder = new ProcessBuilder();
		for(int i = 0; i < 50; i ++)
			builder.create();
		builder.getProcess();
	}
}
