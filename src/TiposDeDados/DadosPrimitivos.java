package TiposDeDados;

public class DadosPrimitivos {
    static void main(String[] args) {
        /*
         * Dados Nao primitivos: int, double, float, char, boolean
         * Objeto da aula: Criar um ninja - Naruto -.
         * */

        int idade = 17; // Valor maximo: 2147483647
        double altura = 1.64;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 20137383647L; // Valor maximo: 9,223,372

        System.out.println(idade); // Comando para mostrar para o usu
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("saldo Bancario é = " + saldoBancario);
        System.out.println("Minha idade é: " + idade );
    }
}
