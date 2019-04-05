public class Exercicio04 {

    public static void main(String[] arqs) {


//4) Escrever um programa que imprima na tela os primeiros 100 números
//inteiros positivos ímpares.

        Integer[] arrayNumeros = new Integer[5000];
        Integer[] arrayRetornoNumeros = new Integer[1000];
        Integer cont = 0;

        for (int i = -2000; i < 2000; i++){
            arrayNumeros[cont] = i;
            cont++;
        }

        arrayRetornoNumeros = positivosImpares100(arrayNumeros);

        for (int i = 0; i < arrayRetornoNumeros.length; i++){
            System.out.println(arrayRetornoNumeros[i]);
        }
    }


    public static Integer[] positivosImpares100(Integer[] arrayNumeros){

        Integer[] arrayNumerosPosImpares = new Integer[arrayNumeros.length];
        Integer cont = 0;

        for(int i = 0; i < arrayNumeros.length; i++){

            if ((cont < 100) && (arrayNumeros[i] >= 0) && (arrayNumeros[i] % 2 != 0)){
                arrayNumerosPosImpares[cont] = arrayNumeros[i];
                cont++;
           }

        }

        return arrayNumerosPosImpares;
    }

}
