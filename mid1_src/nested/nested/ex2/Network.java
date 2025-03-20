package nested.nested.ex2;

public class Network {
    public void sendMessage(String text) {
        NetworkMessage msg = new NetworkMessage(text); // x001
        msg.print();
    }

    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
