public class WalkStrategy implements RouteStrategy{
	@Override 
	public void createRoute(String start, String finish){
		System.out.println("Creating route strategy by walk from " + start + " to " + finish);
	}
}
