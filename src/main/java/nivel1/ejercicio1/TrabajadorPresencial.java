package nivel1.ejercicio1;

public class TrabajadorPresencial extends Trabajador{
    static int gasolina;//only for trabajadorprencial, for every object, static doesn't make sense to have in the constructor,

    public static int getGasolina() {
        return gasolina;
    }

    public static void setGasolina(int gasolina) {
        TrabajadorPresencial.gasolina = gasolina;
    }

    public TrabajadorPresencial(String name, String surname, int age, int preuHora) {
        super(name, surname, age, preuHora);
    }

    @Override
    public int calcularSueldo(int nroHorasMes) {
        int sueldoMes;
        //private preu hora in superclass
        sueldoMes= getPreuHora()*nroHorasMes+gasolina;
        return sueldoMes;
    }

    @Override
    public String toString() {
        return "TrabajadorPresencial{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", preuHora=" + getPreuHora() +
                '}';
    }
}
