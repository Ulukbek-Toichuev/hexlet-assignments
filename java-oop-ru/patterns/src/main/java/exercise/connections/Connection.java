package exercise.connections;

public interface Connection {
    // BEGIN
    public String getCurrentState();
    public void connect(TcpConnection context);
    public void dusconnect(TcpConnection context);
    public void write();
    // END
}
