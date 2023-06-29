package tareasJava;
import java.util.Scanner;


public class PromedioCalificaciones {
	
	public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        float notas ;
        float suma = 0;
        float promedio;
        int a;


        for(a=1;a<=15;a++)

        {  
          System.out.println("ingresa la calificacion del alumno: "+a+"");
          notas=input.nextFloat();
          suma=suma+notas;


        } 


        promedio=suma/(a-1);
        System.out.println("el promedio del grupo es: "+promedio);


        if (promedio >= 9.0) {
            System.out.println("Grupo sobresaliente!");

        }else if (promedio >= 7 && promedio < 9) {
            System.out.println("Grupo regular");
        }else {
        	
                System.out.println("El grupo necesita repaso");
        }
     }
	
	

}
