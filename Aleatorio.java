import javax.swing.JOptionPane;

public class Aleatorio {
    // Definir variables
    static String nombre="", documento="", nomGanador="", docGanador="", premio1="Smart TV", premio2="Laptop", premio="";
    static int opPremio, eleccion=0, ganador=0, fin=0, finRifa=0, fallo=0, cont=1;
    static double numeroA=0, aleatorio=0;

    public static void main(String args[]) {
        // Definir variables
        int inicio=0;
        // Saludo
        JOptionPane.showMessageDialog(null,"☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸\nBIENVENIDO AL PROGRAMA DE ADIVINAR NÚMERO\n☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸","LUCHINI S.A.S",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        // Ciclo para menú
        do {
            // Elegir opción del menú
            inicio=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccionar opción:\n   - Opción 1: Adivinar número entre 3 personas.\n   - Opción 2: Salir programa.","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE));  
            // Opciones menú
            switch (inicio) {
                // Opción de hacer la rifa
                case 1:
                    // Proceso de conseguir el número aleatorio
                    aleatorio=Math.random();
                    aleatorio=aleatorio*10;
                    numeroA=Math.round(aleatorio);
                    // Ir al método de la rifa
                    Inicio();
                    break;
                // Opción de cerrar sistema 
                case 2:
                    // Mensaje de cerrar sistema
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema...","LUCHINI S.A.S",JOptionPane.WARNING_MESSAGE);
                    break;
                // Opción de digitación incorrecta
                default:
                    // Mensaje de error de digitación
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (inicio!=2);
    }

    static void Inicio() {
        // Definir variables
        int personas=0, p1=0, p2=0, p3=0;
        // Ciclo para menú
        do {
            // Elegir opción del menú
            opPremio=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccionar opción de premio para la rifa:\n   - Opción 1: Smart TV.\n   - Opción 2: Laptop.","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE));
            // Condición para asignar premio elegido
            if (opPremio==1) {
                premio=premio1;
                ++fin;
            }
            else if (opPremio==2) {
                premio=premio2;
                ++fin;
            }
            else {
                // Mensaje de error de digitación
                JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (fin==0);
        // Reiniciar variable
        fin=0;
        // Ciclo para menú
        while (fin<3) {
            // Elegir opción del menú
            personas=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccionar opción:\n   - Opción 1: Números de la persona N°1.\n   - Opción 2: Números de la persona N°2.\n   - Opción 3: Números de la persona N°3.","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE));
            // Opciones menú
            switch (personas) {
                // Opción de pedir números a la primer persona
                case 1:
                    // Condición para una única elección de números
                    if (p1==0) {
                        // Ir al método de la primer persona
                        Persona1();
                        ++p1; ++fin;
                    }
                    else {
                        // Mensaje de alerta
                        JOptionPane.showMessageDialog(null,"La primer persona ya ingresó sus respectivos números.","(∩ ͡° ͜ʖ ͡°)⊃",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                // Opción de pedir números a la segunda persona
                case 2:
                    // Condición para una única elección de números
                    if (p2==0) {
                        // Ir al método de la segunda persona
                        Persona2();
                        ++p2; ++fin;
                    }
                    else {
                        // Mensaje de alerta
                        JOptionPane.showMessageDialog(null,"La segunda persona ya ingresó sus respectivos números.","(∩ ͡° ͜ʖ ͡°)⊃",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                // Opción de pedir números a la tercera persona
                case 3:
                    // Condición para una única elección de números
                    if (p3==0) {
                        // Ir al método de la tercera persona
                        Persona3();
                        ++p3; ++fin;
                    }
                    else {
                        // Mensaje de alerta
                        JOptionPane.showMessageDialog(null,"La tercera persona ya ingresó sus respectivos números.","(∩ ͡° ͜ʖ ͡°)⊃",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                // Opción de digitación incorrecta
                default:
                    // Mensaje de error de digitación
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
        // Ir al metodo de resultado de la rifa
        Resultado();
    }

    public static void Persona1() {
        // Pedir nombre
        nombre=JOptionPane.showInputDialog(null,"Ingresar nombre completo:","☸☸☸FIN ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
        // Pedir documento
        documento=JOptionPane.showInputDialog(null,"Ingresar número de documento de identidad:","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
        for (cont=1;cont<=3;cont++) {
            eleccion=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar número entero del 1 al 10:","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE));
            if (eleccion==numeroA&&ganador==0) {
                nomGanador=nombre;
                docGanador=documento;
                ++ganador;
                ++fallo;
            }
        }
        if (fallo==0) {
            ++finRifa;
        }
    }

    public static void Persona2() {
        // Pedir nombre
        nombre=JOptionPane.showInputDialog(null,"Ingresar nombre completo:","☸☸☸FIN ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
        // Pedir documento
        documento=JOptionPane.showInputDialog(null,"Ingresar número de documento de identidad:","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
        for (cont=1;cont<=3;cont++) {
            eleccion=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar número entero del 1 al 10:","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE));
            if (eleccion==numeroA&&ganador==0) {
                nomGanador=nombre;
                docGanador=documento;
                ++ganador;
                ++fallo;
            }
        }
        if (fallo==0) {
            ++finRifa;
        }
    }

    public static void Persona3() {
        // Pedir nombre
        nombre=JOptionPane.showInputDialog(null,"Ingresar nombre completo:","☸☸☸FIN ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
        // Pedir documento
        documento=JOptionPane.showInputDialog(null,"Ingresar número de documento de identidad:","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
        for (cont=1;cont<=3;cont++) {
            eleccion=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar número entero del 1 al 10:","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE));
            if (eleccion==numeroA&&ganador==0) {
                nomGanador=nombre;
                docGanador=documento;
                ++ganador;
                ++fallo;
            }
        }
        if (fallo==0) {
            ++finRifa;
        }
    }

    public static void Resultado() {
        if (ganador==1) {
            JOptionPane.showMessageDialog(null,"FELICIDADES, TENEMOS UN GANADOR","☸☸☸FELICITACIONES☸☸☸",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"   - Nombre ganador: "+nomGanador+".\n   - Documento ganador: "+docGanador+".\n   - Premio: "+premio+".\n   - Número de la rifa: "+numeroA+".","☸☸☸GANADOR☸☸☸",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (finRifa==3) {
            JOptionPane.showMessageDialog(null,"FIN DE LA RIFA","☸☸☸FIN ADIVINAR NÚMERO☸☸☸",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
