package nivel1.ejercicio2;

public class Main   {
    public static void main(String[] args) {
        Trabajador LauraGambarte= new TrabajadorPresencial("Laura", "Gambarte",30,10);
        Trabajador MartaGambarte= new TrabajadorOnline("Marta", "Gambarte",57,15);

        TrabajadorPresencial.setGasolina(200);
      
        System.out.println(LauraGambarte.toString()+"sueldoMes="+ LauraGambarte.calcularSueldo(100));
        System.out.println(MartaGambarte.toString()+"sueldoMes="+ MartaGambarte.calcularSueldo(160));
        //LauraGambarte variable is of type Trabajador and Trabajador doesn't have the plussueldo.
        //noinspection deprecation
        ((TrabajadorPresencial)LauraGambarte).plusSueldo(200);
        //noinspection deprecation
        ((TrabajadorOnline)MartaGambarte).plusSueldo(100);
        System.out.println(LauraGambarte.toString()+"sueldoMes="+ LauraGambarte.calcularSueldo(100));
    }
}
