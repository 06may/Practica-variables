###VARIABLES222
### Mesa de trabajo: Duración 50 minutos
En esta práctica deberás crear un proyecto en Java para trabajar con **Clases** y practicar la declaración de variables, tipos de datos, casting, boxing y unboxing.
### Ejercicio 1: Crear una clase y declarar variables
### Objetivo:
Configurar un entorno de desarrollo, declarar variables de diferentes tipos e imprimirlas en consola.
### Indicaciones:
1. Crea un proyecto en Java de nombre `Practica-1-Variables` que contenga un paquete llamado `Variables` y, finalmente, una clase llamada `DeclaraVariables` con un método principal. Recuerda que el método principal se puede crear al momento de crear la clase. *(Pista: inicia con `public static...`)*.
2. Dentro de la clase, crea las siguientes variables según tu criterio para:
   - Almacenar el nombre de una mascota.
   - Almacenar un número con 3 decimales.
   - Almacenar el valor del dólar que se mantenga constante.
   - Almacenar el valor de Pi con los primeros 7 decimales.
   - Almacenar el valor de Euler con los primeros 15 decimales.
3. Dentro de la clase, imprime en consola las variables creadas. *(Pista: inicia con `System.out...`)*.

### codigo
 
    ´´´Java

    package variables;

    public class Deaclavariables {

    public static void main(String[] args){

        String mascota = "nena";

        double decimales = 2.345;

        final int dolar;

        dolar = 16;

        double pi = 3.1415926;

        double euler = 2.718281828459045;

        System.out.println("var1: " +mascota);

        System.out.println("var2: " +decimales);

        System.out.println("var3: " +dolar);

        System.out.println("var4: " +pi);

        System.out.println("var5: " +euler);
    }
     }

    ´´´
### Ejercicio 2: Corregir errores en la declaración de variables
### Objetivo:
Transcribir un código con varias declaraciones de variables y corregir los errores que se encuentren, aplicando lo aprendido en clase sobre tipos de datos y sintaxis.
### Indicaciones:
1. Crea una segunda clase llamada `CorrigeVariables` con su correspondiente método principal.
2. Transcribe el código que contiene la declaración de variables y después corrige las que así lo requieran, de acuerdo a lo visto en clase:


Double a = 9;

int b = ‘B’;

String c = “Colombia”;

char d = ‘A’;

foat e = 832248M;

int 1numero;

String nombre-persona;

double edad;

int pesoReal = Double.parseDouble(peso);

int double = 96;

edad = 25;

int x = 45;

int y = 14;

String g = k;



### Codigo

	´´´Java

	package variables;

	public class CorrigeVariables {

    	public static void main(String[] args) {

        // Declaración e inicialización de variables

        int a = 9;

        String b = "B";

        String c = "colombia";

        char d = 'A';

        float e = 832248.2f;

        int numero;

        String nombre = "persona";

        int edad;

        int f = 9;

        int edadd = 25;

        int x = 45;

	int y = 14;

        String g = "k";

        Double pesoReal = Double.parseDouble("65");

        // Impresión de las variables

        System.out.println("var1: " + a);  // Imprime el valor de 'a'

        System.out.println("var2: " + b);  // Imprime el valor de 'b'


        System.out.println("var3: " + c);  // Imprime el valor de 'c'


        System.out.println("var4: " + d);  // Imprime el valor de 'd'

        System.out.println("var5: " + e);  // Imprime el valor de 'e'

        System.out.println("var6: " + nombre);  // Imprime el valor de 'nombre'

       }
    }

    ´´´
### Ejercicio 3: Casting de variables en Java

### Objetivo:
Practicar cómo manejar y transformar datos en tu código, asegurando que los tipos de datos sean correctos para operaciones específicas y evitando errores de conversión.
### Indicaciones:
### 1. Crear la clase
Crea una nueva clase llamada `CasteoVariables` con su respectivo método principal.
### 2. Realizar conversiones y casteos
Declara variables para realizar las siguientes conversiones:
- Convierte un valor de tipo **String** a **int**.
- Convierte un valor de tipo **String** a **double**.
- Convierte un valor de tipo **int** a **String**.
- Convierte un valor de tipo **double** a **String**.
- Realiza un casting de **double** a **int** y de **int** a **double**.

- Convierte un valor de tipo **String** a **boolean** y viceversa.

- Realiza un casting entre **float**, **long**, y **byte**.

### 3. Practicar el boxing y unboxing implícitos entre `int` e `Integer`

1. Declara una variable de tipo `int` y asigna un valor.
2. Usa **auto-boxing** para convertir el `int` a `Integer` y almacena el resultado en una variable de tipo `Integer`.
3. Usa **unboxing** para convertir el `Integer` de nuevo a `int` y almacena el resultado en una variable de tipo `int`.
4. Imprime las variables para verificar los valores.

### 4. Practicar el boxing y unboxing con diferentes tipos primitivos
1. Declara variables de los siguientes tipos primitivos: `float`, `double`, y `boolean`.
2. Usa **boxing** para convertir cada tipo primitivo a su correspondiente clase envolvente: `Float`, `Double`, y `Boolean`.
3. Usa **unboxing** para convertir cada clase envolvente de nuevo a su tipo primitivo.
4. Imprime todas las variables para verificar los valores.
### Notas:
- Utiliza el método `System.out.println()` para imprimir los resultados en consola.
- Si encuentras errores en la conversión, verifica que los valores sean compatibles con el tipo de dato de destino.
- Recuerda que Java permite **casting explícito** y **auto-boxing/unboxing** para simplificar el manejo de datos entre primitivos y clases envolventes.

### codigo
    ´´´Java

        package variables;

        import java.lang.invoke.VarHandle;

        public class CasteoVariables {

        public static void main(String[] args) {

        // Declaración y asignación de variables

        String LetraNum = "23";

        int NumeroLetra = 78;

        double NumeroLetrau = 89;

        double NumeroLetrad = 7.9;

        int NumeroEnter = 14;

        // Conversión de String a Integer

        int NumberONE = Integer.parseInt(LetraNum);

        // Conversión de String a Double

        double NumberDou = Double.parseDouble(LetraNum);

        // Conversión de Integer a String

        String LetraStr = String.valueOf(NumeroLetra);

        // Conversión de Double a String

        String LetraDou = String.valueOf(NumeroLetrau);

        // Conversión de Double a Integer (Casteo explícito)

        int NumberEnt = (int) NumeroLetrad;

        // Conversión de Integer a Double (Casteo explícito)

        Double StriBole = (double) NumeroEnter;

        // Declaración y uso de variables booleanas

        String VerdaderoAtex = "true";

        boolean VerdadUno = true;
        
      }
    }

    ´´´

