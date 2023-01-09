package estructurascontrol.repeticion;
/*
*  El siguiente codigo, concatena los elementos String de un array
*  mientras los almacena en una variable, para ser
*  impresos posteriormente en una sola linea utilizando + o concat.
*/
public class ConcatenarTextos {
    public static void main(String[] args) {

        String[] nombres = {"Pepito", "Janito", "everyday"};
        String sumaStrings = "";

        for(String nombre : nombres){
                sumaStrings += nombre + " ";
        }
        System.out.println("Los nombres concatenados son los siguientes:\n" + sumaStrings);

    }
}
