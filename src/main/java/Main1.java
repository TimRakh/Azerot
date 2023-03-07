import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Main1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Server starts");
        int port = 6666;
        try (ServerSocket serverSocket = new ServerSocket(port)) {  // порт можете выбрать любой в доступном диапазоне 0-65536. Но чтобы не нарваться на уже занятый - рекомендуем использовать около 8080
            while (true) {
                try (Socket clientSocket = serverSocket.accept(); // ждем подключения
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                    out.println("Приветстую тебя в Азероте,как твоё имя?");
                    final String que1 = in.readLine();
                    System.out.println(que1);
                    out.println(que1 + " ,идёт война за Азерот и пора выбрать ты Враг Альянса или друг");
                    final String que2 = in.readLine();
                    System.out.println(que2);
                    out.println("ЗА АЛЬЯНС!");
                }

            }
        }
    }
}