package exception.ex2;

public class NetworkServiceV2_3 {

    public void sendMessage(String data) {
        String address = "http://example.cpm";
        NetworkClientV2 cilent = new NetworkClientV2(address);
        cilent.initError(data); // 추가

        try {
            cilent.connect();
            cilent.send(data);
            cilent.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
        }
    }
}
