package br.com.gft.model;

public class Aviao extends Veiculo {

	public Aviao(String _marca, String _modelo, String _cor, float _km, boolean _isLigado, int _litrosCombustivel,
			int _velocidade, Double _preco) {
		super(_marca, _modelo, _cor, _km, _isLigado, _litrosCombustivel, _velocidade, _preco);

	}

	@Override
	public void acelerar() {
		if (this.isLigado == true) {
			this.velocidade += 100;
			this.litrosCombustivel -= 200;
			System.out.println("Voc� acelerou. A velocidade atual � de " + this.velocidade + " quilometros por hora");
			System.out.println("O avi�o tem " + this.litrosCombustivel + " litros de combust�vel");
		} else {
			System.out.println("N�o � possivel acelerar com o avi�o desligado");
		}
	}

	public void abastecer(String qtdLitros) {
		int qtd = Integer.parseInt(qtdLitros);
		if (this.litrosCombustivel >= 300000) {
			this.litrosCombustivel = 300000;
		} else {
			this.litrosCombustivel += qtd;
			if (this.litrosCombustivel >= 300000) {
				this.litrosCombustivel = 300000;
			}
		}
		System.out.println("Voc� abasteceu. O avi�o tem agora " + this.litrosCombustivel + " litros de combust�vel");
	}

	@Override
	public void ligar() {
		if (this.isLigado == true) {
			System.out.println("O avi�o j� est� ligado");
		} else {
			this.isLigado = true;
			System.out.println("Voc� ligou o avi�o.");
		}
	}

	@Override
	public void desligar() {
		if (this.isLigado == false) {
			System.out.println("O avi�o est� desligado");
		} else {
			this.isLigado = false;
			System.out.println("Voc� desligou o avi�o");
		}

	}

}
