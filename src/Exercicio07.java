public class Exercicio07 {

    public static void main(String[] arqs) {

        //7) Definir o método: listaDeNumerosEntre(Integer mínimo, Integer máximo)
        //que receba dois inteiros e gere um Array com os valores dentro desse
        //intervalo.

        Integer numMinimo = 100;
        Integer numMaximo = 200;

        Integer[] arrayNumeros = new Integer[numMaximo - numMinimo + 1];
        arrayNumeros = listaDeNumerosEntre(numMinimo,numMaximo);

        for (int i = 0; i < arrayNumeros.length; i++){
            System.out.println(arrayNumeros[i]);
        }


    }

    public static Integer[] listaDeNumerosEntre(Integer minimo, Integer maximo){

        Integer[] arrayNumeros = new Integer[maximo - minimo + 1];
        Integer cont = 0;

        for (int i = minimo; i <= maximo; i++){
            arrayNumeros[cont] = i;

            cont++;
        }

        return arrayNumeros;
    }
}
