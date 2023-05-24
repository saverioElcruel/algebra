/*
Proyecto para practicar la tabla de Verdad y las leyes lógicas.
Profesorado de Matemática ISFD N° 2 Chos Malal - Neuquén.
 */
package algebra;

import java.util.Scanner;

public class Algebra {

    public static void main(String[] args) {

        boolean p = true;
        boolean q = true;

        boolean noP = false;
        boolean noQ = false;
        boolean conjuncion = true;
        boolean disyuncion = true;
        boolean condicional = true;
        boolean bicondicional = true;
        boolean disyExcl = false;

        Scanner sc = new Scanner(System.in);
        int rta = 0;
        String confirmacionSalida = "no";
        do {
            System.out.println("1.Tabla de Verdad");
            System.out.println("2.Leyes lógicas");
            System.out.println("3.Operaciones");
            System.out.println("4.Salir");
            rta = sc.nextInt();
            switch (rta) {
                case 1:
                    System.out.println("Ingrese valor de p (verdadero/falso)");
                        if (sc.next().equalsIgnoreCase("verdadero")) {
                             p = true;
                        } else {
                             p = false;
                        }
                    System.out.println("Ingrese valor de q (verdadero/falso)");
                        if (sc.next().equalsIgnoreCase("verdadero")) {
                             q = true;
                        } else {
                             q = false;
                        }
                    rellenar(p, q, noP, noQ, conjuncion, disyuncion, condicional, bicondicional, disyExcl);
                    // Corrección de los valores de salida. En lugar de "true"/"false"
                    String pe = "";
                    if (p) {
                        pe = "Verdadero";
                    } else {
                        pe = "Falso";
                    }
                    String qu = "";
                    if (q) {
                        qu = "Verdadero";
                    } else {
                        qu = "Falso";
                    }

                    String noPe = "";
                    if (noP) {
                        noPe = "Verdadero";
                    } else {
                        noPe = "Falso";
                    }

                    String noQu = "";
                    if (noQ) {
                        noQu = "Verdadero";
                    } else {
                        noQu = "Falso";
                    }

                    String conjuncione = "";
                    if (conjuncion) {
                        conjuncione = "Verdadero";
                    } else {
                        conjuncione = "Falso";
                    }

                    String disyuncione = "";
                    if (disyuncion) {
                        disyuncione = "Verdadero";
                    } else {
                        disyuncione = "Falso";
                    }

                    String condicionale = "";
                    if (condicional) {
                        condicionale = "Verdadero";
                    } else {
                        condicionale = "Falso";
                    }

                    String bicondicionale = "";
                    if (bicondicional) {
                        bicondicionale = "Verdadero";
                    } else {
                        bicondicionale = "Falso";
                    }

                    String disyExcle = "";
                    if (disyExcl) {
                        disyExcle = "Verdadero";
                    } else {
                        disyExcle = "Falso";
                    }
                    // Impresión de los resultados para los valores ingresados de p y q                
                    System.out.println("no p = ¬p = " + noPe);
                    System.out.println("no q = ¬q = " + noQu);
                    System.out.println("conjunción = p ^ q = " + conjuncione);
                    System.out.println("disyunción = p v q = " + disyuncione);
                    System.out.println("condicional simple = p → q = " + condicionale);
                    System.out.println("bicondicional = p ↔ q = " + bicondicionale);
                    System.out.println("disyunción exclusiva = p ▲ q = " + disyExcle);
                    System.out.println("");

                    //Construcción de la matriz tablaDeVerdad
                    boolean[] filas = new boolean[5];
                    boolean[] columnas = new boolean[9];

                    String[][] tablaDeVerdad = new String[filas.length][columnas.length];
                    for (int i = 0; i < tablaDeVerdad.length; i++) {
                        for (int j = 0; j < tablaDeVerdad[0].length; j++) {

                            if (i == 0) {
                                // encabezado columnas
                                tablaDeVerdad[i][0] = "   p  ";
                                tablaDeVerdad[i][1] = "    q  ";
                                tablaDeVerdad[i][2] = "    ¬p ";
                                tablaDeVerdad[i][3] = "    ¬q ";
                                tablaDeVerdad[i][4] = "    ^ ";
                                tablaDeVerdad[i][5] = "     v ";
                                tablaDeVerdad[i][6] = "     → ";
                                tablaDeVerdad[i][7] = "    ↔ ";
                                tablaDeVerdad[i][8] = "    ▲ ";
                            } else if (i == 1) {
                                boolean p1 = true;
                                boolean q1 = true;
                                boolean noP1 = false;
                                boolean noQ1 = false;
                                boolean conjuncion1 = true;
                                boolean disyuncion1 = true;
                                boolean condicional1 = true;
                                boolean bicondicional1 = true;
                                boolean disyExcl1 = false;
                                                              
                                if (p1) {
                                    tablaDeVerdad[i][0] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][0] = "   F   ";
                                }

                                if (q1) {
                                    tablaDeVerdad[i][1] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][1] = "   F   ";
                                }
                                if (noP1) {
                                    tablaDeVerdad[i][2] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][2] = "   F   ";
                                }
                                if (noQ1) {
                                    tablaDeVerdad[i][3] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][3] = "   F   ";
                                }
                                if (conjuncion1) {
                                    tablaDeVerdad[i][4] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][4] = "   F   ";
                                }
                                if (disyuncion1) {
                                    tablaDeVerdad[i][5] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][5] = "   F   ";
                                }
                                if (condicional1) {
                                    tablaDeVerdad[i][6] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][6] = "   F   ";
                                }
                                if (bicondicional1) {
                                    tablaDeVerdad[i][7] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][7] = "   F   ";
                                }
                                if (disyExcl1) {
                                    tablaDeVerdad[i][8] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][8] = "   F   ";
                                }

                            } else if (i == 2) {
                                boolean p2 = true;
                                boolean q2 = false;
                                boolean noP2 = false;
                                boolean noQ2 = true;
                                boolean conjuncion2 = false;
                                boolean disyuncion2 = true;
                                boolean condicional2 = false;
                                boolean bicondicional2 = false;
                                boolean disyExcl2 = true;
                                if (p2) {
                                    tablaDeVerdad[i][0] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][0] = "   F   ";
                                }

                                if (q2) {
                                    tablaDeVerdad[i][1] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][1] = "   F   ";
                                }
                                if (noP2) {
                                    tablaDeVerdad[i][2] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][2] = "   F   ";
                                }
                                if (noQ2) {
                                    tablaDeVerdad[i][3] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][3] = "   F   ";
                                }
                                if (conjuncion2) {
                                    tablaDeVerdad[i][4] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][4] = "   F   ";
                                }
                                if (disyuncion2) {
                                    tablaDeVerdad[i][5] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][5] = "   F   ";
                                }
                                if (condicional2) {
                                    tablaDeVerdad[i][6] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][6] = "   F   ";
                                }
                                if (bicondicional2) {
                                    tablaDeVerdad[i][7] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][7] = "   F   ";
                                }
                                if (disyExcl2) {
                                    tablaDeVerdad[i][8] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][8] = "   F   ";
                                }
                            } else if (i == 3) {
                                boolean p3 = false;
                                boolean q3 = true;
                                boolean noP3 = true;
                                boolean noQ3 = false;
                                boolean conjuncion3 = false;
                                boolean disyuncion3 = true;
                                boolean condicional3 = true;
                                boolean bicondicional3 = false;
                                boolean disyExcl3 = true;
                                
                                if (p3) {
                                    tablaDeVerdad[i][0] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][0] = "   F   ";
                                }

                                if (q3) {
                                    tablaDeVerdad[i][1] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][1] = "   F   ";
                                }
                                if (noP3) {
                                    tablaDeVerdad[i][2] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][2] = "   F   ";
                                }
                                if (noQ3) {
                                    tablaDeVerdad[i][3] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][3] = "   F   ";
                                }
                                if (conjuncion3) {
                                    tablaDeVerdad[i][4] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][4] = "   F   ";
                                }
                                if (disyuncion3) {
                                    tablaDeVerdad[i][5] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][5] = "   F   ";
                                }
                                if (condicional3) {
                                    tablaDeVerdad[i][6] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][6] = "   F   ";
                                }
                                if (bicondicional3) {
                                    tablaDeVerdad[i][7] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][7] = "   F   ";
                                }
                                if (disyExcl3) {
                                    tablaDeVerdad[i][8] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][8] = "   F   ";
                                }
                            } else if (i == 4) {
                                boolean p4 = false;
                                boolean q4 = false;
                                boolean noP4 = true;
                                boolean noQ4 = true;
                                boolean conjuncion4 = false;
                                boolean disyuncion4 = false;
                                boolean condicional4 = true;
                                boolean bicondicional4 = true;
                                boolean disyExcl4 = false;
                                
                                if (p4) {
                                    tablaDeVerdad[i][0] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][0] = "   F   ";
                                }

                                if (q4) {
                                    tablaDeVerdad[i][1] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][1] = "   F   ";
                                }
                                if (noP4) {
                                    tablaDeVerdad[i][2] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][2] = "   F   ";
                                }
                                if (noQ4) {
                                    tablaDeVerdad[i][3] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][3] = "   F   ";
                                }
                                if (conjuncion4) {
                                    tablaDeVerdad[i][4] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][4] = "   F   ";
                                }
                                if (disyuncion4) {
                                    tablaDeVerdad[i][5] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][5] = "   F   ";
                                }
                                if (condicional4) {
                                    tablaDeVerdad[i][6] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][6] = "   F   ";
                                }
                                if (bicondicional4) {
                                    tablaDeVerdad[i][7] = "   V   ";
                                } else {
                                    tablaDeVerdad[i][7] = "   F   ";
                                }
                                if (disyExcl4) {
                                    tablaDeVerdad[i][8] = "   V   ";
                                } else {
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
                    System.out.println("1) Idempotencia\n"
                            + "                    a) p v p ≡ p\n"
                            + "                    b) p ^ p ≡ p ");
                    System.out.println("-------------");
                    System.out.println("2) Conmutativa\n"
                            + "                    a) p v q ≡ q v p\n"
                            + "                    b) q ^ p ≡ p ^ q");
                    System.out.println("-------------");
                    System.out.println("3) Asociativa\n"
                            + "                    a) p v (q v r) ≡ (p v q) v r\n"
                            + "                    b) p ^ (q ^ r) ≡ (p ^ q) ^ r");
                    System.out.println("-------------");
                    System.out.println("4) Distributiva\n"
                            + "                    a) p v (q ^ r) ≡ (p v q) ^ (p v r)\n"
                            + "                    b) p ^ (q v r) ≡ (p ^ q) v (p ^ r)");
                    System.out.println("-------------");
                    System.out.println("5) Involución\n"
                            + "                    a) ¬(¬p) ≡ p\n"
                            + "                    b) ¬(V) ≡ F\n"
                            + "                    c) ¬(F) ≡ V");
                    System.out.println("-------------");
                    System.out.println("6) Identidad\n"
                            + "                    a) p v V ≡ V\n"
                            + "                    b) p v F ≡ p\n"
                            + "                    c) p ^ V ≡ p\n"
                            + "                    d) p ^ F ≡ F");
                    System.out.println("-------------");
                    System.out.println("7) Complemento\n"
                            + "                    a) p v ¬p ≡ V\n"
                            + "                    b) p ^ ¬p ≡ F");
                    System.out.println("-------------");
                    System.out.println("8) Morgan\n"
                            + "                    a) ¬(p ^ q) ≡ ¬p v ¬q\n"
                            + "                    b) ¬(p v q) ≡ ¬p ^ ¬q");
                    System.out.println("-------------");
                    System.out.println("9) Ley de absorción\n"
                            + "                    Total\n"
                            + "                    a) p v (q ^ p) ≡ p\n"
                            + "                    b) q ^ (p v q) ≡ q\n"
                            + "                    Parcial\n"
                            + "                    a) ¬p ^ (q v p) ≡ ¬p ^ q\n"
                            + "                    b) ¬q v (q ^ p) ≡ ¬q v p \n"
                            + "                    Requisitos: \n"
                            + "                    - los dos conectores, afuera y adentro del paréntesis\n"
                            + "                    tienen que ser diferentes.\n"
                            + "                    - debe haber dos proposiciones. Buscamos la proposición \n"
                            + "                    idéntica y todo se reduce a esta.\n"
                            + "                    - si las proposiciones son parecidas pero una está negada\n"
                            + "                    tomamos la proposición que está fuera del paréntesis con el \n"
                            + "                    conector que la acompaña y la proposición diferente que está\n"
                            + "                    adentro del paréntesis.");
                    System.out.println("-------------");
                    System.out.println("10) Simplificación de la condicional\n"
                            + "                    p → q ≡ ¬p v q");
                    System.out.println("-------------");
                    System.out.println("11) Implicaciones asociadas a una dada\n"
                            + "                    Directa\n"
                            + "                    p → q\n"
                            + "                    Contradicción\n"
                            + "                    ¬p → ¬q\n"
                            + "                    Recíproca\n"
                            + "                    q → p\n"
                            + "                    Contrarecíproca\n"
                            + "                    ¬q → ¬p");
                    System.out.println("-------------");
                    System.out.println("12) Equivalencia de la bicondicional\n"
                            + "                    p ↔ q ≡ ¬(p ▲ q)\n"
                            + "                    */");
                    continue;
                case 3:
                    System.out.println("TRABAJO EN CURSO Disculpe las molestias");
                    continue;
                case 4:
                    System.out.println("¿Está seguro de que desea salir? (si/no)");
                    confirmacionSalida = sc.next();
            }
        } while (confirmacionSalida.equals("no"));
    }

    
    public static void rellenar(boolean p, boolean q, boolean noP, boolean noQ, boolean conjuncion, boolean disyuncion, boolean condicional, boolean bicondicional, boolean disyExcl) {
        p = p;
        q = q;
        noP = !p;
        noQ = !q;
        conjuncion = p && q;
        disyuncion = p || q;
        condicional = !p || q;
        bicondicional = (!p || q) && (!q || p);
        disyExcl = !((!p || q) && (!q || p));
    }

}
