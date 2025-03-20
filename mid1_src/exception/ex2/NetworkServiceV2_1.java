package exception.ex2;

public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.cpm";
        NetworkClientV2 cilent = new NetworkClientV2(address);
        cilent.initError(data); // 추가

        cilent.connect();
        cilent.send(data);
        cilent.disconnect();
    }
}
