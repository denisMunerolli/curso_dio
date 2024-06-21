package one.digitalinnovation.gof.singleton;



import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;
import one.digitalinnovation.gof.strategy.comportamentoDefencivo;

public class Test {
	
	public static void main(String[] args) {
		
//		Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
			
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager= SingletonEager.getInstancia();
		System.out.println(eager);
		
		
		SingletonLazyHolder lazyHolder= SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		
//		Strategy ou comportamento
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new comportamentoDefencivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();			
		robo.mover();
		robo.mover();
		
		
//		Facede
		
		Facade facade = new Facade();
		facade.migrarCliente("Denis", "88036415");
		
		
		
	}

}
