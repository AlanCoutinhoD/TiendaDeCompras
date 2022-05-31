import java.util.ArrayList;
import java.util.List;

public class Objetos {





    public static void ListaObjetos(){
        Listas o1 = new Listas(1,"Papausa",2);
        Listas o2 = new Listas(2,"Sexo Por Kilo",3);
        Listas o3 = new Listas(3,"Chileancho",5);
        Listas o4 = new Listas(4,"Manzana",6);
        Listas o5 = new Listas(5,"Tomate",7);
        List<Listas> lista = new ArrayList<Listas>();
        lista.add(o1);
        lista.add(o2);
        lista.add(o3);
        lista.add(o4);
        lista.add(o5);
        for (Listas o:lista) {


            System.out.printf("ID: "+o.getId());
            System.out.printf(" Nombre: " + o.getNombre());
            System.out.print(" Precio: " + o.getPrecio());
            System.out.println("");



        }


    }

}
