public class Exercicio03 {


    public static void main(String[] arqs) {


        //3) Escrever o código do método Boolean par(Integer umNumero), que deve
        //analisar um número inteiro e, caso ele seja par, retornar true, caso contrário,
        //retornar false.

        System.out.println(par(2));


    }

    public static Boolean par(Integer umNumero){

        return umNumero % 2 == 0;

    }

}
