package br.edu.univas.example;

public abstract  class Dialog {
	public void renderWindows() {
		System.out.println("Rendering windows...");
		Button okButton = createButton();
		okButton.render();
		okButton.onClick();
		System.out.println("Rendering windows successful...");
	}
	
	public abstract Button createButton();
}
