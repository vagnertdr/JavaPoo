public class SistemaCadastro {
    public static void main(String[] args) {
        // Criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("MARCOS", "123");

        // definimos o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        // e como definir o nome e cpf de marcos ?

        // imprimindo o marcos sem nome e cpf

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
