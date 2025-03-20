package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address = "http://example.cpm";
        NetworkClientV1 cilent = new NetworkClientV1(address);
        cilent.initError(data); // 추가

        cilent.connect();
        cilent.send(data);
        cilent.disconnect();
    }
}
