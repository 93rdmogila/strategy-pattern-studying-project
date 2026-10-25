public class BusStrategy implements RouteStrategy{
	@Override 
	public void createRoute(String start, String finish){
		System.out.println("Creating route strategy by bus from " + start + " to " + finish);
	}
}
