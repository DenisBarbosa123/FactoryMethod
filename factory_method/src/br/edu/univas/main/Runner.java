package br.edu.univas.main;

import static br.edu.univas.example.SO.LINUX;
import static br.edu.univas.example.SO.MAC;

import br.edu.univas.example.Dialog;
import br.edu.univas.example.LinuxDialog;
import br.edu.univas.example.MACDialog;
import br.edu.univas.example.SO;

public class Runner {
	static Dialog dialog;
	public static void main(String[] args) {
		System.out.println("Create linux dialog");
		initialize(LINUX);
		dialog.renderWindows();
		
		System.out.println("Create mac dialog");
		initialize(MAC);
		dialog.renderWindows();
	}
	
	public static void initialize(SO so) {
		switch (so) {
		case LINUX:
			dialog = new LinuxDialog();
			break;
		case MAC:
			dialog = new MACDialog();
			break;
		default:
			throw new ExceptionInInitializerError();
		}
	}
}
