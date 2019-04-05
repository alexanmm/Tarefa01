public class Exercicio05 {

    public static void main(String[] arqs) {

        //5) Definir o método Boolean algumMaior(Integer umNumeroA, Integer
        //umNumeroB, Integer umNumeroC, Integer umNumeroD) que deve analisar
        //quatro números inteiros e, caso numA seja maior que numC e numD ou caso
        //numB seja maior que numC e numD, retornar true, caso contrário, retornar
        //false.

        System.out.println(algumMaior(1, 7, 2, 4));

    }


    public static Boolean algumMaior(Integer umNumeroA, Integer umNumeroB, Integer umNumeroC, Integer umNumeroD){

        return     ((umNumeroA > umNumeroC) && (umNumeroA > umNumeroD))
                || ((umNumeroB > umNumeroC) && (umNumeroB > umNumeroD));


    }

}
