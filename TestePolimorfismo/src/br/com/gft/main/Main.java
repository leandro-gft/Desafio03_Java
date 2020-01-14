package br.com.gft.main;

import br.com.gft.model.Aviao;
import br.com.gft.model.Caminhao;
import br.com.gft.model.Carro;

public class Main {
	public static void main(String[] args) {
		Carro c1 = new Carro("Fiat", "Palio", "Azul", 1000, false, 0, 0, 15000.0);
		Aviao a1 = new Aviao("Boeing", "747", "Vermelho", 1000000, false, 0, 0, 15000.0);
		Caminhao cam1 = new Caminhao("Volvo", "FH400", "Verde", 10000, false, 0, 0, 15000.0);

		System.out.println("Apresentando métodos do carro: ");
		c1.ligar();
		c1.abastecer(50);
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.abastecer(10);
		c1.desligar();
		System.out.println();
		System.out.println("Apresentando métodos do avião: ");
		a1.ligar();
		a1.abastecer("100000");
		a1.acelerar();
		a1.acelerar();
		a1.acelerar();
		a1.acelerar();
		a1.abastecer("50000");
		a1.desligar();
		System.out.println();
		System.out.println("Apresentando métodos do caminhão: ");
		cam1.ligar();
		cam1.abastecer(1000f);
		cam1.acelerar();
		cam1.acelerar();
		cam1.acelerar();
		cam1.acelerar();
		cam1.abastecer(500f);
		cam1.desligar();

	}
}
