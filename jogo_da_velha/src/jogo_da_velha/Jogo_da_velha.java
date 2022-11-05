package jogo_da_velha;

import java.util.Scanner;

public class Jogo_da_velha {

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        boolean a1 = false, a2 = false, a3 = false, b1 = false, b2 = false, b3 = false, c1 = false, c2 = false, c3 = false;
        String A1 = "  ", A2 = "  ", A3 = "  ", B1 = "  ", B2 = "  ", B3 = "  ", C1 = "  ", C2 = "  ", C3 = "  ";
        int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0, p7 = 0, p8 = 0, p9 = 0;
        String posicao;
        int val_jogo = 0, val_jogada = 0;

        System.out.println("JOGO DA VELHA");
        System.out.println("Posições de escolha");
        System.out.println("----------------");
        System.out.println("  A1 | A2 | A3");
        System.out.println(" ----|----|----");
        System.out.println("  B1 | B2 | B3");
        System.out.println(" ----|----|----");
        System.out.println("  C1 | C2 | C3");
        System.out.println("----------------");

        while (val_jogo == 0) {

            //JOGADOR 01
            while (val_jogada == 0) {
                System.out.println("Jogador 01, escolha uma posição válida:");
                posicao = ss.nextLine();
                switch (posicao) {
                    case "A1":
                        if (a1 == false) {
                            a1 = true;
                            A1 = " O";
                            p1 = 1;
                            val_jogada = 1;
                        } else {
                            System.out.println("Local inválido.");
                        }
                        ;
                        break;
                    case "A2":
                        if (a2 == false) {
                            a2 = true;
                            A2 = " O";
                            p2 = 1;
                            val_jogada = 1;
                        } else {
                            System.out.println("Local inválido.");
                        }
                        ;
                        break;
                    case "A3":
                        if (a3 == false) {
                            a3 = true;
                            A3 = " O";
                            p3 = 1;
                            val_jogada = 1;
                        } else {
                            System.out.println("Local inválido.");
                        }
                        ;
                        break;
                    case "B1":
                        if (b1 == false) {
                            b1 = true;
                            B1 = " O";
                            p4 = 1;
                            val_jogada = 1;
                        } else {
                            System.out.println("Local inválido.");
                        }
                        ;
                        break;
                    case "B2":
                        if (b2 == false) {
                            b2 = true;
                            B2 = " O";
                            p5 = 1;
                            val_jogada = 1;
                        } else {
                            System.out.println("Local inválido.");
                        }
                        ;
                        break;
                    case "B3":
                        if (b3 == false) {
                            b3 = true;
                            B3 = " O";
                            p6 = 1;
                            val_jogada = 1;
                        } else {
                            System.out.println("Local inválido.");
                        }
                        ;
                        break;
                    case "C1":
                        if (c1 == false) {
                            c1 = true;
                            C1 = " O";
                            p7 = 1;
                            val_jogada = 1;
                        } else {
                            System.out.println("Local inválido.");
                        }
                        ;
                        break;
                    case "C2":
                        if (c2 == false) {
                            c2 = true;
                            C2 = " O";
                            p8 = 1;
                            val_jogada = 1;
                        } else {
                            System.out.println("Local inválido.");
                        }
                        ;
                        break;
                    case "C3":
                        if (c3 == false) {
                            c3 = true;
                            C3 = " O";
                            p9 = 1;
                            val_jogada = 1;
                        } else {
                            System.out.println("Local inválido.");
                        }
                        ;
                        break;
                    default:
                        System.out.println("Local inválido. Por favor escolher um dos locais abaixo:");
                        System.out.println("----------------");
                        System.out.println("  A1 | A2 | A3");
                        System.out.println(" ----|----|----");
                        System.out.println("  B1 | B2 | B3");
                        System.out.println(" ----|----|----");
                        System.out.println("  C1 | C2 | C3");
                        System.out.println("----------------");
                        break;
                }
            }
            val_jogada = 0;

            System.out.println("----------------");
            System.out.println("  " + A1 + " | " + A2 + " | " + A3);
            System.out.println(" ----|----|----");
            System.out.println("  " + B1 + " | " + B2 + " | " + B3);
            System.out.println(" ----|----|----");
            System.out.println("  " + C1 + " | " + C2 + " | " + C3);
            System.out.println("----------------");

            //VALIDAR AQUI SE O JOGADOR 01 VENCEU!!!!
            if (p1 == 1 && p2 == 1 && p3 == 1 || p4 == 1 && p5 == 1 && p6 == 1 || p7 == 1 && p8 == 1 && p9 == 1 || p1 == 1 && p5 == 1 && p9 == 1 || p3 == 1 && p5 == 1 && p7 == 1 || p1 == 1 && p4 == 1 && p7 == 1 || p2 == 1 && p5 == 1 && p8 == 1 || p3 == 1 && p6 == 1 && p9 == 1) {
                System.out.println("Jogador 01 venceu!!!!!!!!");
                val_jogo = 1;
            } else if (a1 == true && a2 == true && a3 == true && b1 == true && b2 == true && b3 == true && c1 == true && c2 == true && c3 == true && val_jogo == 0) {
                System.out.println("O jogo empatou !!!!!!");
            } else {

                //JOGADOR 02
                while (val_jogada == 0) {
                    System.out.println("Jogador 02, escolha uma posição válida:");
                    posicao = ss.nextLine();
                    switch (posicao) {
                        case "A1":
                            if (a1 == false) {
                                a1 = true;
                                A1 = " X";
                                p1 = 2;
                                val_jogada = 1;
                            } else {
                                System.out.println("Local inválido.");
                            }
                            ;
                            break;
                        case "A2":
                            if (a2 == false) {
                                a2 = true;
                                A2 = " X";
                                p2 = 2;
                                val_jogada = 1;
                            } else {
                                System.out.println("Local inválido.");
                            }
                            ;
                            break;
                        case "A3":
                            if (a3 == false) {
                                a3 = true;
                                A3 = " X";
                                p3 = 2;
                                val_jogada = 1;
                            } else {
                                System.out.println("Local inválido.");
                            }
                            ;
                            break;
                        case "B1":
                            if (b1 == false) {
                                b1 = true;
                                B1 = " X";
                                p4 = 2;
                                val_jogada = 1;
                            } else {
                                System.out.println("Local inválido.");
                            }
                            ;
                            break;
                        case "B2":
                            if (b2 == false) {
                                b2 = true;
                                B2 = " X";
                                p5 = 2;
                                val_jogada = 1;
                            } else {
                                System.out.println("Local inválido.");
                            }
                            ;
                            break;
                        case "B3":
                            if (b3 == false) {
                                b3 = true;
                                B3 = " X";
                                p6 = 2;
                                val_jogada = 1;
                            } else {
                                System.out.println("Local inválido.");
                            }
                            ;
                            break;
                        case "C1":
                            if (c1 == false) {
                                c1 = true;
                                C1 = " X";
                                p7 = 2;
                                val_jogada = 1;
                            } else {
                                System.out.println("Local inválido.");
                            }
                            ;
                            break;
                        case "C2":
                            if (c2 == false) {
                                c2 = true;
                                C2 = " X";
                                p8 = 2;
                                val_jogada = 1;
                            } else {
                                System.out.println("Local inválido.");
                            }
                            ;
                            break;
                        case "C3":
                            if (c3 == false) {
                                c3 = true;
                                C3 = " X";
                                p9 = 2;
                                val_jogada = 1;
                            } else {
                                System.out.println("Local inválido.");
                            }
                            ;
                            break;
                        default:
                            System.out.println("Local inválido. Por favor escolher um dos locais abaixo:");
                            System.out.println("----------------");
                            System.out.println("  A1 | A2 | A3");
                            System.out.println(" ----|----|----");
                            System.out.println("  B1 | B2 | B3");
                            System.out.println(" ----|----|----");
                            System.out.println("  C1 | C2 | C3");
                            System.out.println("----------------");
                            break;
                    }
                }
                val_jogada = 0;

                System.out.println("----------------");
                System.out.println("  " + A1 + " | " + A2 + " | " + A3);
                System.out.println(" ----|----|----");
                System.out.println("  " + B1 + " | " + B2 + " | " + B3);
                System.out.println(" ----|----|----");
                System.out.println("  " + C1 + " | " + C2 + " | " + C3);
                System.out.println("----------------");

                //VALIDAR AQUI SE O JOGADOR 02 VENCEU!!!!
                if (p1 == 2 && p2 == 2 && p3 == 2 || p4 == 2 && p5 == 2 && p6 == 2 || p7 == 2 && p8 == 2 && p9 == 2 || p1 == 2 && p5 == 2 && p9 == 2 || p3 == 2 && p5 == 2 && p7 == 2 || p1 == 2 && p4 == 2 && p7 == 2 || p2 == 2 && p5 == 2 && p8 == 2 || p3 == 2 && p6 == 2 && p9 == 2) {
                    System.out.println("Jogador 02 venceu!!!!!!!!");
                    val_jogo = 1;
                } else if (a1 == true && a2 == true && a3 == true && b1 == true && b2 == true && b3 == true && c1 == true && c2 == true && c3 == true && val_jogo == 0) {
                    System.out.println("O jogo empatou !!!!!!");
                }
            }
        }
    }
}
