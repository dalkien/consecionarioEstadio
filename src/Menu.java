import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<AsesorComercial> ventas = new ArrayList<>();
    public void loadMenu(){
        boolean salida = false;

        while (!salida){
            System.out.println("ingrese la opcion del menu: \n 1) Asesores comerciales \n 2)  Partido de futbol ");
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            if (opcion == 1){
                //llama a asesor comercial
                asesorComercial(sc);
            }else if(opcion == 2){
                // llama a partido
            }else {
                salida = true;
            }
        }
    }

    public void asesorComercial(Scanner sc){
        boolean total = false;
        while (!total){
            System.out.println("seleccione 1 para realizar calculo por empleado y 2 para adicionar venta ");
            int option = sc.nextInt();
            if (option == 2){
                System.out.println(" ingrese los siguientes datos de la venta separados por coma " +
                        "  Código, nombres, apellidos, sueldo mensual, marca del auto vendido, valor del auto vendido. \n " +
                        "no ingresar espacios o replazarlos por _");
                String first = sc.next();
                String[] datosAsesor = first.split(",");

                AsesorComercial asesorComercial = new AsesorComercial(datosAsesor);
                ventas.add(asesorComercial);
            }else {
                List<Integer> codigosRevisados = new ArrayList<>();
                for (int i = 0; i < ventas.size(); i++){
                    double bono = 0;
                    double sueldo = ventas.get(i).getSueldoMensual();
                    double comision = 0;
                    if (!codigosRevisados.contains( ventas.get(i).getCodigo())){
                        for (int j = 0; j < ventas.size(); j++){
                            if(ventas.get(i).getCodigo() == ventas.get(j).getCodigo()){
                                bono += 100000.00;
                                comision += (ventas.get(j).getValorAutoVendido()*2)/100;
                            }
                        }
                        double salarioNeto = sueldo+bono+comision;
                        System.out.println( "para el empleado :" +  ventas.get(i).getNombre() + " " + ventas.get(i).getApellido() +
                                "\n el salario neto es " + salarioNeto );

                        codigosRevisados.add( ventas.get(i).getCodigo());
                    }
               }

            }
        }
    }

    public void partidoF(Scanner sc){

    }

}
