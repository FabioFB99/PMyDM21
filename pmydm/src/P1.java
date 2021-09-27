import java.util.*;

public class P1 {
     public static void main(String[] args)
     {

         //prueba1();
        // prueba2();
         //prueba3();
         //prueba4();
         //prueba5();
         prueba6();

     }

    public static void prueba6() {
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
        String sComa = "";
        for (String carton:bingo)
        {
            System.out.print(sComa+carton);
            sComa=",";
        }
        // generar n cartones tal que no este ninguno reptido(que no contengan las 5 marcas)

    }

    private static void prueba5()
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
        String sComa = "";
        for (String carton:bingo)
        {
            System.out.print(sComa+carton);
            sComa=",";
        }
    }

    public static void prueba4()
    {
         List<Integer> alNumerosImpares = new ArrayList<Integer>();
         for (int i=1;i<101; i=i+2)
         {
             alNumerosImpares.add(i);

         }
        String sComa = "";
         for (Integer numeroi:alNumerosImpares)
         {
             System.out.print(sComa+numeroi);
             sComa=",";
         }
    }


    public static void prueba3() {
         String sNombre4 ="alb erto fer al7 dez dez alb san chez";
         String sAux[] = sNombre4.split(" ");
         int cont=0;
        for(int i=0; i < sAux.length;i++)
        {
            for(int j=0; j < sAux.length;i++)
            {
                if(sAux[i].equals(sAux[j]) && i!=j)
                {
                    cont++;
                }
            }
        }System.out.println("la palabra se repite: "+(cont/2));
    }

    public static void prueba2() {
         //muestra las palabras que sin de tamaño impar
         String sNombre3="alb erto fer al7 dez dez san chez";
         String arraySeccion [] = sNombre3.split(" ");
            for(int i=0; i < arraySeccion.length;i++)
            {
                if(arraySeccion[i].length()%2 !=0)
                {
                    System.out.println(arraySeccion[i]);
                }
            }
    }

    public static void prueba1() {
        String sNombre = "alb erto fer al7 dez dez san chez";
        int totalletras = sNombre.length();
        String sNombre2 = "";
        for (int i = 0; i < totalletras; i++) {
            if (sNombre.charAt(i) == ' ') {

                    System.out.println(sNombre2);
                sNombre2 = "";
            } else {
                sNombre2 = sNombre2 + sNombre.charAt(i);

            }

        }
    }
}

