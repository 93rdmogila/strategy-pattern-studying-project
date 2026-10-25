public class CarStrategy implements RouteStrategy{
	@Override 
	public void createRoute(String start, String finish){
		System.out.println("Creating route by car from " + start + " to " + finish);
	}
}