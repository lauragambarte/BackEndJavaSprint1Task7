package nivel1.ejercicio1;

public class TrabajadorOnline extends Trabajador{
    public static final int TARIFA_PLANA=100;//not in the consttructor, because is a constant static
    public TrabajadorOnline(String name, String surname, int age, int preuHora) {
        super(name, surname, age, preuHora);
    }

    @Override
    public int calcularSueldo(int nroHorasMes) {
        int sueldoMes;
        //private preu hora in superclass
        sueldoMes= getPreuHora()*nroHorasMes+TARIFA_PLANA;
        return sueldoMes;

    }

    @Override
    public String toString() {
        return "TrabajadorOnline{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", preuHora=" + getPreuHora() +
                '}';
    }
}

