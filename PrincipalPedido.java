package Enun;

public class PrincipalPedido {

	public static void main(String[] args) {
		
		StatusPedido status = StatusPedido.ABERTO;
		StatusPedido status2 = StatusPedido.CANCELADO;
		StatusPedido status3 = StatusPedido.EM_ANDAMENTO;
		StatusPedido status4 = StatusPedido.ENTREGUE;
		
		System.out.println(status);
		System.out.println(status2);
		System.out.println(status3);
		System.out.println(status4);
	}

}
