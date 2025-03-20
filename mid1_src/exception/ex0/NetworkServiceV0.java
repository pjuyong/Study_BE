package exception.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String data) {
        String address = "http://example.cpm";
        NetworkClientV0 cilent = new NetworkClientV0(address);

        cilent.connect();
        cilent.send(data);
        cilent.disconnect();
    }
}
