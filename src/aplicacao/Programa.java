package aplicacao;



import java.util.Date;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pedido p1 = new Pedido(001, new Date(), Status.AGUARDANDO_PAGAMENTO);
		
		System.out.println(p1.toString());
		
		
		

	}

}
