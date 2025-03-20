package exception.ex4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.cpm";
        NetworkClientV4 cilent = new NetworkClientV4(address);
        cilent.initError(data); // 추가

        try {
            cilent.connect();
            cilent.send(data);
        } finally {
            cilent.disconnect();
        }
    }
}
