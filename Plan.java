import javax.swing.JOptionPane;

public class Plan {
    public static void main(String[] args){
        String nombre, documento, categoria, vehiculo, factura;
        int menu, personas, valorV;
        
        JOptionPane.showMessageDialog(null,"BIENVENIDOS AL PROGRAMA PLAN FAMILIAR","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);
        
        
        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Facturación.\n   - Opción 2: Ventas.\n   - Opción 3: Cerrar sistema.\nIngresar opción:","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1:
                    nombre=JOptionPane.showInputDialog(null,"Ingresar nombre completo: ","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.QUESTION_MESSAGE);
                    documento=JOptionPane.showInputDialog(null,"Ingresar documento de identidad: ","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.QUESTION_MESSAGE);
                    categoria=categoria();
                    personas=personas();
                    vehiculo=vehiculo();
                    valorV=valorV(vehiculo);
                    factura=facturacion(nombre,documento,categoria,personas,vehiculo,valorV);
                    JOptionPane.showMessageDialog(null,factura,"❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.INFORMATION_MESSAGE); break;
                case 2:
                    ventas();
                    break;
                case 3: 
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema...","LUCHINI S.A.S",JOptionPane.WARNING_MESSAGE); break;
                default: 
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE); break;
            }
        } while (menu!=3);
    }

    static String categoria() {
        String cat;
        
        do {
            cat=JOptionPane.showInputDialog(null,"   - Opción A: Categía A.\n   - Opción B: Categoría B.\n   - Opción C: Categoría C.\n   - Opción P: Particular.\nIngresar letra de categoría:","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.QUESTION_MESSAGE);
            if (cat.equals("A")||cat.equals("B")||cat.equals("C")||cat.equals("P")) {
                JOptionPane.showMessageDialog(null,"¡CATEGORÍA ASIGNADA!","✅✅✅EXITOSO✅✅✅",JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (!cat.equals("A")&&!cat.equals("B")&&!cat.equals("C")&&!cat.equals("P"));

        return (cat);
    }

    static int personas() {
        int per=0;

        do {
            per=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Una (1) persona.\n   - Opción 2: Dos (2) personas.\n   - Opción 3: Tres (3) personas.\n   - Opción 4: Cuatro (4) personas.\nIngresar cantidad de personas:","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.QUESTION_MESSAGE));
            
            if (per==1||per==2||per==3||per==4) {
                JOptionPane.showMessageDialog(null,"PERSONAS ASIGNADAS!","✅✅✅EXITOSO✅✅✅",JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (per!=1&&per!=2&&per!=3&&per!=4);

        return (per);
    }

    static String vehiculo() {
        String veh="";
        int menu;

        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Carro.\n   - Opción 2: Moto.\n   - Opción 3: No aplica.\nIngresar opción de vehículo:","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1:
                veh="Carro."; break;
            case 2:
                veh="Moto."; break;
            case 3:
                veh="N/A."; break;
            default:
                JOptionPane.showMessageDialog(null,"Opción incorrecta. Vuelva a intentar.","❌❌❌ERROR❌❌❌s",JOptionPane.ERROR_MESSAGE); break; 
            }
        } while (menu!=1&&menu!=2&&menu!=3);

        return (veh);
    }

    static int valorV(String veh) {
        int valor=0;

        switch (veh) {
            case "Carro.":
                valor=11000*3;
                break;
            case "Moto.":
                valor=6000*3;
                break;
            case "N/A.":
                valor=0;
                break;
        }

        return (valor);
    }

    static String facturacion(String nom, String doc, String cat, int per, String veh, int valor) {
        String mensaje="";
        int factura=0;
        double facturaIva=0, iva=1.19;

        switch (per) {
            case 1: case 2:
                switch (cat) {
                    case "A":
                        factura=105000+valor; 
                        facturaIva=factura*iva; break;
                    case "B": 
                        factura=117900+valor; 
                        facturaIva=factura*iva; break;
                    case "C":
                        factura=129500+valor; 
                        facturaIva=factura*iva; break;
                    case "P":
                        factura=148700+valor; 
                        facturaIva=factura*iva; break;
                } break;
            case 3: case 4:
                switch (cat) {
                    case "A":
                        factura=95800+valor; 
                        facturaIva=factura*iva; break;
                    case "B": 
                        factura=106200+valor; 
                        facturaIva=factura*iva; break;
                    case "C":
                        factura=119100+valor; 
                        facturaIva=factura*iva; break;
                    case "P":
                        factura=141900+valor; 
                        facturaIva=factura*iva; break;
                } break;
        }
        
        mensaje="DATOS DE LA FACTURA.\n   - Nombre cliente: "+nom+". ("+cat+")\n   - Documento de identidad: "+doc+".\n   - Personas para el plan: "+per+".\n   - Vehículo: "+veh+"\n   - Total a pagar sin IVA: "+factura+".\n   - Total a pagar con IVA: "+facturaIva+".";
        return (mensaje);
    }

    static void ventas() {
        int menu;
        double sd1L=Math.round(Math.random()*60), sd1M=Math.round(Math.random()*60), sd1MM=Math.round(Math.random()*60), sd1J=Math.round(Math.random()*60), sd1V=Math.round(Math.random()*60), sd1S=Math.round(Math.random()*60), sd1D=Math.round(Math.random()*60);
        double sd2L=Math.round(Math.random()*60), sd2M=Math.round(Math.random()*60), sd2MM=Math.round(Math.random()*60), sd2J=Math.round(Math.random()*60), sd2V=Math.round(Math.random()*60), sd2S=Math.round(Math.random()*60), sd2D=Math.round(Math.random()*60);
        double sede1[]={sd1L,sd1MM,sd1MM,sd1J,sd1V,sd1S,sd1D}, sede2[]={sd2L,sd2MM,sd2MM,sd2J,sd2V,sd2S,sd2D};

        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Ventas de cada sede.\n   - Opción 2: Máximas ventas de cada sede.\n   - Opción 3: Mínimas ventas de cada sede.\n   - Opción 4: Recaudo total de cada sede.\n   - Opción 5: Similitud de ventas por día de cada sede.\n   - Opción 6: Totalidad de ventas.\n   - Opción 7: Menú anterior.\nIngresar opción:","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1: 
                    JOptionPane.showMessageDialog(null,"Ventas por sede:\n   - La Pintada:\n        Lun  Mar  Mie  Jue  Vie  Sab  Dom\n>>> "+sede1[0]+" "+sede1[1]+" "+sede1[2]+" "+sede1[3]+" "+sede1[4]+" "+sede1[5]+" "+sede1[6]+".\n   - Santa Fe de Antioquia:\n        Lun  Mar  Mie  Jue  Vie  Sab  Dom\n>>> "+sede2[0]+" "+sede2[1]+" "+sede2[2]+" "+sede2[3]+" "+sede2[4]+" "+sede2[5]+" "+sede2[6]+".","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2: 
                    max(sede1,sede2);
                    break;
                case 3: 
                    min(sede1,sede2);
                    break;
                case 4: 
                    total(sede1,sede2);
                    break;
                case 5: 
                    similitud(sede1,sede2);
                    break;
                case 6: 
                    general(sede1,sede2);
                    break;
                case 7: break;
                default: 
                JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE); break;
            }
        } while (menu!=7);
    }

    static void max(double sede1[], double sede2[]) {
        double mx1=0, mx2=0, v1, v2;   
        String dia1, dia2;

        v2=sede1[0];
        for (int c1=1;c1<sede1.length;c1++) {
            v1=sede1[c1];
            mx1=Math.max(v1,v2);
            v2=mx1;
        }
        if (mx1==sede1[0]) {
            dia1="Lunes";
        }
        else if (mx1==sede1[1]) {
            dia1="Martes";
        }
        else if (mx1==sede1[2]) {
            dia1="Miercoles";
        }
        else if (mx1==sede1[3]) {
            dia1="Jueves";
        }
        else if (mx1==sede1[4]) {
            dia1="Viernes";
        }
        else if (mx1==sede1[5]) {
            dia1="Sábado";
        }
        else {
            dia1="Domingo";
        }

        v2=sede2[0];
        for (int c1=1;c1<sede2.length;c1++) {
            v1=sede2[c1];
            mx2=Math.max(v1,v2);
            v2=mx2;
        }
        if (mx2==sede2[0]) {
            dia2="Lunes";
        }
        else if (mx2==sede2[1]) {
            dia2="Martes";
        }
        else if (mx2==sede2[2]) {
            dia2="Miercoles";
        }
        else if (mx2==sede2[3]) {
            dia2="Jueves";
        }
        else if (mx2==sede2[4]) {
            dia2="Viernes";
        }
        else if (mx2==sede2[5]) {
            dia2="Sábado";
        }
        else {
            dia2="Domingo";
        }
        
        JOptionPane.showMessageDialog(null,"Máximas ventas por sede:\n   - La Pintada ("+dia1+"): "+mx1+".\n   - Santa Fe de Antioquia ("+dia2+"): "+mx2+".","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.INFORMATION_MESSAGE);
    }

    static void min(double sede1[], double sede2[]) {
        double mn1=0, mn2=0, v1, v2;
        String dia1, dia2;   

        v2=sede1[0];
        for (int cont=1;cont<sede1.length;cont++) {
            v1=sede1[cont];
            mn1=Math.min(v1,v2);
            v2=mn1;
        }
        if (mn1==sede1[0]) {
            dia1="Lunes";
        }
        else if (mn1==sede1[1]) {
            dia1="Martes";
        }
        else if (mn1==sede1[2]) {
            dia1="Miercoles";
        }
        else if (mn1==sede1[3]) {
            dia1="Jueves";
        }
        else if (mn1==sede1[4]) {
            dia1="Viernes";
        }
        else if (mn1==sede1[5]) {
            dia1="Sábado";
        }
        else {
            dia1="Domingo";
        }

        v2=sede2[0];
        for (int cont=1;cont<sede2.length;cont++) {
            v1=sede2[cont];
            mn2=Math.min(v1,v2);
            v2=mn2;
        }
        if (mn2==sede1[0]) {
            dia2="Lunes";
        }
        else if (mn2==sede1[1]) {
            dia2="Martes";
        }
        else if (mn2==sede1[2]) {
            dia2="Miercoles";
        }
        else if (mn2==sede1[3]) {
            dia2="Jueves";
        }
        else if (mn2==sede1[4]) {
            dia2="Viernes";
        }
        else if (mn2==sede1[5]) {
            dia2="Sábado";
        }
        else {
            dia2="Domingo";
        }
        
        JOptionPane.showMessageDialog(null,"Mínimas ventas por sede:\n   - La Pintada ("+dia1+"): "+mn1+".\n   - Santa Fe de Antioquia ("+dia2+"): "+mn2+".","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.INFORMATION_MESSAGE);
    }

    static void total(double sede1[], double sede2[]) {
        double t1=0, t2=0;
        
        for (double arreglo : sede1) {
            t1+=arreglo;
        }

        for (double arreglo : sede2) {
            t2+=arreglo;
        }

        JOptionPane.showMessageDialog(null,"Total ventas por sede:\n   - La Pintada: "+t1+".\n   - Santa Fe de Antioquia: "+t2+".","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.INFORMATION_MESSAGE);
    }

    static void similitud(double sede1[], double sede2[]) {
        String men1="", men2="", dia1="", dia11="", dia2="", dia22="";
        double d1, d2;

        for (int c1=0;c1<sede1.length;c1++) {
            for (int c2=c1+1;c2<sede1.length;c2++) {
                if (sede1[c1]==sede1[c2]) {
                    d1=sede1[c1];
                    dia1=dia1(sede1,d1);
                    d1=sede1[c2];
                    dia11=dia11(sede1,d1);
                    men1+="   - ("+dia1+","+dia11+"): "+String.valueOf(sede1[c1])+".\n";
                    
                }
            }
        }

        for (int c1=0;c1<sede2.length;c1++) {
            for (int c2=c1+1;c2<sede2.length;c2++) {
                if (sede2[c1]==sede2[c2]) {
                    d2=sede2[c1];
                    dia2=dia2(sede2,d2);
                    d2=sede2[c2];
                    dia22=dia22(sede2,d2);
                    men2+="   - ("+dia2+","+dia22+"): "+String.valueOf(sede2[c1])+".\n";
                    
                }
            }
        }

        JOptionPane.showMessageDialog(null,"Ventas similares por sede:\n- La Pintada:\n"+men1+"- Santa Fe de Antioquia:\n"+men2,"❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.INFORMATION_MESSAGE);
    }

    static String dia1(double sede[], double valor) {
        String dia="";
        
        if (valor==sede[0]) {
            dia="Lunes";
        }
        else if (valor==sede[1]) {
            dia="Martes";
        }
        else if (valor==sede[2]) {
            dia="Miercoles";
        }
        else if (valor==sede[3]) {
            dia="Jueves";
        }
        else if (valor==sede[4]) {
            dia="Viernes";
        }
        else if (valor==sede[5]) {
            dia="Sábado";
        }
        else {
            dia="Domingo";
        }

        return (dia);
    }

    static String dia11(double sede[], double valor) {
        String dia="";
        
        if (valor==sede[6]) {
            dia="Domingo";
        }
        else if (valor==sede[5]) {
            dia="Sábado";
        }
        else if (valor==sede[4]) {
            dia="Viernes";
        }
        else if (valor==sede[3]) {
            dia="Jueves";
        }
        else if (valor==sede[2]) {
            dia="Miercoles";
        }
        else if (valor==sede[1]) {
            dia="Martes";
        }
        else {
            dia="Lunes";
        }

        return (dia);
    }

    static String dia2(double sede[], double valor) {
        String dia="";
        
        if (valor==sede[0]) {
            dia="Lunes";
        }
        else if (valor==sede[1]) {
            dia="Martes";
        }
        else if (valor==sede[2]) {
            dia="Miercoles";
        }
        else if (valor==sede[3]) {
            dia="Jueves";
        }
        else if (valor==sede[4]) {
            dia="Viernes";
        }
        else if (valor==sede[5]) {
            dia="Sábado";
        }
        else {
            dia="Domingo";
        }

        return (dia);
    }

    static String dia22(double sede[], double valor) {
        String dia="";
        
        if (valor==sede[6]) {
            dia="Domingo";
        }
        else if (valor==sede[5]) {
            dia="Sábado";
        }
        else if (valor==sede[4]) {
            dia="Viernes";
        }
        else if (valor==sede[3]) {
            dia="Jueves";
        }
        else if (valor==sede[2]) {
            dia="Miercoles";
        }
        else if (valor==sede[1]) {
            dia="Martes";
        }
        else {
            dia="Lunes";
        }

        return (dia);
    }

    static void general(double sede1[], double sede2[]) {
        double t1=0, t2=0, t=0;
        
        for (double arreglo : sede1) {
            t1+=arreglo;
        }

        for (double arreglo : sede2) {
            t2+=arreglo;
        }

        t=t1+t2;
        JOptionPane.showMessageDialog(null,"Totalidad de ventas entre ambas sedes: "+t+".","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.INFORMATION_MESSAGE);
        
    }
}
