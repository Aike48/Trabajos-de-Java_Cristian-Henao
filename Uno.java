package arraylist;
import java.util.ArrayList;
import java.util.List;

public class Uno {
	public static void main(String[] args) {
		
		        ArrayList<String> colores = new ArrayList<>();

		        colores.add("rojo");
		        colores.add("azul");
		        colores.add("verde");
		        colores.add("amarillo");
		        colores.add("negro");

		        int cantidadPalabras = colores.size();
 
		        System.out.println("1.El ArrayList contiene " + cantidadPalabras + " palabras.");
		    
		        
//Ejercicio dos
				ArrayList<Integer> numeros = new ArrayList<>();
			
			    numeros.add(10);
			    numeros.add(20);
			    numeros.add(30);
			    numeros.add(40);
			    numeros.add(50);
			
			    if (numeros.contains(30)) {
			        System.out.println("2.Encontrado");
			    } else {
			        System.out.println("2.No encontrado");
			    }
			    

//Ejercicio tres
			    
			    ArrayList<Integer> numeros3 = new ArrayList<>();

		        numeros3.add(5);
		        numeros3.add(10);
		        numeros3.add(15);
		        numeros3.add(20);
		        numeros3.add(25);


		        int suma = 0;
		        for (int num : numeros3) {
		            suma += num;
		        }
		        double promedio = (double) (suma / numeros3.size());


		        System.out.println("3.El promedio de los elementos en el ArrayList es: " + promedio);
		        
		        
//Ejercicio 4
		        
        		ArrayList<String> animales = new ArrayList<>();

                animales.add("perro");
                animales.add("gato");
                animales.add("pájaro");
                animales.add("pez");
                animales.add("ratón");

                int indice = animales.indexOf("pájaro");
                if (indice != -1) {
                    animales.set(indice, "hamster");
                }

                System.out.println("4.ArrayList resultante después del reemplazo:");
                for (String animal : animales) {
                    System.out.println(animal);
                }
                
         
//Ejercicio 5
                ArrayList<Integer> numeros5 = new ArrayList<>();

                for (int i = 1; i <= 10; i++) {
                    numeros5.add(i);
                }

                List<Integer> subLista = numeros5.subList(3, 7); 

                System.out.println("5.Sublista de números del 4 al 7:");
                for (int num : subLista) {
                    System.out.println(num);
                }

}
}
