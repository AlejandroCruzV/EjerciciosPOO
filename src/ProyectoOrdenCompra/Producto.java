package ProyectoOrdenCompra;
/**
 * DATE WRITEN: 22-03-2025
 * @author ALEJANDRO CRUZ VELAZQUEZ
 * Crear la clase Producto con tres atributos fabricante tipo String y nombre String y precio int, inicializar todos sus
 * valores en el constructor e implementar sus respectivos métodos getter.
 */
public class Producto {
    private String manufacturer;
    private String name;
    private float price;


    public Producto(String manufacturer, String name, float price) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
