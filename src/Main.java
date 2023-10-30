import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        class Cuenta {

            private double cantidad;
            String name;

            double saldo;
            double retirar;
            double ingresar;
            double consultar;

            public void setRetirar(double retirar) {
                this.retirar = retirar;
            }

            public void setIngresar(double ingresar) {
                this.ingresar = ingresar;
            }


            public double getConsultar() {
                return consultar;
            }

            public void setConsultar(double consultar) {
                this.consultar = consultar;
            }

            public Double getRetirar() {
                return retirar;
            }

            public void setRetirar(Double retirar) {
                this.retirar = retirar;
            }

            public Double getIngresar() {
                return ingresar;
            }

            public void setIngresar(Double ingresar) {
                this.ingresar = ingresar;
            }

            public double getSaldo() {
                return saldo;
            }

            public void setSaldo(double saldo) {
                this.saldo = saldo;
            }

            public Cuenta(double cantidad, String name, double saldo, Double retirar, Double ingresar) {
                this.cantidad = cantidad;
                this.name = name;
                this.saldo = saldo;
                this.retirar = retirar;
                this.ingresar = ingresar;
            }

            public double getCantidad() {
                return cantidad;
            }

            public void setCantidad(double cantidad) {
                this.cantidad = cantidad;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }


            public void ingresar(double cantidadIngresar) {
                if (cantidadIngresar > 0) {
                    this.saldo += cantidadIngresar;
                }
            }

            public void retirar(double cantidadRetirar) {
                if (cantidadRetirar < 0 && cantidadRetirar < this.saldo) ;
                this.saldo -= cantidadRetirar;
            }

            public double consultar() {
                return this.saldo;
            }

            public boolean transferir(int numeroCuenta, double cantidadTranferir) {
                System.out.println("se le va a transferir $" + cantidadTranferir + "a este numero" + numeroCuenta);
                if (cantidadTranferir < 0 && cantidadTranferir > this.saldo)

                    this.setSaldo(this.saldo - cantidadTranferir);

                if (1 == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        }


        Cuenta cuenta1 = new Cuenta(0, "tete");

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese cantidad ");
        double cantidadIngresar = sc.nextDouble();
        cuenta1.ingresar(cantidadIngresar);
        System.out.println("su saldo actual es " + cuenta1.getSaldo());

        System.out.println("cuando desea retirar");
        double cantidadRetirar = sc.nextDouble();
        cuenta1.retirar(cantidadRetirar);
        System.out.println("su retiro fue de " + cantidadRetirar + "su saldo actual es" + cuenta1.getSaldo());


    }


}
