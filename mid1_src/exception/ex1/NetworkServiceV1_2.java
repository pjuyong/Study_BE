package exception.ex1;

public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        String address = "http://example.cpm";
        NetworkClientV1 cilent = new NetworkClientV1(address);
        cilent.initError(data); // 추가

        String connectResult = cilent.connect();
        // 결과가 성공이 아니다 => 오류다
        if(isError(connectResult)) {
            System.out.println("[네트워크 오류 발생]오류 코드 : " + connectResult);
            return;
        }

        String sendResult = cilent.send(data);
        if(isError(sendResult)) {
            System.out.println("[네트워크 오류 발생]오류 코드 : " + sendResult);
            return;
        }
        cilent.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
