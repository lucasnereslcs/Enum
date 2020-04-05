package aplicacao;

import java.util.Date;

public class Pedido {

	
	private int id;
	private Date data;
	private Status status;
	
	
	public Pedido() {
		
	}
	
	public Pedido(int id, Date data, Status status ) {
		
		
		this.id = id;
		this.data = data;
		this.status= status;
			
		
	}
	
	public int getId() {
		return id;
		
	}
	
	public Date getDate() {
		
		return data;
	}
	
	
	
	public Status getStatus() {
		
		return status;
	}

	@Override
	public String toString() {
		return "Pedido id=" + id + ", data=" + data + ", status=" + status + "";
	}

	
	
	
	
	
	
}
