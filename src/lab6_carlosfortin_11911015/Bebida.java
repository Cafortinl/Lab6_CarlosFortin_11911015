package lab6_carlosfortin_11911015;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Carlos Fortin
 */
public class Bebida {

    private int codigo;
    private String nombre_marca;
    private String nombre_bebida;
    private double cant_azucar;
    private double cant_alcohol;
    private boolean nacional;
    private int no_lote;
    private ArrayList<String> colorantes=new ArrayList();
    private double precio;
    private int cantidad;
    private String fecha_vencimiento;

    public Bebida() {
    }

    public Bebida(int codigo, String nombre_marca, String nombre_bebida, double cant_azucar, double cant_alcohol, boolean nacional, int no_lote, double precio, int cantidad, String fecha_vencimiento, String colorantes) {
        this.codigo = codigo;
        this.nombre_marca = nombre_marca;
        this.nombre_bebida = nombre_bebida;
        this.cant_azucar = cant_azucar;
        this.cant_alcohol = cant_alcohol;
        this.nacional = nacional;
        this.no_lote = no_lote;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fecha_vencimiento = fecha_vencimiento;
        Scanner leer=new Scanner(colorantes);
        while(leer.hasNext()){
            this.colorantes.add(leer.next());
        }
    }

    /*public Bebida(int codigo, String nombre_marca, String nombre_bebida, double cant_azucar, double cant_alcohol, boolean nacional, int no_lote, double precio, int cantidad, String fecha_vencimiento, String colorantes) throws ParseException {
        this.codigo = codigo;
        this.nombre_marca = nombre_marca;
        this.nombre_bebida = nombre_bebida;
        this.cant_azucar = cant_azucar;
        this.cant_alcohol = cant_alcohol;
        this.nacional = nacional;
        this.no_lote = no_lote;
        this.precio = precio;
        this.cantidad = cantidad;
        SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");
        this.fecha_vencimiento = d.parse(fecha_vencimiento);
        Scanner leer=new Scanner(colorantes);
        while(leer.hasNext()){
            this.colorantes.add(leer.next());
        }
    }*/
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_marca() {
        return nombre_marca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }

    public String getNombre_bebida() {
        return nombre_bebida;
    }

    public void setNombre_bebida(String nombre_bebida) {
        this.nombre_bebida = nombre_bebida;
    }

    public double getCant_azucar() {
        return cant_azucar;
    }

    public void setCant_azucar(double cant_azucar) {
        this.cant_azucar = cant_azucar;
    }

    public double getCant_alcohol() {
        return cant_alcohol;
    }

    public void setCant_alcohol(double cant_alcohol) {
        this.cant_alcohol = cant_alcohol;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    public int getNo_lote() {
        return no_lote;
    }

    public void setNo_lote(int no_lote) {
        this.no_lote = no_lote;
    }

    public ArrayList<String> getColorantes() {
        return colorantes;
    }

    public void setColorantes(ArrayList<String> colorantes) {
        this.colorantes = colorantes;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }
    
    public String getColor(int pos){
        return this.colorantes.get(pos);
    }
    
    public void setColor(String color){
        this.colorantes.add(color);
    }
    
    public String getNacional(){
        if(nacional)
            return "Si";
        else
            return "No";
    }
    
    public String getColoresS(){
        String salida="";
        for (String c : colorantes) {
            salida+=c+",";
        }
        return salida;
    }

    @Override
    public String toString() {
        return nombre_bebida;
    }
    
    
    
}
