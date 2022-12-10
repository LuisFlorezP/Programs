
package Plan;
    import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        plan datos = new plan();
        int menu, reg;
        
        JOptionPane.showMessageDialog(null, "BIENVENIDOS AL PROGRAMA PLAN FAMILIAR", "LUCHINI S.A.S", JOptionPane.INFORMATION_MESSAGE);
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "   - Opción 1: Inscripciones.\n   - Opción 2: Cerrar sistema.\nIngresar opción:", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1:
                    do {
                        reg = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar la cantidad de inscripciones a realizar:", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.QUESTION_MESSAGE));
                        if (reg <= 0) {
                            JOptionPane.showMessageDialog(null, "Digitó un valor erróneo, debe ser 1 o más registros, vuelva a intentarlo.", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (reg <= 0);
                    datos.inscripciones(reg);
                    break;
                case 2: 
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...", "LUCHINI S.A.S", JOptionPane.WARNING_MESSAGE); break;
                default: 
                    JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelva a intentarlo.", "❌❌❌ERROR❌❌❌", JOptionPane.ERROR_MESSAGE); break;
            }
        } while (menu != 2);
    }  
}
