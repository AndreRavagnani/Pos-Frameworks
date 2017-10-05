package fa7.distribuidora;

import javax.faces.bean.RequestScoped;

@RequestScoped
public class ControladorEstoqueSimples implements ControladorEstoque {

	@Override
	public String avaliarPedido(String mercadoria) {
		return "Pedido de Reserva para  " + mercadoria  + " - OK";
	}

}
