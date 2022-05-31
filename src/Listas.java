public class Listas {
    private   int id;
     private   String nombre;
     private   int precio;
    public  Listas(int id, String nombre, int precio){

        super();
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;

    }
    public int getPrecio(){
        return precio;
    }
    public String getNombre() {
        return nombre;

    }
    public int getId(){
        return id;
    }



}

