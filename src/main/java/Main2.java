
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main2 {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 6666;

        try (Socket clientSocket = new Socket(host,port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))){
             final String ques1 = in.readLine();
            System.out.println(ques1);
            out.println("Тралл сын Дуротана");
            String que2 = in.readLine();
            System.out.println(que2);
            out.println("ЗА ОРДУ!");
            final String que3 = in.readLine();
            System.out.println(que3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;

    }
}