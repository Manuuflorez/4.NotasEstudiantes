package pkg4.notasestudiantes;

import java.util.Scanner;

/*Crear un programa donde el usuario ingrese el nombre y las 4 notas que 
obtuvieron N estudiantes, cree dos vectores, uno con el nombre del estudiante 
y otro con su nota definitiva y luego calcule e imprima los siguientes datos:
Nombre y nota definitiva de los que ganaron la materia
Nombre y nota definitiva de los que perdieron la materia
Estudiante con mayor nota definitiva
Estudiante con menor nota definitiva
Promedio de notas definitivas 
Cantidad de estudiantes con nota mayor al promedio de notas definitivas
 */
public class NotasEstudiantes {

    public static void main(String[] args) {
        System.out.println("Cuantos estudiantes serán?");
        int CantEstudiantes = new Scanner(System.in).nextInt();
        Estudiante[] Lista = new Estudiante[CantEstudiantes];

        for (int i = 0; i < CantEstudiantes; i++) {
            System.out.println("Cual es el nombre del estudiante " + (i + 1) + "?");
            String Nombre = new Scanner(System.in).nextLine();
            System.out.println("Cual es la nota definitiva");
            double NotaDefinitiva = new Scanner(System.in).nextDouble();

            Estudiante objEstudiante = new Estudiante(Nombre, NotaDefinitiva, CantEstudiantes);
            Lista[i] = objEstudiante;
        }
        Estudiante objEstudiante = new Estudiante();
        System.out.println("Los Estudiantes aprobados son: ");
        objEstudiante.Aprobados(Lista);
        System.out.println("Los Estudiantes reprobados son: ");
        objEstudiante.Reprobados(Lista);
        objEstudiante.MayorNota(Lista);
        objEstudiante.MenorNota(Lista);
        System.out.println("El promedio de notas es:  " + objEstudiante.Promedio(Lista));
        objEstudiante.MayorAlPromedio(Lista);
    }

}
