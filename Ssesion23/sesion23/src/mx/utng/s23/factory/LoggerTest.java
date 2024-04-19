package mx.utng.s23.factory;

import java.util.Scanner;

public class LoggerTest {
    public static void main(String[] args) {
        //declarar un objeto loggerfactory
        LoggerFactory factory = new LoggerFactory();
        //EL usuario tecleara el typo
        Scanner scanner = new Scanner (System.in);
        System.out.println("Teclea el tipo de Logger: (1)Archivo (2)Consola");
        int type = scanner.nextInt();
        scanner.close();
        //Crear el logger elegido por usuario
        Logger logger = factory.getLogger(type);
        logger.log("Registro de eventos del sistema");
        

        
    }
}
