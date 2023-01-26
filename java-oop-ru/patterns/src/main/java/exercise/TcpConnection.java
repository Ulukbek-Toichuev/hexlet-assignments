package exercise;

// BEGIN
public class TcpConnection {

	private String host;
	private int port;
	private Connection state = new Disconnected();

	public TcpConnection(String host, int port) {
		this.host = host;
		this.port = port;
	}

	public String getCurrentState() {
		return state.getCurrentState();
	}

	public void connect() {
		state.connect(this);
	}

	public void disconnect() {
		state.disconnect(this);
	}

	public void write(String message) {
		state.write(message);
	}

	public void setState(Connection connection) {
		this.state = connection;
	}

	public Connection getState() {
		return state;
	}

}
// END
