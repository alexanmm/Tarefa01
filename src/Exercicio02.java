public class Exercicio02 {

    public static void main(String[] arqs) {

        //2) Escrever o código do método Boolean cadeiasDeTextoDiferentes(String
        //umTextoA, String umTextoB), que deve analisar duas cadeias de texto e, caso
        //sejam diferentes, retornar true, ou, caso sejam iguais, retornar false.

        System.out.println("Resultado Falso:" + cadeiasDeTextoDiferentes("Teste1", "Teste1"));
        System.out.println("Resultado Verdadeiro:" + cadeiasDeTextoDiferentes("Teste1", "Teste2"));

    }

    public static Boolean cadeiasDeTextoDiferentes(String umTextoA, String umTextoB){

        return umTextoA != umTextoB;

    }


}
