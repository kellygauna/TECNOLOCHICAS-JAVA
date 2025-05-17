import java.util.Scanner;

public class CajeroAutomatico {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); //objeto Scanner

            var saldo = 1000.0; //valor inferido por java
            //HAY QUE DEFINIR UNA VARIABLE PARA QUE SE PUEDA LEER Y/O
            //ALMACENAR LO QUE PONGA EL USUARIO.
            int opcion; //ya que va a ser un numero -> int

            do {
                //Mostrar el menu de las opciones
                System.out.println("\nBienvenido al cajero automatico");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Depositar dinero");
                System.out.println("3. Retirar dinero");
                System.out.println("4. Salir");
                System.out.println("Seleccione una opción:");

                opcion = scanner.nextInt(); //LEER LA OPCION ELEGIDA
                //MANEJAR LAS OPCIONES DEL MENU con Switch
                switch (opcion) {
                    case 1 -> { //consultar saldo
                        System.out.println("Tu saldo actual es: $" + saldo);
                    }
                    case 2 -> { //depositar dinero
                        System.out.println("Ingresa el monto a depositar: $");
                        double deposito = scanner.nextDouble();

                        if (deposito <= 0){ //deposito menor o igual a cero no se puede
                            System.out.println("El monto debe ser mayor a 0.");
                            continue; //Volver al menu sin modificar el saldo
                        }

                        saldo += deposito; //aumenta el deposito al saldo y actualiza la variable
                        System.out.println("Deposito realizado. Saldo actualizado: $" + saldo);
                    }
                    case 3 -> { //retirar dinero
                        System.out.println("Ingrese el monto a retirar: ");
                        double retiro = scanner.nextDouble();

                        if (retiro <= 0){
                            System.out.println("El monto debe ser mayor a 0.");
                            continue; //Volver al menu sin modificar el saldo
                        }
                        if (retiro > saldo){ //retiro mayor a saldo
                            System.out.println("Saldo insuficiente. Tu saldo es: $" + saldo);
                        } else {
                            saldo -= retiro; //quitamos el retiro del saldo
                            System.out.println("Retiro Exitoso. Saldo restante: $" + saldo);
                        }
                    }
                    case 4 -> { //salir del programa
                        System.out.println("GRACIAS por usar el cajero.¡Vuelva pronto!");
                    }
                    default -> { //opcion no valida
                        System.out.println("Opcion invalida. Intenta con otra opcion nuevamente");
                    }
                }
            } while (opcion != 4);

            scanner.close();
            }

        }