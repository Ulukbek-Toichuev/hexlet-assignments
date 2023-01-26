package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Connected implements Connection {
    private final String status = "connected";
    @Override
    public String getCurrentState() {
        return status;
    }

    @Override
    public void connect(TcpConnection context) {
        System.out.println("Try to connect when connection already established. Message must contains word Error");
    }

    @Override
    public void disconnect(TcpConnection context) {
        context.setState(new Disconnected());
    }

    @Override
    public void write(String message) {
    }
}
// END
