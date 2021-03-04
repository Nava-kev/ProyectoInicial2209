
package mx.unam.aragon.dp;

import java.util.Set;

public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado emp1= new Empleado(1, "Sistemas", 45000.0f, 15);
            emp1.setNombre("Juan José");
            emp1.setApPaterno("Garcia");
            emp1.setEdad(24);
            emp1.setCurp("GABJ121212HDFTR2");
            
            System.out.println("info:" + emp1);
            
        
    }
    
}