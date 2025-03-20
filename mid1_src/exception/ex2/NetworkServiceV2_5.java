package exception.ex2;

public class NetworkServiceV2_5 {

    public void sendMessage(String data) {
        String address = "http://example.cpm";
        NetworkClientV2 cilent = new NetworkClientV2(address);
        cilent.initError(data); // 추가

        try {
            cilent.connect();
            cilent.send(data); // throw new RuntimeException("ex"); -> catch 대상이 아님 (client.disconnet 호출x)
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
        } finally {
            cilent.disconnect(); // 자원을 해제하는 흐름
        }
    }
}
