package pkg4.notasestudiantes;

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
public class Estudiante {

    public String Nombre;
    public double NotaDefinitiva;
    public int CantEstudiantes;

    public Estudiante(String Nombre, double NotaDefinitiva, int CantEstudiantes) {
        this.Nombre = Nombre;
        this.NotaDefinitiva = NotaDefinitiva;
        this.CantEstudiantes = CantEstudiantes;

    }

    public Estudiante() {
    }

    public void Aprobados(Estudiante[] Lista) {
        for (int i = 0; i < Lista.length; i++) {
            if (Lista[i].NotaDefinitiva >= 3) {
                System.out.println(Lista[i].Nombre + " " + Lista[i].NotaDefinitiva);
            }
        }
    }

    public void Reprobados(Estudiante[] Lista) {
        for (int i = 0; i < Lista.length; i++) {
            if (Lista[i].NotaDefinitiva < 3) {
                System.out.println(Lista[i].Nombre + " " + Lista[i].NotaDefinitiva);
            }
        }

    }

    public void MayorNota(Estudiante[] Lista) {
        double temporal = 0;
        for (int i = 0; i < Lista.length; i++) {
            if (Lista[i].NotaDefinitiva > temporal) {
                temporal = Lista[i].NotaDefinitiva;
            }
        }
        System.out.println("La mayor nota es: " + temporal);
    }

    public void MenorNota(Estudiante[] Lista) {
        double temporal = Double.MAX_VALUE;//pone el numero mas grande
        for (int i = 0; i < Lista.length; i++) {
            if (Lista[i].NotaDefinitiva < temporal) {
                temporal = Lista[i].NotaDefinitiva;
            }
        }
        System.out.println("La menor nota es: " + temporal);
    }

    public double Promedio(Estudiante[] Lista) {

        double acumulador = 0;
        for (int i = 0; i < Lista.length; i++) {
            acumulador = acumulador + Lista[i].NotaDefinitiva;
        }
        double promedio = acumulador / Lista.length;
        return promedio;
    }

    public void MayorAlPromedio(Estudiante[] Lista) {
        double promedio = Promedio(Lista);
        int contador = 0;
        for (int i = 0; i < Lista.length; i++) {
            if (Lista[i].NotaDefinitiva >= promedio) {
                contador++;
            }
        }
        System.out.println("La cantidad de estudiantes que superan el promedio es: " + contador);
    }
}
