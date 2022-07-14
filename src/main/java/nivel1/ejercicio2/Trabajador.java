package nivel1.ejercicio2;

public class Trabajador {
    private String name;
     private String surname;
     private int age;
     private int preuHora;

    public Trabajador(String name, String surname, int age, int preuHora) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.preuHora = preuHora;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPreuHora() {
        return preuHora;
    }

    public void setPreuHora(int preuHora) {
        this.preuHora = preuHora;
    }
public int calcularSueldo(int nroHoras){
int sueldo;
sueldo=nroHoras*this.preuHora;
return sueldo;

}
    @Override
    public String toString() {
        return "Trabajador{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", preuHora=" + preuHora +
                '}';
    }
}

