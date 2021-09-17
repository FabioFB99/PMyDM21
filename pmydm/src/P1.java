public class P1 {
     public static void main(String[] args)
     {
         //prueba1();
         prueba2();

     }

    private static void prueba2() {
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

    private static void prueba1() {
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

