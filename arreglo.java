import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arreglo{

    //Para abrir un bufer de entrada global
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;


    //metodo que regresa un arreglo de double y recibe un parametro entero
    public static double[]leerPromedios(int n) throws IOException{
        double[]proms= new double[n];
        System.out.println("Introduccion de los pormedios indivisuales de cada estudianyte");
        for(int i=0;i<n;i++){
            System.out.println("Promedio individual del estudiante con id"+i+" : ");
            entrada = bufer.readLine();
            proms[i]=Double.parseDouble(entrada);
        }
        return proms;// Regresa todos los elemetos de l arreglo proms
    }

    //todos los metodos que regresen unv valor lo deben de especificar en la clase y no es el caso lleva void
    //solamente regresa un double, y recibe un arreglo de double con parametros
    public static double calcularpromedioGrupo(double[] p){
        double suma=0;
        for(int i=0; i<p.length; i++){
            suma= suma+p[i];
        }
        return suma/p.length;
    }
    //Metodo que no regersa valores y recibe un arreglo
    public static void imprimirPromedios(double[]proms){
        int i=0;
        System.out.println("Promedios indivisuales del grupo: ");
        System.out.println(" ID ALUMNO    Promedio indivisual");
        System.out.println("-----------------------------------");
        for(double prom:proms){
            System.out.println( " "+i+"                     "+prom);
            i++;
        }
    }

    public static void main(String[] args) throws IOException {
        final int T=5;// declarando una constante 
        double promedioGrupo;

      

        //declarando y contruyendo el arreglo
        int[]arreglo=new int[5];

        //Un arreglo de chars
        char[]caracteres=new char[T];

        //DECLARACION DE UN ARREGLO DE BOOLEANOS
        boolean[]datos;
        int t;//tamaño variable del arreglo
        double[]doble;

        //Declarar, construir e inicializar un arreglo de double
        //double[]promedio={9.1, 8.6, 7.4, 5.3, 9.2, 6.5};

        double[]promedios;



        //inicializando todas las casillas del arreglo en 0
        for(int i = 0; i<5; i++)
        arreglo[i]=0;

        //asi no de puede imprimir el contendo de n arreglo
        //System.out.println("arreglo: ");
        //System.out.println(arreglo);


        //asi se iprime el contenido de un arreglo
        System.out.println("Contenido del arreglo: ");
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("arreglo["+i+"]="+arreglo[i]);
            
        }
        //leer los valores del arreglo caracteres
        System.out.println("Escribe los valores del arreglos caracteres");
        for (int i=0;i<T;i++){
            System.out.println("Escribe el  valor ["+i+"]");
            entrada=bufer.readLine();
            caracteres[i]=entrada.charAt(0);
        }
        for(int i = 0; i < caracteres.length; i++){
            System.out.println("caracteres["+i+"]="+caracteres[i]);
            
        }
        System.out.println("Escribe el tamaño del arreglo de datos ");
        entrada=bufer.readLine();
        t=Integer.parseInt(entrada);

        datos=new boolean[t];//construimos el arreglo datos con el mismo tamaño t

        //rellenamos datos con valores booleanos 
        for(int i=0;i<t;i++){
            System.out.println("Escribe el valor ["+i+"] los datos: ");
            entrada=bufer.readLine();
            datos[i]=Boolean.parseBoolean(entrada);
        }
        //mostramos los valores del arreglo datos, usando un fro extendido
        for(boolean unDato:datos){
            System.out.println(unDato);
        }
        System.out.println("Escribe el tamaño del arreglo de doble ");
        entrada=bufer.readLine();
        t=Integer.parseInt(entrada);

        doble=new double[t];//construimos el arreglo datos con el mismo tamaño t

        //rellenamos datos con valores Double 
        for(int i=0;i<t;i++){
            System.out.println("Escribe el valor ["+i+"] los datos: ");
            entrada=bufer.readLine();
            doble[i]=Double.parseDouble(entrada);
        }
        //mostramos los valores del arreglo datos, usando un for extendido
        for(Double unDoble:doble){
            System.out.println("Datos double");
            System.out.println(unDoble);
        }
        //Calcula el rpomedio de un grupo
        System.out.print("Escribe el tamaño del grupo :");
        entrada=bufer.readLine();
        t=Integer.parseInt(entrada);

        promedios=leerPromedios(t);
        imprimirPromedios(promedios);
        promedioGrupo = calcularpromedioGrupo(promedios);
        System.out.println("El promedio del grupo es "+promedioGrupo);
    }    
}