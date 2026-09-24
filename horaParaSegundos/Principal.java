import java.util.ArrayList;
import java.util.List;


public class Principal {
    public static void main(String[] args) {
        String hora = "20:37:57";
        String[] horarios = hora.split(":");

        List<Integer> novo_horario = new ArrayList<>();

        for (String numero : horarios) {
            int novos_numeros = Integer.parseInt(numero);
            novo_horario.add(novos_numeros);
        }

        int horas = novo_horario.get(0);
        int minutos = novo_horario.get(1);
        int segundos = novo_horario.get(2);

        int totalSegundos = (horas * 3600) + (minutos * 60) + segundos;

        System.out.println(totalSegundos);

    }
}
