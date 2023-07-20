import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class BalanceHistory {
    public List<Integer> Historico_deposito = new ArrayList<>();
    public List<Integer> Historico_saque = new ArrayList<>();
    public List<String> Historico_deposito_datahora = new ArrayList<>();
    public List<String> Historico_saque_datahora = new ArrayList<>();
    public void coletor(int tipo, int valor) {
        LocalDateTime time = LocalDateTime.now();
        if (tipo == 1) {
            int year = time.getYear(), mes = time.getMonthValue(), day = time.getDayOfMonth(), hora = time.getHour(), min = time.getMinute();
            Historico_deposito_datahora.add(day + "/" + mes + "/" + year + " " + hora + ":" + min);
            Historico_deposito.add(valor);
        } else {
            int year = time.getYear(), mes = time.getMonthValue(), day = time.getDayOfMonth(), hora = time.getHour(), min = time.getMinute();
            Historico_saque_datahora.add(day + "/" + mes + "/" + year + " " + hora + ":" + min);
            Historico_saque.add(valor);
        }
    }
    public void exibir(List<Integer> his, List<String> date) {
        for (int i = 0; i < his.size(); i++){
            System.out.println("Foi depositado : " + his.get(i) + "$" + " Na data e hora : " + date.get(i));
        }
    }
}
