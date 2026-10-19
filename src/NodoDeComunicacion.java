public class NodoDeComunicacion {

    private static int contadorNodos;
    private static int contdorConex=0;
    private final int max_conexiones = 10;
    private int conexiones_activas=0;
    private int id;
    private boolean conectado = true;


    public NodoDeComunicacion(int id) {
        contadorNodos++;
        setId(contadorNodos, id, max_conexiones);
        setConexionesActivas(max_conexiones, contdorConex);
        this.conectado = conectado;
    }

    public int getId(){
        return id;
    }


    public boolean isConectado() {
        return conectado;
    }

    public int getConexiones_activas() {
        return contdorConex;
    }

    public int getMax_conexiones() {
        return max_conexiones;
    }

    public static int getNodosCreadosCorrectamente() {
        return contadorNodos;
    }


    private void setId(int contadorNodos, int id, int max_conexiones) {
            if (id<0){
                System.out.println("Id invalido debe ser mayor que 0, se le asignara el 0");
            }else {
                this.id = id;
                contadorNodos++;
            }
    }


    public void setConexionesActivas(int max_conexiones, int contadorConex) {
        if (contadorConex>max_conexiones){
            System.out.println("Capacidad max alcanzada (10), no puede ingresar uno nuevo");
            System.out.println("Nodos creados correctamente: "+ getNodosCreadosCorrectamente());
        }else{
            contadorConex++;
            this.conexiones_activas = contadorConex;
        }
    }

    public void conectar(){
            contdorConex++;
            conexiones_activas=contdorConex;
            conectado=true;
            System.out.println("El nodo ha sido conectado correctamente hay " + getConexiones_activas() + " conexiones");

    }

    public void desconectar(){
        if(conexiones_activas==0){
            System.out.println("No hay conex");
        }else {

            conexiones_activas = conexiones_activas - 1;
            conectado = false;
            System.out.println("El nodo ha sido desconectado correctamente");
        }

    }


}



