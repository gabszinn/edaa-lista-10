import java.util.PriorityQueue;
import java.util.Queue;

public class SistemaAtendimentoFilas {
    public static void main(String[] args) {
        Queue<Cliente> filaClientes = new PriorityQueue<>((c1, c2) -> c1.getTempoEspera() - c2.getTempoEspera());

        filaClientes.add(new Cliente("Cliente A"));
        filaClientes.add(new Cliente("Cliente B"));
        filaClientes.add(new Cliente("Cliente C"));

        Funcionario funcionario1 = new Funcionario("Funcionário 1");
        Funcionario funcionario2 = new Funcionario("Funcionário 2");

        while (!filaClientes.isEmpty()) {
            Cliente cliente = filaClientes.poll();
            System.out.println(funcionario1.getNome() + " atendeu " + cliente.getNome() +
            " (Tempo de espera: " + cliente.getTempoEspera() + " minutos)");
        }
    }
}
