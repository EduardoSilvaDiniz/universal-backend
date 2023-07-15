import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dados {
    public String Titular, Data;
    public List<Long> CartaoNum = new ArrayList<>();
    public List<Long> NumSegure = new ArrayList<>();

    public Dados() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o nome do Titular : ");
        Titular = scanner.nextLine();
        LocalDateTime time = LocalDateTime.now();
        int year = time.getYear(), mes = time.getMonthValue();
        Data = (mes + 3) + "/" + (year + 5);
        gerarCartao();
    }

    private void gerarCartao() {
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            long num = random.nextInt(10);
            this.CartaoNum.add(num);
        }
        for (int i = 0; i < 3; i++) {
            long num = random.nextInt(10);
            this.NumSegure.add(num);
        }
        System.out.println(CartaoNum);
        System.out.println(NumSegure);
    }
}
