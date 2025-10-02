package PE;

import java.util.Scanner;

public class PE2 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        boolean arc = false, llaç = false, bacul = false, manticora = false, ferit;
        System.out.println(
                "Et trobés en una incursió per determinar el parader de un tesor ocult d'un famos lladre recientment executat.\r\n"
                        + //
                        "Et van donar a elegir entre tres objectes: \r\n" + //
                        "\t-El llaç de la submisio el qual permet domar qualsevol bèstia (llaç)\r\n" + //
                        "\t-El bàcul de regressió, que dona al usuari la capacitat de retornar cualsevol objecte al seu estat original (bacul)\r\n"
                        + //
                        "\t-El arc de heracle i fletches de Hèracles, Arc amb la el poder de destrossar qualsevol ser inclòs roques d'un shot (arc)\r\n"
                        + //
                        "que vas seleccionar?:\r\n" + //
                        "");
        String item = e.next();
        if (item.equals("llaç")) {
            llaç = true;
        } else if (item.equals("arc")) {
            arc = true;
        } else {
            bacul = true;
        }
        System.out.println(
                "El lladre tras una mica de 'persuacio' va revelar que el seu tresor es trova a 15 dies del regne en una cova marcada amb el signe del seu creda.\r\n"
                        + //
                        "La teva espedició arriba a un bosc on et separes en un accident, pero et trobés per el teu compte una cova. Fixante be et dones compte de una marca a la part de la esquerra de la entrada. Es el teu objectiu. \r\n"
                        + //
                        "Seguint el protocol entres a la cova.\r\n" + //
                        "\r\n" + //
                        "En adentrar se en la misteriosa caberna et trobes amb una cambra.\r\n" + //
                        "Al centre de la cambra sobre una roca es troba un caliç, en el seu interior una substancia clarament toxica. Al final de la sala un retrata es trova contrastaant amb la hambientacio de la caberna. una porta a la parret esquerra sembla adentrar se mes fins als fons.\r\n"
                        + //
                        "Una sensacio de perill et ofega, fent se més forta cada segon que pasas en la sala. \r\n" + //
                        "Que faras?\r\n" + //
                        "\t-Llençar el caliç al cuadre (Llençar)\r\n" + //
                        "\t-Avançar a la següent sala\t(Avançar)\r\n" + //
                        "");
        if (bacul) {
            System.out.println("-Utilitzar el bacul del regres en el cuadre (Bacul)");
        } else if (arc) {
            System.out.println(
                    "\t-Disparar al cuadre amb el arc de Hèracles (Arc)");
        }
        String firstPuzzle = e.next();
        if (firstPuzzle.equals("Bacul") && bacul) {
            System.out.println(
                    "\t\t-Dilucides que el perill es troba en el cuadre i decideixes actuar contra aquest. Conjures el bacul en el cuadre y una estranya magia desapareix junt amb un crit estrident. (perds el bacul).\r\n"
                            + //
                            "");
        } else if (firstPuzzle.equals("Arc") && bacul) {
            System.out.println(
                    "\t\t-Dilucides que el perill es troba en el cuadre i decideixes actuar contra aquest. Dispares la fletxa y fa contacte amb el que sembla una barrera invisible i rapidament es redirigeix fins el teu cor. (Final Dolent: Reflecció) ");
        }
        else if (firstPuzzle.equals("Caliç")){
            System.out.println("Dilucides que el perill es troba en el cuadre i decideixes actuar contra aquest. Conjures el bacul en el cuadre y una estranya magia desapareix junt amb un crit estrident.");
        }
        else{
        }
    }
}
