/*
Proyecto para practicar la tabla de Verdad y las leyes lógicas.
Profesorado de Matemática ISFD N° 2 Chos Malal - Neuquén.
 */
package algebra;

import java.util.Scanner;

class Variables {
    private boolean p;
    private boolean q;
    
    public Variables() {
    }
    public Variables(boolean p, boolean q) {
        this.p = p;
        this.q = q;
    }
    public boolean isP() {
        return p;
    }
    public void setP(boolean p) {
        this.p = p;
    }
    public boolean isQ() {
        return q;
    }
    public void setQ(boolean q) {
        this.q = q;
    }
 
}

public class Algebra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rta = 0;
        String confirmacionSalida = "no";
        do{
            boolean p = true;
            boolean q = true;
            Variables qyp = new Variables(p,q);
            System.out.println("1.Tabla de Verdad");
            System.out.println("2.Salir");
            rta = sc.nextInt();
            switch(rta){
                case 1:
                
                    System.out.println("Ingrese valor de p (verdadero/falso)");
                        if(sc.next().equalsIgnoreCase("verdadero")){
                         p = true;
                         qyp.setP(p);
                        }else{
                        p = false;
                        qyp.setQ(p);
                            
                    }
                        System.out.println("");
                    System.out.println("Ingrese valor de q (verdadero/falso)");
                        if(sc.next().equalsIgnoreCase("verdadero")){
                            q = true;
                            qyp.setQ(q);
                        }else{
                            q = false;
                            qyp.setQ(q);
                    }
                        System.out.println("");
                        
                        boolean noP = !p;
                       
                            String noPe ="";
                            if(noP){
                                noPe = "Verdadero";
                            }else{
                                noPe = "Falso";
                            }
                        
                        boolean noQ = !q;
                        
                            String noQu ="";
                            if(noQ){
                                noQu = "Verdadero";
                            }else{
                                noQu = "Falso";
                            }
                        
                        boolean conjuncion = p&&q;
                        
                            String conjuncione ="";
                            if(conjuncion){
                                conjuncione = "Verdadero";
                            }else{
                                conjuncione = "Falso";
                            }
                            
                        boolean disyuncion = p||q;
                        
                        String disyuncione ="";
                            if(disyuncion){
                                disyuncione = "Verdadero";
                            }else{
                                disyuncione = "Falso";
                            }
                        
                        boolean condicional = !p||q;
                            String condicionale ="";
                            if(condicional){
                                condicionale = "Verdadero";
                            }else{
                                condicionale = "Falso";
                            }
                        
                        
                        boolean bicondicional = (!p||q)&&(!q||p);
                        
                       String bicondicionale ="";
                            if(bicondicional){
                                bicondicionale = "Verdadero";
                            }else{
                                bicondicionale = "Falso";
                            }
                        
                        boolean disyExcl = !((!p||q)&&(!q||p));
                        
                        String disyExcle ="";
                            if(disyExcl){
                                disyExcle = "Verdadero";
                            }else{
                                disyExcle = "Falso";
                            }
                
                    System.out.println("no p = ¬p = "+noPe);
                    System.out.println("no q = ¬q = "+noQu);
                    System.out.println("conjunción = p ^ q = "+conjuncione);
                    System.out.println("disyunción = p v q = "+disyuncione);
                    System.out.println("condicional simple = p → q = "+condicionale);
                    System.out.println("bicondicional = p ↔ q = "+bicondicionale);
                    System.out.println("disyunción exclusiva = p ▲ q = "+disyExcle);
                    System.out.println("");
                    continue;
                case 2:
                System.out.println("¿Está seguro de que desea salir? (si/no)");
                confirmacionSalida=sc.next();
            }
           }while(confirmacionSalida.equals("no"));
        
        
        boolean[] filas = new boolean[5];
        boolean[] columnas = new boolean[9];
        
        String[][] tablaDeVerdad = new String[filas.length][columnas.length];
                      
