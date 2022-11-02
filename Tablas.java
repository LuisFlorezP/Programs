import javax.swing.JOptionPane;

public class Tablas {
    public static void main(String[] args) {
        // Definir variables
        String resultado;
        int menu;
        // Saludo 
        JOptionPane.showMessageDialog(null,"☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯\nBIENVENIDO AL PROGRAMA DE LAS TABLAS DE MULTIPLICAR\n☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);
        // Ciclo para ir a la opción tablas o cerrar sistema
        do {
            // Ingresar opción del menú
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccionar opción:\n   - Opción 1: Tablas de multiplicas hasta el 10.\n   - Opción 2: Cerrar sistema.","☯☯☯TABLAS DE MULTIPLICAR☯☯☯",JOptionPane.QUESTION_MESSAGE));
            // Opciones
            switch (menu) {
                case 1:
                    // Tabla de multiplicar
                    resultado=tablas();
                    // Imprimir el resultado de toda la tabla de multiplicación 
                    JOptionPane.showMessageDialog(null,resultado,"☯☯☯TABLAS DE MULTIPLICAR☯☯☯",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    // Mensaje de cerrar programa
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema...","LUCHINI S.A.S",JOptionPane.WARNING_MESSAGE);
                    break;
                default:
                    // Error de selección
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (menu!=2);
    }

    static String tablas() {
        // Definir variables
        String mensaje="";
        int numero, resul=0;
        // Ingresar número para el proceso
        numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar el número al que desea sacarle su tabla de multiplicar hasta el 10:","☯☯☯TABLAS DE MULTIPLICAR☯☯☯",JOptionPane.QUESTION_MESSAGE));
        // Empezar el mensaje de la tabla a mostrar
        mensaje="Resultado tablas de multiplicar del número: "+numero+".\n";
        // Ciclo para los 10 resultados
        for (int cont=1;cont<=10;cont++) {
            // Operación
            resul=numero*cont;
            // Añadir nueva multiplicación al mensaje
            mensaje+="   - Resultado "+numero+" X "+cont+": "+resul+".\n";
        }
        
        // Retornar el resultado de todo el método
        return (mensaje);
    }
}
