import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class LoadPage {
    public void getPage(URL url) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            // Imprime página no console
            System.out.println(inputLine);
        }
        in.close();
    }

    public static void main(String[] args) {
        // le a URL
        System.out.println("Digite a sua URL:\n");
        Scanner ler = new Scanner(System.in);
        String url_lida = ler.nextLine();
        System.out.println("Digite a porta:\n");
        int porta = ler.nextInt();
        try {
            URL url = new URL(url_lida +":"+porta);
            new LoadPage().getPage(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}