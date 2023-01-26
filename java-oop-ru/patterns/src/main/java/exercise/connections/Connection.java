package exercise.connections;

import exercise.TcpConnection;

public interface Connection {
    // BEGIN
    public String getCurrentState();
    public void connect(TcpConnection context);
    public void disconnect(TcpConnection context);
    public void write(String message);
    // END
}