//        for (int i = 0; i < filas.length; i++) {
//            for (int j = 0; j < columnas.length; j++) {
//                switch(i){
//                    case 0:
//                    switch(j){
//                        case 0:
//                            tablaDeVerdad[i][j] = " p     ";
//                            continue;
//                        case 1:
//                            tablaDeVerdad[i][j] = "  q     ";
//                            continue;
//                        case 2:
//                            tablaDeVerdad[i][j] = "No p   ";
//                            continue;
//                        case 3:
//                            tablaDeVerdad[i][j] = "No q   ";
//                            continue;
//                        case 4:
//                            tablaDeVerdad[i][j] = "Conj   ";
//                            continue;
//                        case 5:
//                            tablaDeVerdad[i][j] = "Disy   ";
//                            continue;
//                        case 6:
//                            tablaDeVerdad[i][j] = "Cond   ";
//                            continue;
//                        case 7:
//                            tablaDeVerdad[i][j] = "Bico   ";
//                            continue;
//                        case 8:
//                            tablaDeVerdad[i][j] = " Diex   ";
//                            continue;
//                }
//                    case 1:
//                        p=true;
//                        q=true;
//                    switch(j){
//                        case 0:
//                            tablaDeVerdad[i][j] = ""+p+"   ";
//                            continue;
//                        case 1:
//                            tablaDeVerdad[i][j] = ""+q+"   ";
//                            continue;
//                        case 2:
//                            tablaDeVerdad[i][j] = ""+noP+"  ";
//                            continue;
//                        case 3:
//                            tablaDeVerdad[i][j] = ""+noQ+"  ";
//                            continue;
//                        case 4:
//                            tablaDeVerdad[i][j] = ""+conjuncion+"   ";
//                            continue;
//                        case 5:
//                            tablaDeVerdad[i][j] = ""+disyuncion+"   ";
//                            continue;
//                        case 6:
//                            tablaDeVerdad[i][j] = ""+condicional+"   ";
//                            continue;
//                        case 7: 
//                            tablaDeVerdad[i][j] = ""+bicondicional+"   ";
//                            continue;
//                        case 8:
//                            tablaDeVerdad[i][j] = ""+disyExcl+"   ";
//                            continue;
//                    }
//                    
//                    case 2:
//                        p = true;
//                        q = false;
//                        switch(j){
//                        case 0:
//                            tablaDeVerdad[i][j] = ""+p+"   ";
//                            continue;
//                        case 1:
//                            tablaDeVerdad[i][j] = ""+q+"   ";
//                            continue;
//                        case 2:
//                            tablaDeVerdad[i][j] = ""+noP+"  ";
//                            continue;
//                        case 3:
//                            tablaDeVerdad[i][j] = ""+noQ+"  ";
//                            continue;
//                        case 4:
//                            tablaDeVerdad[i][j] = ""+conjuncion+"   ";
//                            continue;
//                        case 5:
//                            tablaDeVerdad[i][j] = ""+disyuncion+"   ";
//                            continue;
//                        case 6:
//                            tablaDeVerdad[i][j] = ""+condicional+"   ";
//                            continue;
//                        case 7: 
//                            tablaDeVerdad[i][j] = ""+bicondicional+"   ";
//                            continue;
//                        case 8:
//                            tablaDeVerdad[i][j] = ""+disyExcl+"   ";
//                            continue;
//                    }
//                        case 3:
//                            p=false;
//                            q=true;
//                        switch(j){
//                        case 0:
//                           tablaDeVerdad[i][j] = ""+p+"   ";
//                            continue;
//                        case 1:
//                           tablaDeVerdad[i][j] = ""+q+"   ";
//                            continue;
//                        case 2:
//                            tablaDeVerdad[i][j] = ""+noP+"  ";
//                            continue;
//                        case 3:
//                            tablaDeVerdad[i][j] = ""+noQ+"  ";
//                            continue;
//                        case 4:
//                            tablaDeVerdad[i][j] = ""+conjuncion+"   ";
//                            continue;
//                        case 5:
//                            tablaDeVerdad[i][j] = ""+disyuncion+"   ";
//                            continue;
//                        case 6:
//                            tablaDeVerdad[i][j] = ""+condicional+"   ";
//                            continue;
//                        case 7: 
//                            tablaDeVerdad[i][j] = ""+bicondicional+"   ";
//                            continue;
//                        case 8:
//                            tablaDeVerdad[i][j] = ""+disyExcl+"   ";
//                            continue;
//                    }
//                        case 4:
//                            p=false;
//                            q=false;
//                        switch(j){
//                        case 0:
//                            tablaDeVerdad[i][j] = ""+p+"   ";
//                            continue;
//                        case 1:
//                            tablaDeVerdad[i][j] = ""+q+"   ";
//                            continue;
//                        case 2:
//                            tablaDeVerdad[i][j] = ""+noP+"  ";
//                            continue;
//                        case 3:
//                            tablaDeVerdad[i][j] = ""+noQ+"  ";
//                            continue;
//                        case 4:
//                            tablaDeVerdad[i][j] = ""+conjuncion+"   ";
//                            continue;
//                        case 5:
//                            tablaDeVerdad[i][j] = ""+disyuncion+"   ";
//                            continue;
//                        case 6:
//                            tablaDeVerdad[i][j] = ""+condicional+"   ";
//                            continue;
//                        case 7: 
//                            tablaDeVerdad[i][j] = ""+bicondicional+"   ";
//                            continue;
//                        case 8:
//                            tablaDeVerdad[i][j] = ""+disyExcl+"   ";
//                            continue;
//                    }
//                    
//                    default:
//                    tablaDeVerdad[i][j] = "nada   ";
//                }
//        }
//    }
//    
//        for (int i = 0; i < filas.length; i++) {
//            for (int j = 0; j < columnas.length; j++) {
//                
//                System.out.print(tablaDeVerdad[i][j]);
//            }
//            System.out.println("");
//            
//        }
        
        
        
}
}

