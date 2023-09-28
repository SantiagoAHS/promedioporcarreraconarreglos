import java.util.Scanner;
public class arregloejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Recibe en un arreglo el promedio de cada alumno en un grupo
        System.out.print("Ingrese el número de grupos: ");
        int numGrupos = scanner.nextInt();
        double[] promediosGrupos = new double[numGrupos];

        for (int i = 0; i < numGrupos; i++) {
            System.out.print("Ingrese la cantidad de alumnos en el grupo " + (i + 1) + ": ");
            int numAlumnos = scanner.nextInt();
            double[] promediosAlumnos = new double[numAlumnos];

            for (int j = 0; j < numAlumnos; j++) {
                System.out.print("Ingrese el promedio del alumno " + (j + 1) + " en el grupo " + (i + 1) + ": ");
                promediosAlumnos[j] = scanner.nextDouble();
            }

            //Obtiene el promedio por grupo y almacena los valores
            double promedioGrupo = calcularPromedio(promediosAlumnos);
            promediosGrupos[i] = promedioGrupo;
        }

        // Del arreglo "numgrupos", obtener el promedio general
        double promedioGeneral = calcularPromedio(promediosGrupos);

                // Imprimir tabla de resultados
                System.out.println("\nTabla de resultados:");
                System.out.println("---------------------------------------------------------");
                System.out.println("Grupo\t\tPromedio Grupo");
                System.out.println("---------------------------------------------------------");
        
                for (int i = 0; i < numGrupos; i++) {
                    System.out.println((i + 1) + "\t" + promediosGrupos[i]);
                }
        
                System.out.println("---------------------------------------------------------");
                System.out.println("Promedio General de la Carrera de TICS: " + promedioGeneral);
            }
        
            // Función para calcular el promedio de un arreglo de números
            public static double calcularPromedio(double[] numeros) {
                double suma = 0;
                for (double numero : numeros) {
                    suma += numero;
                }
                return suma / numeros.length;
            }
}
