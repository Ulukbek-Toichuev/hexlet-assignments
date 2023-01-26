package exercise.connections;

// BEGIN
public class Disconnected implements Connection{
	
	private final String status = "disconnected";

	@Override
	public String getCurrentState(){
		return status;
	}

	@Override
	public void connect(TcpConnection context){
		context.setState(new Connected());
	}

	@Override
	public void disconnect(TcpConnection context){
		System.out.println("Try to disconnect when connection disconnected. Message must contains word Error")
	}

	@Override
	public void write(String message){
		System.out.println("Try to write to disconnected connection. Message must contains word Error");
	}

}
// END
