public class Exercicio06 {

    public static void main(String[] arqs) {

        //6) Definir o método: listaDePrimeirosCemPositivos() que retorne um Array com
        //os primeiros 100 números positivos.

        Integer[] arrayNumeros = new Integer[100];


        arrayNumeros = listaDePrimeirosCemPositivos();

        for (int i = 0; i < arrayNumeros.length; i++  ){
            System.out.println(arrayNumeros[i]);
        }
    }

    public static Integer[] listaDePrimeirosCemPositivos(){

        Integer[] arrayNumeros = new Integer[100];
        Integer cont = 0;

        for (int i = -1000; i < 1000; i++){
            if ((cont < 100) && (i >= 0)) {
                arrayNumeros[cont] = i;
                cont++;
            }
        }

        return arrayNumeros;
    }

}
