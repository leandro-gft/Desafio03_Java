package br.com.gft.model;

public class Carro extends Veiculo {

	public Carro(String _marca, String _modelo, String _cor, float _km, boolean _isLigado, int _litrosCombustivel,
			int _velocidade, Double _preco) {
		super(_marca, _modelo, _cor, _km, _isLigado, _litrosCombustivel, _velocidade, _preco);
	}

	@Override
	public void acelerar() {
		if (this.isLigado == true) {
			this.velocidade += 20;
			this.litrosCombustivel -= 1;
			System.out.println("Voc� acelerou. A velocidade atual � de " + this.velocidade + " quilometros por hora");
			System.out.println("O carro tem " + this.litrosCombustivel + " litros de combust�vel");
		} else {
			System.out.println("N�o � possivel acelerar com o carro desligado");
		}
	}

	public void abastecer(int qtdLitros) {
		if (this.litrosCombustivel >= 100) {
			this.litrosCombustivel = 100;
		} else {
			this.litrosCombustivel += qtdLitros;
			if (this.litrosCombustivel >= 100) {
				this.litrosCombustivel = 100;
			}
		}
		System.out.println("Voc� abasteceu. O carro agora tem " + this.litrosCombustivel + " litros de combust�vel");
	}

	@Override
	public void ligar() {
		if (this.isLigado == true) {
			System.out.println("O carro j� est� ligado");
		} else {
			this.isLigado = true;
			System.out.println("Voc� ligou o carro.");
		}
	}

	@Override
	public void desligar() {
		if (this.isLigado == false) {
			System.out.println("O carro est� desligado");
		} else {
			this.isLigado = false;
			System.out.println("Voc� desligou o carro");
		}

	}

}
