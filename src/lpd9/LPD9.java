package lpd9;

import java.util.HashMap;
import java.util.Scanner;

public class LPD9 {

    public static void main(String[] args) {
        // creo mi diccionario utilizando mi clase HashMap<indico mis dos palabras ingresadas por el usuario que se van a leer como un string o cadena de texto> mi Map almacena elementos como pares de clave y valor, aqui es un diccionario en español (clave) a inglés(valores)
    	//he denominado mi variable llamada diccionario que es un objeto de la clase HashMap, variable donde voy a almacenar los pared de palabras
    	//utilizo mi método put() para ir agregando las elementos a mi HashMap
        HashMap<String, String> diccionario = new HashMap<>();

        // Agregar al menos 20 palabras con sus traducciones
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("mesa", "table");
        diccionario.put("pato", "duck");
        diccionario.put("manzana", "apple");
        diccionario.put("libro", "book");
        diccionario.put("nube", "cloud");
        diccionario.put("sol", "sun");
        diccionario.put("piano", "piano");
        diccionario.put("agua", "water");
        diccionario.put("fuego", "fire");
        diccionario.put("tierra", "earth");
        diccionario.put("viento", "wind");
        diccionario.put("sound", "sonido");
        diccionario.put("niña", "girl");
        diccionario.put("escuela", "school");
        diccionario.put("profesor", "teacher");
        diccionario.put("estudiante", "student");
        diccionario.put("platano", "banana");

        // solicito al usuario que intgrese su palabra, por lo que tengo que emplear mi scanner para leer la entrada del usuario y entonces denomino al string recibido como palabraEsp y uso mi metodo .nextLine() para reconocerlo como string y y almacenarlo, mientras que toLowerCase() para poder transformar el string a minusculas y que coincida con mi clave
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra en español: ");
        String palabraEsp = scanner.nextLine().toLowerCase();

        // primero tengo que comprobar si la palabra ingresada (palabraEsp) se encuentra en mi diccionario (HashMap), 
        //por lo que uso mi metodo .contaisnKey() para saber si la clave ingresa por el usuario existe (devueñve un vañpr booleano-true o false-), en este caso mi clave corresponde a la palabra en español, de lo contrario imprimo que no se encuentra en el diccionario
        //busco las palabras en mi diccionario con mi método get() para poder acceder al valor (palabra en inglés)
        if (diccionario.containsKey(palabraEsp)) {
            System.out.println("La traducción en inglés es: " + diccionario.get(palabraEsp));
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }

        scanner.close();
    }
}

/*
 * HashMap
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashMap.html

put
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashMap.html#put(K,V)

conainsKey() 
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html#containsKey(java.lang.Object)

<>
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Comparable.html

get()
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html#get(java.lang.Object)

toLoweCase()
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#toLowerCase()

 * */


/*Crear un programa en Java que realice lo siguiente:
Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
Utiliza un objeto HashMap para almacenar los pares de palabras.
Debe solicitar al usuario una palabra en español e imprimir por consola la palabra en inglés.
Si la palabra escrita no se encuentra en el diccionario debe imprimir un mensaje por consola, diciendo que: “La palabra no se encuentra en el diccionario.”.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
gato
cat
Entradas: 
Salida:
Siempre y cuando la palabra se encuentre en el diccionario
Pruébalo con diferentes palabras.*/