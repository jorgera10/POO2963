package ec.edu.espe.FastPay.model;

import ec.edu.espe.FastPay.controller.Article;

public class Factura extends Article{
    private String numFactura;
    private String fecha;
    private Double iva;
    private Double precio;
    private int cantidad;
    private Double subtotal;
    private Double total;
    

    public Factura(String numFactura, String fecha, Double iva, Double precio, int cantidad, Double subtotal, Double total, int id_article, String name) {
        super(id_article, name);
        this.numFactura = numFactura;
        this.fecha = fecha;
        this.iva = iva;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.total = total;
    }

    public Factura(String toString, String toString0, String toString1, String toString2, String toString3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public int getId_article() {
        return id_article;
    }

    @Override
    public void setId_article(int id_article) {
        this.id_article = id_article;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    
}