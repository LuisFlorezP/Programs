import javax.swing.JOptionPane;

public class Aleatorio {
    public static void main(String[] args) {
        String premio;
        int menu;
        double aleatorio;

        JOptionPane.showMessageDialog(null,"☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸\nBIENVENIDO AL PROGRAMA DE ADIVINAR NÚMERO\n☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸","LUCHINI S.A.S",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccionar opción:\n   - Opción 1: Adivinar número entre 3 personas.\n   - Opción 2: Salir programa.","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE));  
            switch (menu) {
                case 1:
                    aleatorio=Math.round(Math.random()*10);
                    premio=premio();
                    programa();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema...","LUCHINI S.A.S",JOptionPane.WARNING_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (menu!=2);
    }    
    
    static String premio() {
        String premio="", premio1="Smart TV.", premio2="Laptop.";
        int opcion;

        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccionar opción de premio para la rifa:\n   - Opción 1: Smart TV.\n   - Opción 2: Laptop.","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE));
            if (opcion==1) {
                premio=premio1;
            }
            else if (opcion==2) {
                premio=premio2;
            }
            else {
                JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (opcion!=1&&opcion!=2);

        return (premio);
    }
    
    static void programa() {
        String n1, n2, n3, d1, d2, d3;
        int personas=0, p1=0, p2=0, p3=0;

        while (fin<3) {
            personas=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccionar opción:\n   - Opción 1: Números de la persona N°1.\n   - Opción 2: Números de la persona N°2.\n   - Opción 3: Números de la persona N°3.","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE));
            switch (personas) {
                case 1:
                    if (p1==0) {
                        n1=JOptionPane.showInputDialog(null,"Ingresar nombre completo:","☸☸☸FIN ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
                        d1=JOptionPane.showInputDialog(null,"Ingresar número de documento de identidad:","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
                        Persona1();
                        ++p1; ++fin;
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"La primer persona ya ingresó sus respectivos números.","(∩ ͡° ͜ʖ ͡°)⊃",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 2:
                    if (p2==0) {
                        n2=JOptionPane.showInputDialog(null,"Ingresar nombre completo:","☸☸☸FIN ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
                        d2=JOptionPane.showInputDialog(null,"Ingresar número de documento de identidad:","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
                        Persona2();
                        ++p2; ++fin;
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"La segunda persona ya ingresó sus respectivos números.","(∩ ͡° ͜ʖ ͡°)⊃",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 3:
                    if (p3==0) {
                        n3=JOptionPane.showInputDialog(null,"Ingresar nombre completo:","☸☸☸FIN ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
                        d3=JOptionPane.showInputDialog(null,"Ingresar número de documento de identidad:","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
                        Persona3();
                        ++p3; ++fin;
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"La tercera persona ya ingresó sus respectivos números.","(∩ ͡° ͜ʖ ͡°)⊃",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
        Resultado();
    }

    static void Persona1() {
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

    static void Persona2() {
        
    }

    static void Persona3() {
        
    }

    static void Resultado() {
        if (ganador==1) {
            JOptionPane.showMessageDialog(null,"FELICIDADES, TENEMOS UN GANADOR","☸☸☸FELICITACIONES☸☸☸",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"   - Nombre ganador: "+nomGanador+".\n   - Documento ganador: "+docGanador+".\n   - Premio: "+premio+".\n   - Número de la rifa: "+numeroA+".","☸☸☸GANADOR☸☸☸",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (finRifa==3) {
            JOptionPane.showMessageDialog(null,"FIN DE LA RIFA","☸☸☸FIN ADIVINAR NÚMERO☸☸☸",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
