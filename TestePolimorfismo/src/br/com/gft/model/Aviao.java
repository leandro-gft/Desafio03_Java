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
			System.out.println("Você acelerou. A velocidade atual é de " + this.velocidade + " quilometros por hora");
			System.out.println("O avião tem " + this.litrosCombustivel + " litros de combustível");
		} else {
			System.out.println("Não é possivel acelerar com o avião desligado");
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
		System.out.println("Você abasteceu. O avião tem agora " + this.litrosCombustivel + " litros de combustível");
	}

	@Override
	public void ligar() {
		if (this.isLigado == true) {
			System.out.println("O avião já está ligado");
		} else {
			this.isLigado = true;
			System.out.println("Você ligou o avião.");
		}
	}

	@Override
	public void desligar() {
		if (this.isLigado == false) {
			System.out.println("O avião está desligado");
		} else {
			this.isLigado = false;
			System.out.println("Você desligou o avião");
		}

	}

}
