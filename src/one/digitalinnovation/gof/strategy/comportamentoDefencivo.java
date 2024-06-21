package one.digitalinnovation.gof.strategy;

public class comportamentoDefencivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se Defensivamente...");
	}
}
