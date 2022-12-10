
package Ejercicios.Plan;
    import javax.swing.JOptionPane;

public class plan {
    private String nombre;
    private String doc;
    private char cat;
    private String plan;
    private int factura;
    private int adultos;
    private int menores;
    
    public plan() {}
    
    public plan(String nombre, String doc, char cat, String plan, int factura, int adultos, int menores) {
        this.nombre = nombre;
        this.doc = doc;
        this.cat = cat;
        this.plan = plan;
        this.factura = factura;
        this.adultos = adultos;
        this.menores = menores;
    }
    
    public void inscripciones(int reg) {
        cliente usuarios[] = new cliente[reg];
        int menu;
        
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Registro de usuarios.\n   - Opción 2: Usuario.\n   - Opción 3: Menú anterior.\nIngresar opción:","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1:
                    if (reg != 0) {
                        for (int i = 0, j = i + 1; i < usuarios.length; i++, j++) {
                                usuarios[i] = registro(j);
                        }
                        reg -= reg;
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Los registros ya han sido realizados.", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 2:
                    if (reg == 0) {
                        valores(usuarios);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Aún no hay registros, proceda a primero registrar usuarios.", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 3: break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE); 
                    break;
            }
        } while (menu != 3);
    }
    
    public cliente registro(int reg) {
        String nombre, doc, vehiculo = "";
        int edad, mayores, menores, vh;
        char categoria;
        
        nombre = JOptionPane.showInputDialog(null, "Ingresar nombre completo del usuario N°" + reg + ":\nEjm: Luis Florez.", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.QUESTION_MESSAGE);
        doc = JOptionPane.showInputDialog(null, "Ingresar número de documento del usuario N°" + reg + ":\nEjm: 1025882220.", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.QUESTION_MESSAGE);
        do {
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar número de edad del usuario N°" + reg + ":\nEjm: 18.", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.QUESTION_MESSAGE));
            if (edad <= 0) {
                JOptionPane.showMessageDialog(null,"Ingresar una edad mayor a 0.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (edad <= 0);
        do {
            categoria = JOptionPane.showInputDialog(null, "Ingresar opción de categoria del usuario N°" + reg + ":\n   - Opción A: Categía A.\n   - Opción B: Categoría B.\n   - Opción C: Categoría C.\n   - Opción P: Particular.\nEjm: A.", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.QUESTION_MESSAGE).charAt(0);
            if (categoria != 'A' && categoria != 'B' && categoria != 'C' && categoria != 'P') {
                JOptionPane.showMessageDialog(null,"Ingresar una opción de categoría correcta (A,B,C,D,P).","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (categoria != 'A' && categoria != 'B' && categoria != 'C' && categoria != 'P');
        do {    
            mayores = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar número de mayores de edad (tienen 18 años o más) del núcleo familiar del usuario N°" + reg + ":\n Ejm: 2.", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.QUESTION_MESSAGE));
            if (mayores < 0) {
                JOptionPane.showMessageDialog(null,"Ingresar una cantidad mayor a 0.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (mayores < 0);
        do {    
            menores = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar número de menores de edad (tienen 17 años o menos) del núcleo familiar usuario N°" + reg + ":\n Ejm: 2.", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.QUESTION_MESSAGE));
            if (menores < 0) {
                JOptionPane.showMessageDialog(null,"Ingresar una cantidad mayor a 0.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (menores < 0);
        do {
            vh = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar opción de vehículo del usuario N°" + reg + ":\n   - Opción 1: Carro.\n   - Opción 2: Moto.\n   - Opción 3: No aplica.\nEjm: 2", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.QUESTION_MESSAGE));
            if (vh == 1) {
                vehiculo = "Carro"; 
                break;
            }
            else if (vh == 2) {
                vehiculo = "Moto"; 
                break;
            }
            else if (vh == 3) {
                vehiculo = "No aplica"; 
                break;
            }
            else {
                JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (true);
        cliente usuario = new cliente(nombre, doc, edad, categoria, mayores, menores, vehiculo);
        
        return (usuario);
    }
    
    public void valores(cliente usuarios[]) {
        String valor, dato;
        int menu = 0, usuario = 0;
        
        valor = JOptionPane.showInputDialog(null, "Ingresar el documento de usuario:", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.QUESTION_MESSAGE);
        for (int i = 0; i < usuarios.length; i++) {
            dato = usuarios[i].getDoc();
            if (valor.equals(dato)) {
                JOptionPane.showMessageDialog(null, "El documento ingresado fue encontrado.", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.INFORMATION_MESSAGE); 
                menu++;
                usuario = i;
            }
        }
        if (menu != 0) {
            do {
                menu = Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Información personal.\n   - Opción 2: Tarifa personal.\n   - Opción 3: Reservas.\n   - Opción 4: Menú anterior.\nIngresar opción:","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.QUESTION_MESSAGE));
                switch (menu) {
                    case 1:
                        info(usuarios, usuario);
                        break;
                    case 2:
                        tarifa(usuarios, usuario);
                        break;
                    case 3:
                        reservas(usuarios, usuario);
                        break;
                    case 4: break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE); 
                        break;
                }
            } while (menu != 4);
        }
        else {
            JOptionPane.showMessageDialog(null, "El documento ingresado no ha sido encontrado.", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void info(cliente usuarios[], int usuario) {
        int menu;
        
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "   - Opción 1: Nombre completo y edad.\n   - Opción 2: Categoría.\n   - Opción 3: Núcleo familiar.\n   - Opción 4: Vehículo personal.\n   - Opción 5: Menú anterior.\nIngresar opción:", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Usuario: " + usuarios[usuario].getNombre() + " (" + usuarios[usuario].getEdad() + ")", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.INFORMATION_MESSAGE); break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Categoría: " + usuarios[usuario].getCategoria() + ".", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.INFORMATION_MESSAGE); break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Núcleo familiar:\n   - Mayores de edad: " + usuarios[usuario].getMayores() + ".\n   - Menores de edad: " + usuarios[usuario].getMenores() + ".", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.INFORMATION_MESSAGE); break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Vehículo personal: " + usuarios[usuario].getVehiculo() + ".", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.INFORMATION_MESSAGE); break;
                case 5: break;
                default: 
                    JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelva a intentarlo.", "❌❌❌ERROR❌❌❌", JOptionPane.ERROR_MESSAGE); 
                    break;
            }
        } while (menu != 5);
    }
    
    public void tarifa(cliente usuarios[], int usuario) {
        JOptionPane.showMessageDialog(null, "Tarifas:\n   - Categoría A:\n   Adultos: $10.000.\n   Niños: $5.000.\n   - Categoría B:\n   Adultos: $15.000.\n   Niños: $10.000.\n   - Categoría C:\n   Adultos: $20.000.\n   Niños: $15.000.\n   - Categoría P:\n   Adultos: $50.000.\n   Niños: $45.000.\nParqueadero:\n   - Carro: $8.000.\n   - Moto: $4.000.", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.INFORMATION_MESSAGE);
        switch (usuarios[usuario].getCategoria()) {
            case 'A':
                JOptionPane.showMessageDialog(null, "Las tarifas del usuario con documento \"" + usuarios[usuario].getDoc() + "\" (" + usuarios[usuario].getCategoria() + ") son:\n   - Adultos: $10.000.\n    - Niños: $5.000.\n   - Parqueadero (" + usuarios[usuario].getVehiculo() + "): $" + parqueadero(usuarios, usuario) + ".", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 'B':
                JOptionPane.showMessageDialog(null, "Las tarifas del usuario con documento \"" + usuarios[usuario].getDoc() + "\" (" + usuarios[usuario].getCategoria() + ") son:\n   - Adultos: $15.000.\n    - Niños: $10.000.\n   - Parqueadero (" + usuarios[usuario].getVehiculo() + "): $" + parqueadero(usuarios, usuario) + ".", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 'C':
                JOptionPane.showMessageDialog(null, "Las tarifas del usuario con documento \"" + usuarios[usuario].getDoc() + "\" (" + usuarios[usuario].getCategoria() + ") son:\n   - Adultos: $20.000.\n    - Niños: $15.000.\n   - Parqueadero (" + usuarios[usuario].getVehiculo() + "): $" + parqueadero(usuarios, usuario) + ".", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Las tarifas del usuario con documento \"" + usuarios[usuario].getDoc() + "\" (" + usuarios[usuario].getCategoria() + ") son:\n   - Adultos: $50.000.\n    - Niños: $45.000.\n   - Parqueadero (" + usuarios[usuario].getVehiculo() + "): $" + parqueadero(usuarios, usuario) + ".", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
    
    public int parqueadero(cliente usuarios[], int usuario) {
        int valor;
        
        switch (usuarios[usuario].getVehiculo()) {
            case "Carro":
                valor = 8000;
                break;
            case "Moto":
                valor = 4000;
                break;
            default:
                valor = 0;
                break;
        }
        
        return (valor);
    }
    
    public void reservas(cliente usuarios[], int usuario) {
        String opcion, p1 = "Santa Fe de Antioquia", p2 = "La Pintada", p3 = "Rionegro", p4 = "Coveñas", p5 = "Piedra del Peñol";
        int may, men, tA, tN, total = 0, pp, pAcA = 10000, pNcA = 5000, pAcB = 15000, pNcB = 10000, pAcC = 20000, pNcC = 15000, pAcP = 50000, pNcP = 45000;
        
        do {
            may = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar la cantidad de sus mayores de edad que asistirán (máximo " + usuarios[usuario].getMayores() + "):", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.QUESTION_MESSAGE));
            if (may <0 || may > usuarios[usuario].getMayores()) {
                JOptionPane.showMessageDialog(null,"Ingresar una cantidad correspondiente a sus mayores de edad (" + usuarios[usuario].getMayores() + ").","❌❌❌ERROR❌❌❌",JOptionPane.WARNING_MESSAGE);
            }
        } while (may <0 || may > usuarios[usuario].getMayores());
        may++;
        do {
            men = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar la cantidad de sus menores de edad que asistirán (máximo " + usuarios[usuario].getMenores() + "):", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.QUESTION_MESSAGE));
            if (men <0 || men > usuarios[usuario].getMenores()) {
                JOptionPane.showMessageDialog(null,"Ingresar una cantidad correspondiente a sus menores de edad (" + usuarios[usuario].getMenores() + ").","❌❌❌ERROR❌❌❌",JOptionPane.WARNING_MESSAGE);
            }
        } while (men <0 || men > usuarios[usuario].getMenores());
        switch (usuarios[usuario].getCategoria()) {
            case 'A':
                tA = pAcA * may;
                tN = pNcA * men;
                total = tA + tN + parqueadero(usuarios, usuario);
                break;
            case 'B':
                tA = pAcB * may;
                tN = pNcB * men;
                total = tA + tN + parqueadero(usuarios, usuario);
                break;
            case 'C':
                tA = pAcC * may;
                tN = pNcC * men;
                total = tA + tN + parqueadero(usuarios, usuario);
                break;
            case 'P':
                tA = pAcP * may;
                tN = pNcP * men;
                total = tA + tN + parqueadero(usuarios, usuario);
                break;
        }
        do {
            pp = Integer.parseInt(JOptionPane.showInputDialog(null, "   - Opción 1: Santa Fe de Antioquia.\n   - Opción 2: La Pintada.\n   - Opción 3: Rionegro.\n   - Opción 4: Coveñas.\n   - Opción 5: Piedra del Peñol.\nIngresar opción del plan deseado:", "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.QUESTION_MESSAGE));
            if (pp == 1) {
                opcion = p1; 
                break;
            }
            else if (pp == 2) {
                opcion = p2; 
                break;
            }
            else if (pp == 3) {
                opcion = p3; 
                break;
            }
            else if (pp == 4) {
                opcion = p4; 
                break;
            }
            else if (pp == 5) {
                opcion = p5;
                break;
            }
            else {
                JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (true);
        plan factura = new plan(usuarios[usuario].getNombre(), usuarios[usuario].getDoc(), usuarios[usuario].getCategoria(), opcion, total, may, men);
        JOptionPane.showMessageDialog(null, factura.reserva(), "❃❃❃PLAN FAMILIAR❃❃❃", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String reserva() {
        String mensaje;
        
        mensaje = "FACTURACIÓN PLAN FAMILIAR:\n   - Nombre cliente: " + nombre + " (" + cat + ").\n";
        mensaje += "   - Documento: " + doc + ".\n";
        mensaje += "   - Plan: " + plan + ".\n";
        mensaje += "   - Mayores de edad incluidos: " + adultos + ".\n";
        mensaje += "   - Menores de edad incluidos: " + menores + ".\n";
        mensaje += "   - Total a pagar: $" + factura + ".";
        return (mensaje);
    }
}
