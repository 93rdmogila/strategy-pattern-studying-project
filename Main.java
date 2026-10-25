public class Main{
	public static void main(String[] args) {
		Navigator navigator = new Navigator(new CarStrategy());
		navigator.execute("Home", "Uni");
		navigator.setStrategy(new WalkStrategy());
		navigator.execute("Home", "Park");
		navigator.setStrategy(new BusStrategy());
		navigator.execute("Uni", "Work");
	}
}