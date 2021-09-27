import fsg.in;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args)
    {
        List<String> marcas = new ArrayList<String>();
        marcas.add("BMW");//1
        marcas.add("Fiat");//2
        marcas.add("hyundai");//3
        marcas.add("Porche");//4
        marcas.add("Lamborgini");//5
        marcas.add("Seat");//6
        marcas.add("Dacia");//7
        marcas.add("Maserati");//8
        marcas.add("Ferrari");//9
        marcas.add("Mercedes");//10
        List<String> cartonI = generarcarton(marcas);
        ArrayList<ArrayList<String>> contenedorCartones= new ArrayList<ArrayList<String>>();


        // generar los n cartones
        int nNumeroTotalCartones = 40;
        for (int i=0;i<nNumeroTotalCartones;i++ )
        {
            if(!existeCarton(cartonI,contenedorCartones))
            {
                generarcarton(marcas);
                imprimirCarton(cartonI);
            }

        }



    }

    /**
     * esta funcion devuelve si el carton introducido esta en estructura
     * @param cartonI este es el carton que se va a comparar
     * @param contenedorCartones esta es una estructura que los cartones utlilizados
     * @return devuelve si el carton introducido esta en estructura
     */
    private static boolean existeCarton(List<String> cartonI, ArrayList<ArrayList<String>> contenedorCartones) {
        for (int i=0; i< contenedorCartones.size() ;i++)
        {

            if (comparar2Cartones(cartonI,contenedorCartones.get(i)))
            {
                return  true;
            }

        }
        return false;
    }

    private static boolean comparar2Cartones(List<String> cartonI, ArrayList<String> carton2) {
        for (int k =0;k<cartonI.size();k++)
        {
            if(!cartonI.get(k).contains((CharSequence) carton2)) return false;

        }
         return true;
    }

    private static void imprimirCarton(List<String> cartonI) {
        String sComa = "";
        for (String carton: cartonI)
        {
            System.out.print(sComa+carton);
            sComa=",";

        }
        System.out.print("");
    }

    private static List<String> generarcarton(List<String> marcas) {
        List<String> bingo = new ArrayList<String>();
        int ale=0;
        for (int i=0;i<5;)
        {
            ale = (int) (Math.random()*9);
            //System.out.print(ale+",");
            if (!bingo.contains(marcas.get(ale)))
            {
                bingo.add(marcas.get(ale));
                i++;
            }
        }
        return bingo;
    }


}