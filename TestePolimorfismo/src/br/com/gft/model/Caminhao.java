package br.com.gft.model;

public class Caminhao extends Veiculo {

	public Caminhao(String _marca, String _modelo, String _cor, float _km, boolean _isLigado, int _litrosCombustivel,
			int _velocidade, Double _preco) {
		super(_marca, _modelo, _cor, _km, _isLigado, _litrosCombustivel, _velocidade, _preco);

	}

	@Override
	public void acelerar() {
		if (this.isLigado == true) {
			this.velocidade += 20;
			this.litrosCombustivel -= 50;
			System.out.println("Você acelerou. A velocidade atual é de " + this.velocidade + " quilometros por hora");
			System.out.println("O caminhão tem " + this.litrosCombustivel + " litros de combustível");
		} else {
			System.out.println("Não é possivel acelerar com o carro desligado");
		}
	}

	public void abastecer(float qtdLitros) {
		int qtd = (int) qtdLitros;
		if (this.litrosCombustivel >= 15000) {
			this.litrosCombustivel = 15000;
		} else {
			this.litrosCombustivel += qtd;
			if (this.litrosCombustivel >= 15000) {
				this.litrosCombustivel = 15000;
			}
		}
		System.out.println("Você abasteceu. O caminhão tem agora " + this.litrosCombustivel + " litros de combustível");
	}

	@Override
	public void ligar() {
		if (this.isLigado == true) {
			System.out.println("O caminhão já está ligado");
		} else {
			this.isLigado = true;
			System.out.println("Você ligou o caminhão.");
		}
	}

	@Override
	public void desligar() {
		if (this.isLigado == false) {
			System.out.println("O caminhão está desligado");
		} else {
			this.isLigado = false;
			System.out.println("Você desligou o caminhão");
		}

	}

}
