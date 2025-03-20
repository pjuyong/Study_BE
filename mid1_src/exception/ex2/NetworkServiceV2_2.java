package exception.ex2;

public class NetworkServiceV2_2 {

    public void sendMessage(String data) {
        String address = "http://example.cpm";
        NetworkClientV2 cilent = new NetworkClientV2(address);
        cilent.initError(data); // 추가

        try {
            cilent.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
            return;
        }

        try {
            cilent.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
            return;
        }

        cilent.disconnect();
    }
}
