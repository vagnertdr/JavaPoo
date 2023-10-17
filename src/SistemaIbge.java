public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome() + " - " + e.getIbge());
        }
        // Atribuindo a " eb " o nome de um estado brasileiro vindo da classe ENUM
        EstadoBrasileiro eb = EstadoBrasileiro.RIO_JANEIRO;
        System.out.println("");
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }

}
