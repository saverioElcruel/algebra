/*
Proyecto para practicar la tabla de Verdad y las leyes lógicas.
Profesorado de Matemática ISFD Chos Malal - Neuquén.
 */
package algebra;

public class Algebra {

    public static void main(String[] args) {
        boolean p = true;
        boolean q = false;
        boolean noP = !p;
        boolean noQ = !q;
        
        boolean conjuncion = p&&q;
        boolean disyuncion = p||q;
        boolean condicional = !p||q;
        boolean bicondicional = (!p||q)&&(!q||p);
        boolean disyExcl = !((!p||q)&&(!q||p));
        
        boolean[] filas = new boolean[5];
        boolean[] columnas = new boolean[9];
        
        String[][] tablaDeVerdad = new String[filas.length][columnas.length];
        
        System.out.println("p:"+p);
        System.out.println("q:"+q);
        System.out.println("no p:"+noP);
        System.out.println("no q:"+noQ);
        System.out.println("conjunción:"+conjuncion);
        System.out.println("disyunción:"+disyuncion);
        System.out.println("condicional simple:"+condicional);
        System.out.println("bicondicional:"+bicondicional);
        System.out.println("disyunción exclusiva:"+disyExcl);
        
        
                      
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

