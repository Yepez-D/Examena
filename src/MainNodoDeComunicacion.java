import static java.lang.System.*;

public class MainNodoDeComunicacion {
    static void main() {

        NodoDeComunicacion n1 = new NodoDeComunicacion(110);
        NodoDeComunicacion n2 = new NodoDeComunicacion(-1);


        out.println("El id es: "+n1.getId());
        out.println();
        out.println(n1.isConectado());
        out.println(n1.getConexiones_activas());
        n1.conectar();
        out.println(n1.getConexiones_activas());
        n1.conectar();
        System.out.println(n1.getConexiones_activas());
        n1.desconectar();
        n1.desconectar();
        n1.desconectar();

        out.println("n2");
        out.println("El id " + n2.getId());


    }
}
