package org.acruzv.proyectofacturas.modelo;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems; //Para controlar items en el vector ItemFactura
    private int folio;
    private String descripcion;
    private Date fecha;
    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio;//Para autoincrementar el folio automaticamente

    public Factura(Cliente cliente, String descripcion) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;//Auto incrementará el folio cada que sea creada una Factura
        this.fecha = new Date();//Se guardara la fecha actual cuando se crea una nueva Factura
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void setItems(ItemFactura[] items) {
        this.items = items;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void addItemFactura(ItemFactura item) {
        if (indiceItems < MAX_ITEMS) {//Controla el desbordamiento del array
            this.items[indiceItems++] = item; //Autoincrementa el id de item, conforme se va agregando datos
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemFactura item :
                this.items) {//Recorre los items para calcular su importe y acumular el total final.
            if (item != null) {//Omite la sumatoria para los items que sean null
                total += item.calcularImporte();
            }
        }
        return total;
    }

    public String generaDetalle() {
        StringBuilder sb = new StringBuilder("Factura N°: ");
        sb.append(folio)
                .append(" Cliente: ").append(this.cliente.getNombre())
                .append("\t RFC :").append(this.cliente.getRfc())
                .append("\n Descipcion :").append("\t").append(this.getDescripcion())
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha de emision:").append(df.format(this.fecha))
                .append("\n#\tNombre\t$\tCant.\tTotal\n")
                .append("\n");
        for (ItemFactura item : this.items) {
            if (item != null) {
                sb.append(item.getProducto().getCodigo())
                        .append("\t")
                        .append(item.getProducto().getNombre())
                        .append("\t")
                        .append(item.getProducto().getPrecio())
                        .append("\t")
                        .append(item.getCantidad())
                        .append("\t")
                        .append(item.calcularImporte())
                        .append("\n");
            }

        }
        sb.append("\n")
                .append("TOTAL FINAL:")
                .append(calcularTotal());

        return sb.toString();

    }
}
