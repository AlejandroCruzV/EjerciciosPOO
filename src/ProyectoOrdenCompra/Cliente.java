package ProyectoOrdenCompra;
/**
 * DATE WRITEN: 22-03-2025
 * @author ALEJANDRO CRUZ VELAZQUEZ
 * Crear la clase Cliente con dos atributos nombre y apellido, inicializar todos sus valores en el constructor e
 * implementar sus respectivos métodos getter.
 */
public class Cliente {
    private String name;
    private String surname;

    public Cliente(String name, String surname) {
        this.name = name;
        this.surname = surname;
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
}
