public class AsesorComercial {
    //  Código, nombres, apellidos, sueldo mensual, marca del auto vendido, valor del auto vendido.

    private int codigo;
    private String nombre;
    private String apellido;
    private double sueldoMensual;
    private String marcaAutoVendido;
    private double valorAutoVendido;

    public AsesorComercial(int codigo, String nombre, String apellido, double sueldoMensual, String marcaAutoVendido, double valorAutoVendido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoMensual = sueldoMensual;
        this.marcaAutoVendido = marcaAutoVendido;
        this.valorAutoVendido = valorAutoVendido;
    }

    public AsesorComercial(String ... datos) {
        this.codigo = Integer.valueOf(datos[0]) ;
        this.nombre = datos[1];
        this.apellido = datos[2];
        this.sueldoMensual = Double.valueOf(datos[3]) ;
        this.marcaAutoVendido = datos[4];
        this.valorAutoVendido = Double.valueOf(datos[5]);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public String getMarcaAutoVendido() {
        return marcaAutoVendido;
    }

    public void setMarcaAutoVendido(String marcaAutoVendido) {
        this.marcaAutoVendido = marcaAutoVendido;
    }

    public double getValorAutoVendido() {
        return valorAutoVendido;
    }

    public void setValorAutoVendido(double valorAutoVendido) {
        this.valorAutoVendido = valorAutoVendido;
    }
}
