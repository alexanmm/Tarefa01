import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Main {

    public static void main(String[] arqs) {

        //1) Escrever o código do método Integer maiorDeTresNumeros(Integer
        //umNumeroA, Integer umNumeroB, Integer umNumeroC), que deve analisar
        //três números inteiros e retornar o maior deles.

        System.out.println("Maior Número: " + maiorDeTresNumeros(1, 20, 111));

    }

    public static Integer maiorDeTresNumeros(Integer umNumeroA, Integer umNumeroB, Integer umNumeroC){

        Integer maiorNumero = 0;

        if (umNumeroA >= umNumeroB ) {
            maiorNumero = umNumeroA;
        } else {
            maiorNumero = umNumeroB;
        }

        if (umNumeroC >= maiorNumero){
            maiorNumero = umNumeroC;
        }

        return maiorNumero;


    }
}