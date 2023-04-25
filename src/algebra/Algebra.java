/*
Proyecto para practicar la tabla de Verdad y las leyes lógicas.
Profesorado de Matemática ISFD N° 2 Chos Malal - Neuquén.
 */
package algebra;

import java.util.Scanner;

class Conectores{
    public boolean noP;
    public boolean noQ;
    public boolean conjuncion;
    public boolean disyuncion;
    public boolean condicional;
    public boolean bicondicional;
    public boolean disyExcl;

    public Conectores() {
    }

    public Conectores(boolean noP, boolean noQ, boolean conjuncion, boolean disyuncion, boolean condicional, boolean bicondicional, boolean disyExcl) {
        this.noP = noP;
        this.noQ = noQ;
        this.conjuncion = conjuncion;
        this.disyuncion = disyuncion;
        this.condicional = condicional;
        this.bicondicional = bicondicional;
        this.disyExcl = disyExcl;
    }

}

class VariablesServicios {
    public static Conectores rellenarConectores(Variables pyq){
     
    boolean noP = !pyq.isP();
    boolean noQ = !pyq.isQ();
    boolean conjuncion = pyq.isP()&&pyq.isQ();
    boolean disyuncion = pyq.isP()||pyq.isQ();
    boolean condicional = !pyq.isP()||pyq.isQ();
    boolean bicondicional = (!pyq.isP()||pyq.isQ())&&(!pyq.isQ()||pyq.isP());
    boolean disyExcl = !((!pyq.isP()||pyq.isQ())&&(!pyq.isQ()||pyq.isP()));
    return new Conectores(noP,noQ,conjuncion,disyuncion,condicional,bicondicional,disyExcl);
    }
}

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
            System.out.println("2.Leyes lógicas");
            System.out.println("3.Salir");
            rta = sc.nextInt();
            switch(rta){
                case 1:
                    rellenarPyQ(qyp);
                    VariablesServicios plomo = new VariablesServicios();
                    Conectores eso = plomo.rellenarConectores(qyp);
                        String pe ="";
                                if(qyp.isP()){
                                    pe = "Verdadero";
                                }else{
                                    pe = "Falso";
                                }    
                        String qu ="";
                                if(qyp.isQ()){
                                    qu = "Verdadero";
                                }else{
                                    qu = "Falso";
                                }    
                    
                            String noPe ="";
                                if(eso.noP){
                                    noPe = "Verdadero";
                                }else{
                                    noPe = "Falso";
                                }
                        
                            String noQu ="";
                                if(eso.noQ){
                                    noQu = "Verdadero";
                                }else{
                                    noQu = "Falso";
                                }
                        
                            String conjuncione ="";
                                if(eso.conjuncion){
                                   conjuncione = "Verdadero";
                                }else{
                                   conjuncione = "Falso";
                                }
                        
                            String disyuncione ="";
                                if(eso.disyuncion){
                                    disyuncione = "Verdadero";
                                }else{
                                    disyuncione = "Falso";
                                }
                        
                            String condicionale ="";
                                if(eso.condicional){
                                    condicionale = "Verdadero";
                                }else{
                                    condicionale = "Falso";
                                }
                        
                            String bicondicionale ="";
                                if(eso.bicondicional){
                                    bicondicionale = "Verdadero";
                                }else{
                                    bicondicionale = "Falso";
                                }
                        
                            String disyExcle ="";
                                if(eso.disyExcl){
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
                
                boolean[] filas = new boolean[5];
                boolean[] columnas = new boolean[9];
        
                String[][] tablaDeVerdad = new String[filas.length][columnas.length];
                    for (int i = 0; i < tablaDeVerdad.length; i++) {
                        for (int j = 0; j < tablaDeVerdad[0].length; j++) {
                            if(i==0){
                                tablaDeVerdad[i][0] = "   p  ";
                                tablaDeVerdad[i][1] = "    q  ";
                                tablaDeVerdad[i][2] = "    ¬p ";
                                tablaDeVerdad[i][3] = "    ¬q ";
                                tablaDeVerdad[i][4] = "    ^ ";
                                tablaDeVerdad[i][5] = "     v ";
                                tablaDeVerdad[i][6] = "     → ";
                                tablaDeVerdad[i][7] = "    ↔ ";
                                tablaDeVerdad[i][8] = "    ▲ ";
                            }else if(i==1){
                                qyp.setP(true);
                                qyp.setQ(true);
                                Conectores eso1 = plomo.rellenarConectores(qyp);
                                
                                if(qyp.isP()){
                                    tablaDeVerdad[i][0] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][0] = "   F   ";
                                }    
                                
                                if(qyp.isQ()){
                                    tablaDeVerdad[i][1] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][1] = "   F   ";
                                } 
                                if(eso1.noP){
                                    tablaDeVerdad[i][2] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][2] = "   F   ";
                                }
                                if(eso1.noQ){
                                    tablaDeVerdad[i][3] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][3] = "   F   ";
                                }
                                if(eso1.conjuncion){
                                    tablaDeVerdad[i][4] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][4] = "   F   ";
                                }
                                if(eso1.disyuncion){
                                    tablaDeVerdad[i][5] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][5] = "   F   ";
                                }
                                if(eso1.condicional){
                                    tablaDeVerdad[i][6] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][6] = "   F   ";
                                }
                                if(eso1.bicondicional){
                                    tablaDeVerdad[i][7] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][7] = "   F   ";
                                }
                                if(eso1.disyExcl){
                                    tablaDeVerdad[i][8] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][8] = "   F   ";
                                }
                                
                                
                            }else if(i==2){
                                qyp.setP(true);
                                qyp.setQ(false);
                                Conectores eso2 = plomo.rellenarConectores(qyp);
                                if(qyp.isP()){
                                    tablaDeVerdad[i][0] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][0] = "   F   ";
                                }    
                                
                                if(qyp.isQ()){
                                    tablaDeVerdad[i][1] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][1] = "   F   ";
                                } 
                                if(eso2.noP){
                                    tablaDeVerdad[i][2] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][2] = "   F   ";
                                }
                                if(eso2.noQ){
                                    tablaDeVerdad[i][3] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][3] = "   F   ";
                                }
                                if(eso2.conjuncion){
                                    tablaDeVerdad[i][4] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][4] = "   F   ";
                                }
                                if(eso2.disyuncion){
                                    tablaDeVerdad[i][5] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][5] = "   F   ";
                                }
                                if(eso2.condicional){
                                    tablaDeVerdad[i][6] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][6] = "   F   ";
                                }
                                if(eso2.bicondicional){
                                    tablaDeVerdad[i][7] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][7] = "   F   ";
                                }
                                if(eso2.disyExcl){
                                    tablaDeVerdad[i][8] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][8] = "   F   ";
                                }
                            }else if(i==3){
                                qyp.setP(false);
                                qyp.setQ(true);
                                Conectores eso3 = plomo.rellenarConectores(qyp);
                                if(qyp.isP()){
                                    tablaDeVerdad[i][0] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][0] = "   F   ";
                                }    
                                
                                if(qyp.isQ()){
                                    tablaDeVerdad[i][1] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][1] = "   F   ";
                                } 
                                if(eso3.noP){
                                    tablaDeVerdad[i][2] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][2] = "   F   ";
                                }
                                if(eso3.noQ){
                                    tablaDeVerdad[i][3] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][3] = "   F   ";
                                }
                                if(eso3.conjuncion){
                                    tablaDeVerdad[i][4] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][4] = "   F   ";
                                }
                                if(eso3.disyuncion){
                                    tablaDeVerdad[i][5] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][5] = "   F   ";
                                }
                                if(eso3.condicional){
                                    tablaDeVerdad[i][6] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][6] = "   F   ";
                                }
                                if(eso3.bicondicional){
                                    tablaDeVerdad[i][7] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][7] = "   F   ";
                                }
                                if(eso3.disyExcl){
                                    tablaDeVerdad[i][8] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][8] = "   F   ";
                                }
                            }else if(i==4){
                                qyp.setP(false);
                                qyp.setQ(false);
                                Conectores eso4 = plomo.rellenarConectores(qyp);
                                if(qyp.isP()){
                                    tablaDeVerdad[i][0] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][0] = "   F   ";
                                }    
                                
                                if(qyp.isQ()){
                                    tablaDeVerdad[i][1] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][1] = "   F   ";
                                } 
                                if(eso4.noP){
                                    tablaDeVerdad[i][2] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][2] = "   F   ";
                                }
                                if(eso4.noQ){
                                    tablaDeVerdad[i][3] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][3] = "   F   ";
                                }
                                if(eso4.conjuncion){
                                    tablaDeVerdad[i][4] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][4] = "   F   ";
                                }
                                if(eso4.disyuncion){
                                    tablaDeVerdad[i][5] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][5] = "   F   ";
                                }
                                if(eso4.condicional){
                                    tablaDeVerdad[i][6] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][6] = "   F   ";
                                }
                                if(eso4.bicondicional){
                                    tablaDeVerdad[i][7] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][7] = "   F   ";
                                }
                                if(eso4.disyExcl){
                                    tablaDeVerdad[i][8] = "   V   ";
                                }else{
                                    tablaDeVerdad[i][8] = "   F   ";
                                }
                                
                            
                        }
                            System.out.print(tablaDeVerdad[i][j]);
                        
                        
                    }
                        System.out.println("");
                    }
                    System.out.println("");
                    
                    continue;
                
                case 2:
                    System.out.println("1) Idempotencia\n" +
"                    a) p v p ≡ P\n" +
"                    b) P ^ P ≡ P ");
                    System.out.println("-------------");
                    System.out.println("2) Conmutativa\n" +
"                    a) p v q ≡ q v p\n" +
"                    b) q ^ p ≡ p ^ q");
                    System.out.println("-------------");
                    System.out.println("3) Asociativa\n" +
"                    a) p v (q v r) ≡ (p v q) v r\n" +
"                    b) p ^ (q ^ r) ≡ (p ^ q) ^ r");
                    System.out.println("-------------");
                    System.out.println("4) Distributiva\n" +
"                    a) p v (q ^ r) ≡ (p v q) ^ (p v r)\n" +
"                    b) p ^ (q v r) ≡ (p ^ q) v (p ^ r)");
                    System.out.println("-------------");
                    System.out.println("5) Involución\n" +
"                    a) ¬(¬p) ≡ p\n" +
"                    b) ¬(V) ≡ F\n" +
"                    c) ¬(F) ≡ V");
                    System.out.println("-------------");
                    System.out.println("6) Identidad\n" +
"                    a) p v V ≡ V\n" +
"                    b) p v F ≡ p\n" +
"                    c) p ^ V ≡ p\n" +
"                    d) p ^ F ≡ F");
                    System.out.println("-------------");
                    System.out.println("7) Complemento\n" +
"                    a) p v ¬p ≡ V\n" +
"                    b) p ^ ¬p ≡ F");
                    System.out.println("-------------");
                    System.out.println("8) Morgan\n" +
"                    a) ¬(p ^ q) ≡ ¬p v ¬q\n" +
"                    b) ¬(p v q) ≡ ¬p ^ ¬q");
                    System.out.println("-------------");
                    System.out.println("9) Ley de absorción\n" +
"                    Total\n" +
"                    a) p v (q ^ p) ≡ p\n" +
"                    b) q ^ (p v q) ≡ q\n" +
"                    Parcial\n" +
"                    a) ¬p ^ (q v p) ≡ ¬p ^ q\n" +
"                    b) ¬q v (q ^ p) ≡ ¬q v p \n" +
"                    Requisitos: \n" +
"                    - los dos conectores, afuera y adentro del paréntesis\n" +
"                    tienen que ser diferentes.\n" +
"                    - debe haber dos proposiciones. Buscamos la proposición \n" +
"                    idéntica y todo se reduce a esta.\n" +
"                    - si las proposiciones son parecidas pero una está negada\n" +
"                    tomamos la proposición que está fuera del paréntesis con el \n" +
"                    conector que la acompaña y la proposición diferente que está\n" +
"                    adentro del paréntesis.");
                    System.out.println("-------------");
                    System.out.println("10) Simplificación de la condicional\n" +
"                    p → q ≡ ¬p v q");
                    System.out.println("-------------");
                    System.out.println("11) Implicaciones asociadas a una dada\n" +
"                    Directa\n" +
"                    p → q\n" +
"                    Contradicción\n" +
"                    ¬p → ¬q\n" +
"                    Recíproca\n" +
"                    q → p\n" +
"                    Contrarecíproca\n" +
"                    ¬q → ¬p");
                    System.out.println("-------------");
                    System.out.println("12) Equivalencia de la bicondicional\n" +
"                    p ↔ q ≡ ¬(p ▲ q)\n" +
"                    */");
                    /*
                    1) Idempotencia
                    a) p v p ≡ P
                    b) P ^ P ≡ P 
                    
                    2) Conmutativa
                    a) p v q ≡ q v p
                    b) q ^ p ≡ p ^ q
                    
                    3) Asociativa
                    a) p v (q v r) ≡ (p v q) v r
                    b) p ^ (q ^ r) ≡ (p ^ q) ^ r
                    
                    4) Distributiva
                    a) p v (q ^ r) ≡ (p v q) ^ (p v r)
                    b) p ^ (q v r) ≡ (p ^ q) v (p ^ r)
                    
                    5) Involución
                    a) ¬(¬p) ≡ p
                    b) ¬(V) ≡ F
                    c) ¬(F) ≡ V
                    
                    6) Identidad
                    a) p v V ≡ V
                    b) p v F ≡ p
                    c) p ^ V ≡ p
                    d) p ^ F ≡ F
                    
                    7) Complemento
                    a) p v ¬p ≡ V
                    b) p ^ ¬p ≡ F
                    
                    8) Morgan
                    a) ¬(p ^ q) ≡ ¬p v ¬q
                    b) ¬(p v q) ≡ ¬p ^ ¬q
                    
                    9) Ley de absorción
                    Total
                    a) p v (q ^ p) ≡ p
                    b) q ^ (p v q) ≡ q
                    Parcial
                    a) ¬p ^ (q v p) ≡ ¬p ^ q
                    b) ¬q v (q ^ p) ≡ ¬q v p 
                    Requisitos: 
                    - los dos conectores, afuera y adentro del paréntesis
                    tienen que ser diferentes.
                    - debe haber dos proposiciones. Buscamos la proposición 
                    idéntica y todo se reduce a esta.
                    - si las proposiciones son parecidas pero una está negada
                    tomamos la proposición que está fuera del paréntesis con el 
                    conector que la acompaña y la proposición diferente que está
                    adentro del paréntesis.
                    
                    10) Simplificación de la condicional
                    p → q ≡ ¬p v q
                    
                    11) Implicaciones asociadas a una dada
                    Directa
                    p → q
                    Contradicción
                    ¬p → ¬q
                    Recíproca
                    q → p
                    Contrarecíproca
                    ¬q → ¬p
                    
                    12) Equivalencia de la bicondicional
                    p ↔ q ≡ ¬(p ▲ q)
                    */
                    
                    
                    continue;
                case 3:
                    System.out.println("¿Está seguro de que desea salir? (si/no)");
                    confirmacionSalida=sc.next();
            }
           }while(confirmacionSalida.equals("no"));
}
    public static void rellenarPyQ(Variables inventadas){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese valor de p (verdadero/falso)");
                if(sc.next().equalsIgnoreCase("verdadero")){
                    boolean p = true;
                        inventadas.setP(p);
                }else{
                    boolean p = false;
                        inventadas.setP(p);       
                    }
            System.out.println("");
            System.out.println("Ingrese valor de q (verdadero/falso)");
                if(sc.next().equalsIgnoreCase("verdadero")){
                    boolean q = true;
                        inventadas.setQ(q);
                }else{
                    boolean q = false;
                        inventadas.setQ(q);
                    }
            System.out.println("");
        }
    

}

