package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {

	private static class instanceHolder{
		public static SingletonLazyHolder instancea = new SingletonLazyHolder();
	}
	private SingletonLazyHolder() {
		super();
	}
	public static SingletonLazyHolder getInstancia() {
		return instanceHolder.instancea;
		
	}
}
