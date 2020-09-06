package br.edu.univas.example;

public class MACDialog extends Dialog{

	@Override
	public Button createButton() {
		return new MACButton();
	}

}
