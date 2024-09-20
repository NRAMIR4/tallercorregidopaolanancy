import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);//scanner permite  ingresar valores por consola , con esta permite crear un objeto


    public static void main(String[] args) {
        int opcion = 0; //se declara la variable


        do {  // se escogio proque es para  repetir un ciclo al menos una vez y que encuentra una condicion
            System.out.println("                                                                       ");
            System.out.println("***********************************************************************");
            System.out.println("*                 MENÚ CAPITULO DE PROGRAMACIÓN                       *");
            System.out.println("*                 SILVIA PAOLA TORRES Y NANCY RAMIREZ                 *");
            System.out.println("*                 USUARIOS STORRE1      NRAMIR4                       *");
            System.out.println("*-------------------------------------------------------------------- *");
            System.out.println("*                1.    Datos  Primitivos                              *");
            System.out.println("*                2.    String                                         *");
            System.out.println("*                3.    Constante                                      *");
            System.out.println("*                4.    Tipos de operadores                            *");
            System.out.println("*                5.    Condicional   IF,  ELSE IF, ELSE               *");
            System.out.println("*                6.    Condicional   Switch                           *");
            System.out.println("*                7.    Condicional   Ternaria                         *");
            System.out.println("*                8.    Bucle  DO  WHILE                               *");
            System.out.println("*                9.    Bucle  WHILE                                   *");
            System.out.println("*                10.   Bucle  FOR                                     *");
            System.out.println("*                0.    Salir                                          *");
            System.out.println("***********************************************************************");
            System.out.println("Dígite una opción del Menú Principal   ");//  se coloca para que el usuario  digite el valor en la pantalla
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("-----------------------------------------------------------------    ");
                    System.out.println("Datos  Primitivos                                                    ");
                    System.out.println("Tipos de Datos primitivos -seleccione una opciÓn                     ");
                    System.out.println("a.  byte   --- si quieres ver la explicación digite la opción a      ");
                    System.out.println("b.  short  --- si quieres ver la explicación digite la opción b      ");
                    System.out.println("c.  int    --- si quieres ver la explicación digite la opción c      ");
                    System.out.println("d.  long   --- si quieres ver la explicación digite la opción d      ");
                    System.out.println("e.  float  --- si quieres ver la explicación digite la opción e      ");
                    System.out.println("f.  double --- si quieres ver la explicación digite la opción f      ");
                    System.out.println("g.  char   --- si quieres ver la explicación digite la opción g      ");
                    System.out.println("h.  boolean--- si quieres ver la explicación digite la opción h      ");
                    System.out.println("s.  SALIR                                                            ");
                    System.out.println("-----------------------------------------------------------------    ");

                    String opcionUno = scanner.next();

                    switch(opcionUno){
                        case "a":
                            System.out.println("--------------------------------------------------------------------   ");
                            System.out.println("1      Datos  Primitivos                                               ");
                            System.out.println("a      Datos  Primitivos    a.       'byte'                            ");
                            System.out.println("       Descripcion  es utilizado para datos pequeños y                 ");
                            System.out.println("       optimización de memoria en arrays grandes.                      ");
                            System.out.println("       Representa un tipo de dato de 8 bits con signo.                 ");
                            System.out.println("       Tamaño (bytes)    es  1                                         ");
                            System.out.println("       Rango  va  entre  -128 a 127                                    ");
                            System.out.println("              Ejemplo   'byte edad =  25'                              ");
                            System.out.println("--------------------------------------------------------------------   ");
                            break;
                        case "b":
                            System.out.println("--------------------------------------------------------------------   ");
                            System.out.println(" 1     Datos  Primitivos                                               ");
                            System.out.println(" b      Datos  Primitivos    b.       'short'                           ");
                            System.out.println("        Descripcion  es útil para datos numéricos más                  ");
                            System.out.println("        grandes que  'byte' pero aún pequeños.                         ");
                            System.out.println("        Representa un tipo de dato de 16 bits con signo.               ");
                            System.out.println("        Algunas de las aplicaciones del tipo short son:                ");
                            System.out.println("        --Para representar valores que no necesitan mucha              ");
                            System.out.println("        precisión  y que están dentro del rango permitido              ");
                            System.out.println("        --También se utilizan para ahorrar espacio en matrices         ");
                            System.out.println("        -- que contienen muchos valores enteros pequeños.              ");
                            System.out.println("        * Tamaño (bytes)    es  2                                      ");
                            System.out.println("        De esta manera almacena valores numéricos                      ");
                            System.out.println("                Rango  va  entre  -32,768 a 32,767                     ");
                            System.out.println("                Ejemplo   short año =  2024;                           ");
                            System.out.println("                Ejemplo   short temperatura =  -10 ;                   ");
                            System.out.println("                Ejemplo   short  numero de la habitacion =  105;       ");
                            System.out.println("--------------------------------------------------------------------   ");
                            break;
                        case "c":
                            System.out.println("--------------------------------------------------------------------   ");
                            System.out.println("  1     Datos  Primitivos                                              ");
                            System.out.println("  c     Datos  Primitivos    c.       'int'                            ");
                            System.out.println("        Descripcion  es utilizado para para números enteros            ");
                            System.out.println("        Algunas de las aplicaciones del tipo de dato int son:          ");
                            System.out.println("        **Para programar contadores y variables de control  en         ");
                            System.out.println("        ciclos(bucles) y estructuras de control de flujo del programa  ");
                            System.out.println("        **En otra aplicación, son utilizados como valores numéricos en ");
                            System.out.println("        cálculos  matemáticos y operaciones aritméticas.               ");
                            System.out.println("        * Es un tipo de dato de 32 bits con signo para almacenar valores");
                            System.out.println("        numéricos                                                      ");
                            System.out.println("        * Tamaño (bytes)    es  4                                      ");
                            System.out.println("                Rango  -2.147.483.648 a 2.147.483.647 en valor decimal ");
                            System.out.println("                Ejemplo   int numeroEntero = 100;                      ");
                            System.out.println("                Ejemplo   int salario = 500000;                        ");
                            System.out.println("--------------------------------------------------------------------   ");
                            break;
                        case "d":
                            System.out.println("--------------------------------------------------------------------   ");
                            System.out.println(" 1     Datos  Primitivos                                               ");
                            System.out.println(" d     Datos  Primitivos    d.       long                              ");
                            System.out.println("       Descripcion  es utilizado para para números enteros             ");
                            System.out.println("       muy grandes                                                     ");
                            System.out.println("       Algunas de las aplicaciones del tipo de dato long son:          ");
                            System.out.println("       Para medir el tiempo cuando la cantidad de dígitos es amplia,   ");
                            System.out.println("       como al añadir milisegundos, segundos, minutos, horas, días     ");
                            System.out.println("       Otra aplicación es para cálculos matemáticos que requieren una  ");
                            System.out.println("       precisión, como en problemas de física, ingenieria o matemáticas");
                            System.out.println("       * Es un tipo de dato de 64 bits con signo para almacenar valores");
                            System.out.println("        numéricos                                                      ");
                            System.out.println("       * Tamaño (bytes)    es  8                                       ");
                            System.out.println("                Rango  va  entre  -9223372036854775808                 ");
                            System.out.println("                 y 9223372036854775808                                 ");
                            System.out.println("                Ejemplo1   long distancia= 15000000000000000000000;    ");
                            System.out.println("                Ejemplo2   long numeroLargo = 999999999;               ");
                            System.out.println("                Ejemplo3    población mundial =4899999999999;          ");
                            System.out.println("--------------------------------------------------------------------   ");
                            break;
                        case "e":
                            System.out.println("--------------------------------------------------------------------   ");
                            System.out.println(" 1     Datos  Primitivos                                               ");
                            System.out.println(" e     Datos  Primitivos    e.     float                               ");
                            System.out.println("       Descripción son  numeros  en como flotante de precisión simple  ");
                            System.out.println("       Algunas de las aplicaciones del tipo de dato  float  son:       ");
                            System.out.println("       -Para representar números con decimales, como la altura de una  ");
                            System.out.println("       persona,la temperatura de un ambiente,el precio de un producto  ");
                            System.out.println("       -También se utilizan para cálculos matemáticos que involucran   ");
                            System.out.println("       números con decimales,como problemas de física, ingeniería o    ");
                            System.out.println("       matemáticas.                                                    ");
                            System.out.println("       Es un tipo dato para almacenar números en coma flotante con     ");
                            System.out.println("       precisión simple de 32 bits.                                    ");
                            System.out.println("       * Tamaño (bytes)    es  4                                       ");
                            System.out.println("               Rango  va  entre  1.4e-45 a 3.4e38 en valor decimal     ");
                            System.out.println("               Ejemplo1:   'float precio = 19.99f; '                   ");
                            System.out.println("               Ejemplo2:    float numeroFlotante = 3.1416f;            ");
                            System.out.println("--------------------------------------------------------------------   ");
                            break;
                        case "f":
                            System.out.println("--------------------------------------------------------------------   ");
                            System.out.println("1     Datos  Primitivos                                                ");
                            System.out.println("f     Datos  Primitivos    f.      double                              ");
                            System.out.println("      Descripción son  numeros  en como flotante de precisión          ");
                            System.out.println("      doble precisión.                                                 ");
                            System.out.println("      Algunas de las aplicaciones del tipo de dato double son:         ");
                            System.out.println("      -Se emplean para representar números con decimales con una alta  ");
                            System.out.println("      precisión,como en cálculos financieros, científicos,de ingeniería");
                            System.out.println("      -También se utilizan para almacenar grandes cantidades de datos en");
                            System.out.println("      una matriz o estructura de datos, así como en la manipulación de ");
                            System.out.println("      grandes conjuntos de datos.                                      ");
                            System.out.println("      - También se utilizan en la geolocalización para almacenar las   ");
                            System.out.println("      coordenadas de la latitud y longitud de un lugar en un sistema,  ");
                            System.out.println("      como en una aplicación de mapas                                  ");
                            System.out.println("      *   Tamaño (bytes)    es  8                                      ");
                            System.out.println("                Rango  va  entre  4.9e-324 a 1.8e308 en valor decimal  ");
                            System.out.println("                Ejemplo1:   'double pi = 3.141592653589793;'           ");
                            System.out.println("--------------------------------------------------------------------   ");
                            break;
                        case "g":
                            System.out.println("--------------------------------------------------------------------   ");
                            System.out.println("1    Datos  Primitivos                                                 ");
                            System.out.println("g     Datos  Primitivos    g.      char                                ");
                            System.out.println("      Descripcion  Almacena valores de verdad.                         ");
                            System.out.println("      se representan con caracteres individuales,como letras y símbolos");
                            System.out.println("      Algunas de las aplicaciones del tipo de dato char  son:          ");
                            System.out.println("      - Se emplean en la entrada y salida de datos para representar    ");
                            System.out.println("      caracteres,como letras, números y signos de puntuación, y con    ");
                            System.out.println("      ello formar otro tipo de datos en cadena.                        ");
                            System.out.println("      * Tamaño (bytes)    es  2                                        ");
                            System.out.println("      Rango  va entre 0 a 65.535 en valor decimal (caracteres Unicode) ");
                            System.out.println("             Ejemplo1:   'char inicial =  'A';'                        ");
                            System.out.println("             Ejemplo2:   char b = 'b';                                 ");
                            System.out.println("--------------------------------------------------------------------   ");
                            break;
                        case "h":
                            System.out.println("--------------------------------------------------------------------   ");
                            System.out.println(" 1    Datos  Primitivos                                                ");
                            System.out.println(" h  Datos  Primitivos    h.      boolean                             ");
                            System.out.println("      Descripcion  Almacena valores  de verdad                         ");
                            System.out.println("      El tipo de datos boolean se utiliza para almacenar un valor de   ");
                            System.out.println("      verdadero o falso, que representa el resultado de una expresión  ");
                            System.out.println("      lógica.                                                          ");
                            System.out.println("      Algunas de las aplicaciones del tipo de dato boolean son:        ");
                            System.out.println("      -Para representar el resultado de la toma de decisiones en un    ");
                            System.out.println("      programa; estos valores son el resultado de una expresión lógica,");
                            System.out.println("      como una comparación una operación booleana de tipo AND,OR,NOT,etc");
                            System.out.println("      -También se emplean en la programación condicional para controlar");
                            System.out.println("      el flujo de ejecución del programa en estructuras condicionales  ");
                            System.out.println("      como if-else, while, do-while, etc.                              ");
                            System.out.println("      -Otra aplicación es la validación de datos para verificar si los ");
                            System.out.println("       datos ingresados por el usuario son válidos o no.               ");
                            System.out.println("       * Tamaño (bytes)   es  1 bit ( dependiendo de la JVM)          ");
                            System.out.println("       * Tienen un valor de true o false.                               ");
                            System.out.println("                Ejemplo1:    boolean esVerdadero = true;               ");
                            System.out.println("                Ejemplo2:    boolean esMayorDeEdad  =true; System.out.println");
                            break;
                        case "s":
                            break;
                        default:
                            System.out.println("Ingrese una opción válida");
                            break;
                    }
                    break;


                case 2:
                    System.out.println("--------------------------------------------------------------------     ");
                    System.out.println("2  String                                                                ");
                    System.out.println("   Descripcion En Java, los String son un objeto el cual nos permite      ");
                    System.out.println("   almacenar muchos caracteres.                                           ");
                    System.out.println("   Un objeto String representa una cadena alfanumérica de un valor        ");
                    System.out.println("   constante que no puede ser cambiada después de haber sido creada.      ");
                    System.out.println("   y se utiliza en aplicaciones para almacenar y manipular texto         ");
                    System.out.println("   En Java,una cadena de texto se define utilizando comillas dobles      ");
                    System.out.println("   alrededor del texto.                                                  ");
                    System.out.println("   Ejem.1 String mensaje= Hola Mundo;//Usado comillas dobles para iniciar");
                    System.out.println("   Ejem.2 String nombre= new String (Mario);//Usando el constructor de String");
                    System.out.println("   Ejem.3 String nombre= Hola + nombre;//Resultado: mensaje= Hola Mario   ");
                    System.out.println("--------------------------------------------------------------------      ");
                    break;
                case 3:
                    System.out.println("--------------------------------------------------------------------   ");
                    System.out.println("3    Constantes                                                        ");
                    System.out.println("     Descripcion En Java, una constante  es  un valor  que no cambia   ");
                    System.out.println("     durante la ejecución del programa.                                ");
                    System.out.println("     Las constantes se utilizan para representar valores fijos y de    ");
                    System.out.println("     lectura fijosy de lectura única,lo que ayuda a que el código sea  ");
                    System.out.println("     más legible y menos propenso a errores.                           ");
                    System.out.println("     Las contantes en Java se declaran usando la palabra clave final   ");
                    System.out.println("     Ejemplo1  final int VALUE = 54;                                   ");
                    System.out.println("     Ejemplo2  public static final int TIEMPO_ESPERA_CONEXION  = 50;   ");
                    System.out.println("     Ejemplo3  public static final boolean MODO_DEPURACION  = true;    ");
                    System.out.println("--------------------------------------------------------------------   ");
                    break;
                case 4:
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("4.   Tipos de operadores                                           ");
                    System.out.println("     Tipos de operadores -seleccione una opción                    ");
                    System.out.println("------------------------------------------------------------------ ");
                    System.out.println("   a Operador    - si quieres ver la explicación digite la opción a");
                    System.out.println("   b Aritméticos - si quieres ver la explicación digite la opción b");
                    System.out.println("   c Relacionales- si quieres ver la explicación digite la opción c");
                    System.out.println("   d Lógicos     - si quieres ver la explicación digite la opcion d");
                    System.out.println("   e Asignación  - si quieres ver la explicación digite la opcion e");
                    System.out.println("   f Incremento/Decremento-si quieres ver la explicación dale la opcion f");
                    System.out.println("   s SALIR");
                    System.out.println("-------------------------------------------------------------------");
                    String opcionCuatro = scanner.next();

                    switch(opcionCuatro){
                        case "a":
                            System.out.println("-----------------------------------------------------------------------");
                            System.out.println("4    Tipos de operadores                                               ");
                            System.out.println("a    Operador                                                          ");
                            System.out.println("     Descripcion ¿Qué es operador?                                     ");
                            System.out.println("     En programación un operador representa un símbolo que permite     ");
                            System.out.println("     realizar operaciones aritméticas, relacionar elementos            ");
                            System.out.println("     o hacer preguntas donde se involucra más de una condición.        ");
                            System.out.println("     Los Operadores en JAVA presentan los símbolos de los operadores   ");
                            System.out.println("     que se utilizan enel lenguaje de programación JAVA                ");
                            System.out.println("     Existen los siguientes  tipos de operadores:                      ");
                            System.out.println("     Aritméticos,Relacionales y Lógicos.                               ");
                            System.out.println("-------------------------------------------------------------------    ");
                            break;
                        case "b":
                            System.out.println("---------------------------------------------------------------------- ");
                            System.out.println("4    Tipos de operadores                                               ");
                            System.out.println("b     Aritméticos                                                      ");
                            System.out.println("---------------------------------------------------------------------- ");
                            System.out.println("       Operador    +                                                   ");
                            System.out.println("           Ejemplo int  suma =5 + 3;                                   ");
                            System.out.println("           Detalle  Suma  dos operadores . Resultado : 8               ");
                            System.out.println("---------------------------------------------------------------------  ");
                            System.out.println("       Operador    -                                                   ");
                            System.out.println("           Ejemplo int resta   =5 - 3;                                 ");
                            System.out.println("           Detalle  Resta el segundo operador del primero. Resultado :2");
                            System.out.println("---------------------------------------------------------------------  ");
                            System.out.println("       Operador    *                                                   ");
                            System.out.println("           Ejemplo int  multiplicacion    =5 * 3;                      ");
                            System.out.println("           Multiplica dos operadores . Resultado 15                    ");
                            System.out.println("-----------------------------------------------------------------------");
                            System.out.println("       Operador    /                                                   ");
                            System.out.println("           Ejemplo int   divisionn    =6 * 3;                          ");
                            System.out.println("           Divide el primer operando por el segundo . Resultado 15     ");
                            System.out.println("--------------------------------------------------------------------   ");
                            System.out.println("      Operador    %   --porcentaje--                                   ");
                            System.out.println("       Ejemplo int  modulo    =5 % 3;                                  ");
                            System.out.println("       Devuelve el resto de la division del primer operando por el segundo");
                            System.out.println("       Resultado 2                                                     ");
                            System.out.println("---------------------------------------------------------------------  ");
                            break;
                        case "c":
                            System.out.println("---------------------------------------------------------------------- ");
                            System.out.println("4    Tipos de operadores                                               ");
                            System.out.println("---------------------------------------------------------------------- ");
                            System.out.println("c  Relacionales                                                      ");
                            System.out.println("     Operador   ==                                                     ");
                            System.out.println("       Ejemplo boolean esIgual =(5 == 3);                              ");
                            System.out.println("       Detalle  Comprueba  si los valores de dos operadores son iguales");
                            System.out.println("       Resultado : false                                               ");
                            System.out.println("---------------------------------------------------------------------- ");
                            System.out.println("     Operador    !=                                                    ");
                            System.out.println("      Ejemplo boolean noesIgual =(5 != 3);                             ");
                            System.out.println("      Detalle  Comprueba  si los valores de dos operadores  no son iguales");
                            System.out.println("      Resultado :  true                                                ");
                            System.out.println("---------------------------------------------------------------------- ");
                            System.out.println("     Operador    >                                                     ");
                            System.out.println("      Ejemplo boolean mayor =(5 >3);                                   ");
                            System.out.println("      Detalle  Comprueba  si el primer operador  es mayor que el segundo");
                            System.out.println("      Resultado :  true                                                ");
                            System.out.println("----------------------------------------------------------------------- ");
                            System.out.println("     Operador    <                                                      ");
                            System.out.println("       Ejemplo boolean menos=(5 <3);                                    ");
                            System.out.println("       Detalle  Comprueba  si el primer operador  es menor que el segundo");
                            System.out.println("       Resultado :  false                                               ");
                            System.out.println("----------------------------------------------------------------------- ");
                            System.out.println("     Operador    >=                                                     ");
                            System.out.println("       Ejemplo boolean mayorOIgual =(5 >=3);                            ");
                            System.out.println("        Detalle  Comprueba  si el primer operador  es mayor que el      ");
                            System.out.println("        segundo o igual  que el segundo                                 ");
                            System.out.println("        Resultado :  true                                               ");
                            System.out.println("------------------------------------------------------------------------");
                            System.out.println("     Operador    <=                                                     ");
                            System.out.println("       Ejemplo boolean menos=(5 <=3);                                   ");
                            System.out.println("       Detalle Comprueba si el primer operador es menor o igual que el segundo");
                            System.out.println("       Resultado :  false                                               ");
                            System.out.println("----------------------------------------------------------------------- ");
                            break;
                        case "d":
                            System.out.println("----------------------------------------------------------------------  ");
                            System.out.println("4   Tipos de operadores                                                 ");
                            System.out.println("d   Lógicos                                                             ");
                            System.out.println("----------------------------------------------------------------------  ");
                            System.out.println("    Operador   &&                                                       ");
                            System.out.println("     Ejemplo boolean  resultado =(5> 3 &&  3< 4);                       ");
                            System.out.println("     Detalle  Devuelve true  si ambos  son true                         ");
                            System.out.println("     Resultado : true                                                   ");
                            System.out.println("----------------------------------------------------------------------- ");
                            System.out.println("    Operador   ||                                                       ");
                            System.out.println("     Ejemplo boolean  resultado =(5> 3||  3< 4);                        ");
                            System.out.println("     Detalle  Devuelve true  si al menos una de ellas  es true          ");
                            System.out.println("----------------------------------------------------------------------- ");
                            System.out.println("    Operador   !                                                        ");
                            System.out.println("      Ejemplo boolean  resultado = !(5> 3);                             ");
                            System.out.println("      Detalle  Devuelve el valor de un  operando booleano.              ");
                            System.out.println("      Resultado :  false                                                ");
                            System.out.println("----------------------------------------------------------------------- ");
                            break;
                        case "e":
                            System.out.println("----------------------------------------------------------------------  ");
                            System.out.println("4   Tipos de operadores                                                 ");
                            System.out.println("e   Asignación                                                          ");
                            System.out.println("------------------------------------------------------------------------");
                            System.out.println("    Operador   =                                                        ");
                            System.out.println("      Ejemplo  int a=5;                                                 ");
                            System.out.println("      Detalle  Asigna el valor del operando derecho al operando izquierdo");
                            System.out.println("----------------------------------------------------------------------- ");
                            System.out.println("    Operador   +=                                                       ");
                            System.out.println("     Ejemplo  int a=5;  a +=3;                                          ");
                            System.out.println("     Suma el operando derecho al operando izquierdo y asigna el         ");
                            System.out.println("     resultado al operando izquierdo .    Resultado :  8                ");
                            System.out.println("----------------------------------------------------------------------- ");
                            System.out.println("    Operador   -=                                                       ");
                            System.out.println("     Ejemplo  int a=5;  a -= 3;                                         ");
                            System.out.println("     Resta el  operando derecho al operando izquierdo y asigna el       ");
                            System.out.println("     resultado al operando  izquierdo.      Resultado :  2                                                            ");
                            System.out.println("----------------------------------------------------------------------- ");
                            System.out.println("    Operador   *=                                                       ");
                            System.out.println("     Ejemplo  int a=5;  a *= 3;                                         ");
                            System.out.println("     Multiplica el operando derecho por el operando izquierdo y asigna  ");
                            System.out.println("     el resultado al operando  izquierdo.   Resultado :  15             ");
                            System.out.println("----------------------------------------------------------------------- ");
                            System.out.println("    Operador   /=                                                       ");
                            System.out.println("     Ejemplo  int a=6;  a /= 3;                                         ");
                            System.out.println("     Divide el operando  izquierdo por el operando derecho y asigna     ");
                            System.out.println("     el resultado al operando  izquierdo.   Resultado :  2              ");
                            System.out.println("------------------------------------------------------------------------");
                            System.out.println("    Operador   %=                                                       ");
                            System.out.println("     Ejemplo  int a=5;  a %= 3;                                         ");
                            System.out.println("     Calcula el módulo del operando izquierdo por el operando derecho y ");
                            System.out.println("     asigna el resultado al operando  izquierdo.     Resultado :  2     ");
                            System.out.println("----------------------------------------------------------------------- ");
                            break;
                        case "f":
                            System.out.println("------------------------------------------------------------------------");
                            System.out.println("4    Tipos de operadores                                                ");
                            System.out.println("f  Incremento/Decremento                                              ");
                            System.out.println("----------------------------------------------------------------------- ");
                            System.out.println("     Operador  ++                                                       ");
                            System.out.println("      Ejemplo  int a=5;  a++;                                           ");
                            System.out.println("      Detalle  Incrementa el valor del operando en 1                    ");
                            System.out.println("      Resultado :  6                                                    ");
                            System.out.println("------------------------------------------------------------------------");
                            System.out.println("     Operador  --                                                       ");
                            System.out.println("      Ejemplo  int a=5;  a--;                                           ");
                            System.out.println("      Detalle  Decrementa el valor del operando en 1                    ");
                            System.out.println("      Resultado :  4                                                    ");
                            System.out.println("------------------------------------------------------------------------");
                            break;
                        case "s":
                            break;
                        default:
                            System.out.println("Ingrese una opción válida");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("------------------------------------------------------------------------     ");
                    System.out.println("5   Condicional IF, ELSE IF, ELSE                                            ");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("5 Tipos de Condicional                                                       ");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("a   Condicional IF     -si quieres ver la explicación digite la opcion    a");
                    System.out.println("b   Condicional ELSE IF-si quieres ver la explicación digite la opcion    b");
                    System.out.println("c   Condicional ELSE   -si quieres ver la explicación digite la opcion    c");
                    System.out.println("d   PROGRAMA DE CONDICIONAL IF,ELSE IF,ELSE si quieres ejecutarlo  digite d");
                    System.out.println("s   SALIR");
                    System.out.println("-----------------------------------------------------------------------------");
                    String opcionCinco = scanner.next();

                    switch(opcionCinco){
                        case "a":
                            System.out.println("----------------------------------------------------------------------  ");
                            System.out.println("5    Condicional  IF, ELSE IF, ELSE                                     ");
                            System.out.println("a  Condicional   IF                                                   ");
                            System.out.println("----------------------------------------------------------------------  ");
                            System.out.println("     Descripcion El condicional IF se puede utilizar sin el else.       ");
                            System.out.println("     Ejemplo  Si se solicita un programa en el que se diga ÚNICAMENTE   ");
                            System.out.println("     si una persona tiene sobrepeso de acuerdo a su indice de masa corporal,");
                            System.out.println("     se utilizaría el IF sin colocar la parte del else.                 ");
                            System.out.println("     if (condición ) {     //instrucciones para el caso verdadero - IF  ");
                            System.out.println("           Ejemplo1                                                     ");
                            System.out.println("           int peso =20;                                                ");
                            System.out.println("           if (peso >=18); {                                            ");
                            System.out.println("           System.out.println(entre comillas Tu peso esentre comillas   ");
                            System.out.println("           }                                                            ");
                            System.out.println("------------------------------------------------------------------------");
                            break;
                        case "b":
                            System.out.println("----------------------------------------------------------------------  ");
                            System.out.println("5    Condicional  IF, ELSE IF , ELSE                                    ");
                            System.out.println("b    Condicional    ELSE  IF                                            ");
                            System.out.println("----------------------------------------------------------------------  ");
                            System.out.println("     Descripcion En el condicional IF se tiene una condición central    ");
                            System.out.println("     que arroja como resultado verdadero o falso.                       ");
                            System.out.println("     Para cada resultado se puede realizar una acción diferente.        ");
                            System.out.println("     Ejemplo1 if (condición ) { //instrucciones para el caso verdadero - IF");
                            System.out.println("                 } else  {     //instrucciones para el caso falso-ELSE  ");
                            System.out.println("                 }                                                      ");
                            System.out.println("     Ejemplo2                                                           ");
                            System.out.println("                int nota =12;                                           ");
                            System.out.println("                if (nota >=30;  {                                       ");
                            System.out.println("                System.out.println(Paso la materia)                     ");
                            System.out.println("               }  else                                                  ");
                            System.out.println("                System.out.println(Perdio la materia)                   ");
                            System.out.println("               }                                                        ");
                            System.out.println("---------------------------------------------------------------------   ");
                            break;
                        case "c":
                            System.out.println("---------------------------------------------------------------------   ");
                            System.out.println(" 5    Condicional  IF, ELSE IF , ELSE                                   ");
                            System.out.println(" c   Condicional  ELSE                                                 ");
                            System.out.println("----------------------------------------------------------------------- ");
                            System.out.println("    La cláusula else (no obligatoria) sirve para indicar instrucciones a");
                            System.out.println("    realizar en caso de no cumplirse la condición. Java admite escribir un else");
                            System.out.println("    y dejarlo vacío: else { }.El else vacío se interpreta como que contemplamos");
                            System.out.println("    el caso pero no hacemos nada en respuesta a él.                     ");
                            System.out.println("    Ejemplo  incluyendo el Else  en Un IF anidado                       ");
                            System.out.println("    Si en una condición se requiere hacer más de una pregunta se puede  ");
                            System.out.println("    e utilizar un IF anidado                                            ");
                            System.out.println("      if (condición ) {                                                 ");
                            System.out.println("             //instrucciones para el caso verdadero - IF                ");
                            System.out.println("              } else {                                                  ");
                            System.out.println("           if (condición ) {                                            ");
                            System.out.println("             //instrucciones para el caso verdadero - IF                ");
                            System.out.println("            } else {                                                    ");
                            System.out.println("           //instrucciones para el caso falso - ELSE                    ");
                            System.out.println("             }                                                          ");
                            System.out.println("           }                                                            ");
                            System.out.println("             int temperatura=39;                                        ");
                            System.out.println("             if (temperatura<=36 ) {                                    ");
                            System.out.println("            System.out.println(“Temperatura normal”);                   ");
                            System.out.println("          } else {                                                      ");
                            System.out.println("           if (temperatura>36 && temperatura<39) {                      ");
                            System.out.println("         System.out.println(“Tenga cuidado”);                           ");
                            System.out.println("         } else {                                                       ");
                            System.out.println("         System.out.println(“OJO tiene fiebre”);                        ");
                            System.out.println("          }                                                             ");
                            System.out.println("          }                                                             ");
                            System.out.println("----------------------------------------------------------------------  ");
                            break;
                        case "d":
                            System.out.println("----------------------------------------------------------------------  ");
                            System.out.println("d   PROGRAMA  DE  CONDICIONAL IF, ELSE IF ELSE                          ");
                            System.out.println("----------------------------------------------------------------------  ");
                            Scanner scannerEdad = new Scanner(System.in);
                            System.out.println("Ingrese su edad:   ");
                            int edad = scannerEdad.nextInt();
                            System.out.println(edad);
                            if (edad <= 12){
                                System.out.println("su edad es entre 0 a 12 años eres un niño");
                            } else if (edad <= 20){
                                System.out.println("su edad 13 a 20 años eres un joven");
                            } else if (edad <= 60){
                                System.out.println("su edad 21 a 60 años eres un adulto");
                            }if(edad >= 61){
                            System.out.println("su edad  es mayor a 61 eres de la tercera edad");
                        } else{
                        }
                            break;
                        case "s":
                            break;
                        default:
                            System.out.println("Ingrese una opción válida");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("-------------------------------------------------------------------------- ");
                    System.out.println("a Condicional SWITCH-- si quieres ver la explicación digite la opcion a");
                    System.out.println("b PROGRAMA SWITCH   -- si quieres  ejecutarlo  digite la opcion b      ");
                    System.out.println("s   SALIR");
                    System.out.println("-------------------------------------------------------------------------- ");
                    String opcionSeis = scanner.next();

                    switch(opcionSeis){
                        case "a":
                            System.out.println("-------------------------------------------------------------------------  ");
                            System.out.println("601  Condicional SWITCH                                                    ");
                            System.out.println("     Descripcion Cuando se requiere comparar una variable con una serie    ");
                            System.out.println("     valores diferentes, esta indican los posibles valores que puede tomar ");
                            System.out.println("     la variable y las sentencias que se tienen que ejecutar sí es que la  ");
                            System.out.println("     variable coincide con alguno de dichos valores.                       ");
                            System.out.println("     Cada case ejecutará las sentencias correspondientes,con base en base  ");
                            System.out.println("     en el valor de la variable,que deberá de evaluarse con valores de     ");
                            System.out.println("     tipo byte,char,short o int                                            ");
                            System.out.println("     Si el valor de la variable no coincide con ningún valor, entonces se  ");
                            System.out.println("     ejecutan las sentencias por default, sí es que las hay.               ");
                            System.out.println("     La sentencia break al final de cada case transfiere el control al final");
                            System.out.println("     de la sentencia switch; de esta manera, cada vez que se ejecuta un    ");
                            System.out.println("     case todos los enunciados case restantes son ignorados y termina la   ");
                            System.out.println("     operación del switch                                                  ");
                            System.out.println("                Ejemplo1   switch( variable ){                             ");
                            System.out.println("                case valor1:                                               ");
                            System.out.println("                     sentencias;                                           ");
                            System.out.println("                break;                                                     ");
                            System.out.println("                case valor2:                                               ");
                            System.out.println("                     sentencias;                                           ");
                            System.out.println("                break;                                                     ");
                            System.out.println("                case valorN:                                               ");
                            System.out.println("                     sentencias;                                           ");
                            System.out.println("                break;                                                     ");
                            System.out.println("                default;                                                   ");
                            System.out.println("                     sentencias;                                           ");
                            System.out.println("               }                                                           ");
                            System.out.println("--------------------------------------------------------------------       ");
                            break;
                        case "b":
                            System.out.println("-------------------------------------------------------------------------- ");
                            System.out.println("b  PROGRAMA SWITCH                                                        ");
                            System.out.println("-------------------------------------------------------------------------- ");
                            Scanner scannerNota = new Scanner(System.in);
                            System.out.println("Ingrese su Nota del 1 al 10 número entero:   ");
                            int nota = scannerNota.nextInt();
                            System.out.println(nota);

                            switch (nota) {
                                case 1:
                                case 2:
                                    System.out.println("Su calificacion es: F");
                                    break;
                                case 3:
                                case 4:
                                    System.out.println("Su calificación es: D");
                                    break;
                                case 5:
                                case 6:
                                    System.out.println("Su calificación es: C");
                                    break;
                                case 7:
                                case 8:
                                    System.out.println("Su calificación es: B");
                                    break;
                                case 9:
                                case 10:
                                    System.out.println("Su calificación es: A");
                                    break;
                                default:
                                    System.out.println("Número no valido, por favor verifique");
                                    break;
                            }
                        case "s":
                            break;
                        default:
                            System.out.println("Ingrese una opción válida");
                            break;
                    }
                    break;
                case 7:
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("a  Condicion Ternaria -si quieres ver la explicación digite la opcion a ");
                    System.out.println("b  PROGRAMA  TERNARIA -si quieres  ejecutarlo  digite la opcion b       ");
                    System.out.println("s   SALIR");
                    System.out.println("--------------------------------------------------------------------------- ");
                    String opcionSiete = scanner.next();

                    switch(opcionSiete){
                        case "a":
                            System.out.println("--------------------------------------------------------------------------- ");
                            System.out.println("a  Condicion Ternaria                                                     ");
                            System.out.println("--------------------------------------------------------------------------- ");
                            System.out.println("    El operador ternario en Java es una construcción que permite tomar      ");
                            System.out.println("    decisiones basadas en una condición booleana de manera concisa en una   ");
                            System.out.println("    sola línea de código.                                                   ");
                            System.out.println("    Es una forma abreviada de expresar una estructura condicional if-else   ");
                            System.out.println("    Su estructura básica es: condición ? valor_si_verdadero : valor_si_falso;");
                            System.out.println("    Si la condición es verdadera, se devuelve el valor correspondiente a    ");
                            System.out.println("    entre comillas valor_si_verdadero entre comillas; de lo contrario, se   ");
                            System.out.println("    devuelve el valor asignado a entre comillas valor_si_falso entre comillas");
                            System.out.println("      Ejemplo  variable = ( condicion)? valor_si_verdadero : valor_si_falso; ");
                            System.out.println("      Ejemplo1                                                              ");
                            System.out.println("       int edad = 20;                                                        ");
                            System.out.println("       String status =( edad  >= 18) ? entre comillas Adulto entre comillas :");
                            System.out.println("                               Menor de edad entre comillas;                 ");
                            System.out.println("      System.out.println(entre comillas La persona es:entre comillas + status);");
                            System.out.println("      Ejemplo2                                                                ");
                            System.out.println("       int  numero = 15;                                                      ");
                            System.out.println("       String resultado =(numero % 2 == 0 ) ? entre comillas Par entre comillas:");
                            System.out.println("                                  entre comillas Impar entre comillas;        ");
                            System.out.println("    System.out.println(entre comillas El numero es:entre comillas + resultado);");
                            System.out.println("------------------------------------------------------------------------------");
                            break;
                        case "b":
                            System.out.println("----------------------------------------------------------------------------");
                            System.out.println("b PROGRAMA  TERNARIA                                                     ");
                            System.out.println("--------------------------------------------------------------------------- ");
                            Scanner scannerparimpar = new Scanner(System.in);
                            System.out.println("Ingrese el numero:   ");
                            int numerito = scannerparimpar.nextInt();
                            String resultado = (numerito % 2 == 0 ? " un numero par" : " un numero impar");
                            System.out.print("El numero     " + numerito + " es " + resultado);
                            break;
                        case "s":
                            break;
                        default:
                            System.out.println("Ingrese una opción válida");
                            break;
                    }
                    break;

                case 8:
                    System.out.println("----------------------------------------------------------------------------- ");
                    System.out.println("a Ciclo Do While   -- si quieres  ver la explicación digite la opcion a   ");
                    System.out.println("b PROGRAMA DO WHILE-- si quieres  ejecutarlo  digite la opcion b         ");
                    System.out.println("s   SALIR");
                    System.out.println("----------------------------------------------------------------------------- ");
                    String opcionOcho = scanner.next();

                    switch(opcionOcho){
                        case "a":
                            System.out.println("---------------------------------------------------------------------------------  ");
                            System.out.println("a  Ciclo Do While                                                                 ");
                            System.out.println("---------------------------------------------------------------------------------  ");
                            System.out.println("  Es una estructura de control cíclica que permite ejecutar de manera repetitiva   ");
                            System.out.println("  un bloque de instrucciones sin evaluar de forma inmediata una condición especifica,.");
                            System.out.println("  sino evaluándola justo después de ejecutar por primera vez el bloque de          ");
                            System.out.println("  instrucciones en su interior.                                                    ");
                            System.out.println("  El ciclo do-while en Java se utiliza cuando se desea garantizar que el código se ");
                            System.out.println("  ejecute al menos una vez, independientemente de si se cumple la condición.       ");
                            System.out.println("  La diferencia entre el ciclo while y el ciclo do-while es que en el ciclo while, ");
                            System.out.println("  la condición se evalúa antes de ejecutar el código, mientras que en el ciclo     ");
                            System.out.println("  do-while, el. código se ejecuta primero y luego se evalúa la condición.          ");
                            System.out.println("  Si la condición se cumple, el ciclo se repite, de lo contrario, el ciclo se detiene.");
                            System.out.println("                Ejemplo1                                                           ");
                            System.out.println("                int  i= 1;                                                         ");
                            System.out.println("                do {                                                               ");
                            System.out.println("                System.out.println(i);                                             ");
                            System.out.println("                i++;                                                               ");
                            System.out.println("                } while ( i <= 10);                                                ");
                            System.out.println("  En este ejemplo, el código dentro del ciclo se ejecutará al menos una vez,       ");
                            System.out.println("  imprimiendo el valor de i y luego incrementando i en 1. Luego, se evalúa         ");
                            System.out.println("  la condición (i <= 10) y si se cumple,                                           ");
                            System.out.println("  el ciclo se repite y se vuelve a ejecutar el código dentro del ciclo.            ");
                            System.out.println("  Esto continúa hasta que la condición ya no se cumple (i es mayor que 10) y el    ");
                            System.out.println("  ciclo se detiene.                                                                ");
                            System.out.println("--------------------------------------------------------------------------------   ");
                            break;
                        case "b":
                            System.out.println("----------------------------------------------------------------------------- ");
                            System.out.println("b  PROGRAMA DO WHILE                                                         ");
                            System.out.println("----------------------------------------------------------------------------- ");
                            Scanner t = new Scanner(System.in);
                            System.out.println("Ingrese un número entero del 1 al 10 para adivinar cual es:   ");
                            int numeroAleatorio;
                            int num;
                            int cont = 0;
                            Random a = new Random();
                            numeroAleatorio = a.nextInt (10) +1;
                            do {
                                System.out.println ("Ingresa un numero");
                                num = t.nextInt ();
                                cont++;

                                if (num > numeroAleatorio) {
                                    System.out.println ("el numero es menor");
                                }

                                if(num < numeroAleatorio) {
                                    System.out.println ("el numero es mayor");
                                }

                                System.out.println ("Intentos:   "  + cont);

                            } while (num != numeroAleatorio);
                            System.out.println ("****Felicidades el numero es:***-->   "+ num  );
                            break;
                        case "s":
                            break;
                        default:
                            System.out.println("Ingrese una opción válida");
                            break;
                    }
                    break;

                case 9:
                    System.out.println("---------------------------------------------------------------------------------- ");
                    System.out.println(" a   Ciclo  While     -- si quieres  ver la explicación digite la opcion a     ");
                    System.out.println(" b   PROGRAMA WHILE   -- si quieres  ejecutarlo  digite la opcion        b     ");
                    System.out.println(" s    SALIR");
                    System.out.println("-----------------------------------------------------------------------------------");
                    String opcionNueve = scanner.next();

                    switch(opcionNueve){
                        case "a":
                            System.out.println("---------------------------------------------------------------------------------  ");
                            System.out.println(" a  Ciclo  While                                                                 ");
                            System.out.println("---------------------------------------------------------------------------------  ");
                            System.out.println("    es una estructura de control de ciclo que se utiliza para ejecutar un bloque   ");
                            System.out.println("    de código mientras se cumpla una determinada condición..                       ");
                            System.out.println("    La sintaxis básica de la sentencia while en Java es:                           ");
                            System.out.println("                while (condición) {                                                ");
                            System.out.println("                // bloque de código a ejecutar mientras se cumpla la condición     ");
                            System.out.println("                }                                                                  ");
                            System.out.println("         Ejemplo1                                                                  ");
                            System.out.println("          int  contador = 1;                                                       ");
                            System.out.println("          while ( contador >= 5) {                                                 ");
                            System.out.println("          System.out.println(entre comillas contador:  entre comillas + contador );");
                            System.out.println("                contador ++;");
                            System.out.println("   La condición es una expresión booleana que se evalúa antes de cada iteración del ciclo.");
                            System.out.println("   Si la condición es verdadera, se ejecuta el bloque de código dentro del ciclo y ");
                            System.out.println("   luego se vuelve a evaluar la condición. Si la condición es falsa, el ciclo se detiene y ");
                            System.out.println("   se continúa con la ejecución del código después del ciclo.                      ");
                            System.out.println("   Es importante asegurarse de que la condición finalice en algún momento,         ");
                            System.out.println("   para evitar un ciclo infinito.                                                  ");
                            System.out.println("   El cuerpo del ciclo debe modificar alguna variable que afecte a la condición de la");
                            System.out.println("   la forma que terminara en algún momento.                                        ");
                            System.out.println("---------------------------------------------------------------------------------  ");
                            break;
                        case "b":
                            System.out.println("---------------------------------------------------------------------------------- ");
                            System.out.println(" b  PROGRAMA WHILE                                                               ");
                            System.out.println("---------------------------------------------------------------------------------- ");
                            Scanner scannersum = new Scanner (System.in);
                            System.out.println("Ingrese un número entero :   ");
                            int Sum = scannersum.nextInt();
                            int suma = 0;
                            int i = 1;
                            while(i<= Sum) {
                                suma += i;
                                i++;
                            }
                            System.out.print ("la suma es :  " + suma);

                            break;
                        case "s":
                            break;
                        default:
                            System.out.println("Ingrese una opción válida");
                            break;
                    }
                    break;


                case 10:
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println(" a    Ciclo  For  -- si quieres  ver la explicación digite la opcion a   ");
                    System.out.println(" b    PROGRAMA  FOR      -- si quieres  ejecutarlo digita la opcion  b   ");
                    System.out.println(" s    SALIR");
                    System.out.println("---------------------------------------------------------------------------------- ");
                    String opcionDiez = scanner.next();

                    switch(opcionDiez){
                        case "a":
                            System.out.println("---------------------------------------------------------------------------------  ");
                            System.out.println(" a  Ciclo  For                                                                    ");
                            System.out.println("---------------------------------------------------------------------------------  ");
                            System.out.println("     Es una estructura de control de ciclo que se utiliza para ejecutar un bloque de código");
                            System.out.println("     una cantidad determinada de veces.                                            ");
                            System.out.println("     La sintaxis básica de un ciclo for en Java es la siguiente:                   ");
                            System.out.println("                for (inicialización; condición; actualización) {                   ");
                            System.out.println("                // bloque de código a ejecutar                                     ");
                            System.out.println("                }                                                                  ");
                            System.out.println("                Ejemplo1                                                           ");
                            System.out.println("     La inicialización es el código que se ejecuta al inicio del bucle, normalmente");
                            System.out.println("     se usa para inicializar una variable“contador”.                               ");
                            System.out.println("     La condición es la condición que se evalúa antes de ejecutar el bloque de código.");
                            System.out.println("     Si se cumple, se ejecuta el bloque de código, de lo contrario, se sale del bucle.");
                            System.out.println("     La actualización es el código que se ejecuta después de cada iteración del bucle,");
                            System.out.println("     normalmente se utiliza para actualizar el valor de la variable contador.      ");
                            System.out.println("     Por ejemplo, el siguiente código imprimirá los números del 1 al 10:           ");
                            System.out.println("                for (int i = 1; i <= 10; i++) {                                    ");
                            System.out.println("                System.out.println(i);                                             ");
                            System.out.println("                 }                                                                 ");
                            System.out.println("     En este ejemplo, la inicialización es“int i = 1”, la condición es“i <= 10” la actualización es“i++”. ");
                            System.out.println("     El código dentro del bucle imprime el valor de la variable i en cada iteración.");
                            System.out.println("------------------------------------------------------------------------------     ");
                            break;
                        case "b":
                            System.out.println("-----------------------------------------------------------------------------------");
                            System.out.println(" b PROGRAMA  FOR                                                               ");
                            System.out.println("---------------------------------------------------------------------------------- ");
                            Scanner scannersumatoria = new Scanner (System.in);
                            System.out.println("Ingrese un número entero:   ");
                            int Sumatoria = scannersumatoria.nextInt();
                            int sumatoria = 0;
                            for (int n = 1; n<=Sumatoria; n++) {
                                sumatoria +=n;
                            }
                            System.out.print("La sumatoria es:  " + sumatoria);
                            break;
                        case "s":
                            break;
                        default:
                            System.out.println("Ingrese una opción válida");
                            break;
                    }
                    break;

                case 0:
                    break;
                default:
                    System.out.println (" ********************************************************************");
                    System.out.println (" *                                                                  *");
                    System.out.println (" *             HA SELECCIONADO UNA OPCIÓN INVALIDA,                 *");
                    System.out.println (" *                INGRESE NUEVAMENTE UNA OPCIÓN                     *");
                    System.out.println (" *                                                                  *");
                    System.out.println (" ********************************************************************");
            }
            if (opcion != 0) {
                System.out.println("Presione Enter para continuar...");
                scanner.nextLine(); // Captura el salto de línea restante
                scanner.nextLine(); // Espera a que el usuario presione Enter
                for (int i = 0; i < 10; i++) {
                    System.out.println(" ");
                }
            }

        } while (opcion != 0);//  si ya no se cumple  la condicion se detiene  por eso se coloca cero
        System.out.println("  ****************************************** ");
        System.out.println("  *                                        * ");
        System.out.println("  *                                        * ");
        System.out.println("  *   USTED HA SALIDO DEL MENÚ PRINCIPAL   * ");
        System.out.println("  *        GRACIAS POR SU VISITA           * ");
        System.out.println("  *                                        * ");
        System.out.println("  *                                        * ");
        System.out.println("  *               --*--                    * ");
        System.out.println("  ****************************************** ");


    }
}

