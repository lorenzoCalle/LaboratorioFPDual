package herencia;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		PFresco carrots = new PFresco(new Date(03 / 4 / 2021), 111, 0001);
		PFresco tomatoes = new PFresco(new Date(12 / 4 / 2021), 111, 002);
		PRefrigerado eggs = new PRefrigerado(new Date(22 / 5 / 2021), 222, 003);
		PRefrigerado meat = new PRefrigerado(new Date(12 / 4 / 2021), 111, 004);
		PCongelado beans = new PCongelado(new Date(16 / 11 / 2021), 233, 005, 4.0f, TipoCongelacion.AGUA);
		PCongelado lemonade = new PCongelado(new Date(16 / 11 / 2021), 233, 006, 4.0f, TipoCongelacion.AIRE);

		Gestion pedido1 = new Gestion(123);
		pedido1.definirMedio("online");
		
		pedido1.pedir(tomatoes);
		pedido1.pedir(meat);
		pedido1.pedir(lemonade);
		
		System.out.println(pedido1.mostrarPedido());
		
		Gestion pedido2 = new Gestion(234);
		pedido2.definirMedio("en tienda");
		
		pedido2.pedir(lemonade);
		pedido2.pedir(carrots);
		pedido2.pedir(eggs);
		pedido2.pedir(beans);
		System.out.println(pedido2.mostrarPedido());
	}

}
