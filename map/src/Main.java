import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votacao = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String arquivo = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

            String linha = br.readLine();

            while (linha != null) {

                String[] fields = linha.split(",");
                String nome = fields[0];
                int votos = Integer.parseInt(fields[1]);

                if (votacao.containsKey(nome)) {

                    int votosAtuais = votacao.get(nome);
                    votacao.put(nome, votos + votosAtuais);

                } else {
                    votacao.put(nome, votos);
                }

                linha = br.readLine();
            }

            for (String key : votacao.keySet()) {
                System.out.println(key + ": " + votacao.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();

    }
}