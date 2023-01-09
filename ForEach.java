package estructurascontrol.repeticion;
//https://campus.open-bootcamp.com/cursos/5/leccion/2522 Bucle ForEach
public class ForEach {
    public static void main(String[] args) {
        String[] nombres = {"Mauro", "Juana", "Carlos", "Gabriel"};
        for(String nombre : nombres){
            System.out.println(nombres);
            System.out.println(nombre);
        }

        int[] numeros = {1,2,3,4,5,6};
        int suma = 0;
        for(int numero : numeros){
            System.out.println(numeros);
            System.out.println(numero);
            suma += numero; // suma consecutivamente todos los numeros del array : 21
        }
        System.out.println(suma);
    }
}
