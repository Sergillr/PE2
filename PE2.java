import java.util.Scanner;
public class PE2 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        boolean arc = false, Soga = false, bacul = false, manticora = false, ferit;
        System.out.println(
                "Et trobés en una incursió per determinar el parader de un tesor ocult d'un famos lladre recientment executat.\r\n"
                        + //
                        "Et van donar a elegir entre tres objectes: \r\n" + //
                        "\t-El Soga de la submisio el qual permet domar qualsevol bèstia (Soga)\r\n" + //
                        "\t-El bàcul de regressió, que dona al usuari la capacitat de retornar cualsevol objecte al seu estat original (bacul)\r\n"
                        + //
                        "\t-El arc de heracle i fletches de Hèracles, Arc amb la el poder de destrossar qualsevol ser inclòs roques d'un shot (arc)\r\n"
                        + //
                        "que vas seleccionar?:\r\n" + //
                        "");
        String item = e.nextLine();
        if (item.equals("Soga")) {
            Soga = true;
        } else if (item.equals("Arc")) {
            arc = true;
        } else {
            bacul = true;
        }
        System.out.println(
                "El lladre tras una mica de 'persuacio' va revelar que el seu tresor es trova a 15 dies del regne en una cova mArcada amb el signe del seu creda.\r\n"
                        + //
                        "La teva espedició arriba a un bosc on et separes en un accident, pero et trobés per el teu compte una cova. Fixante be et dones compte de una mArca a la part de la esquerra de la entrada. Es el teu objectiu. \r\n"
                        + //
                        "Seguint el protocol entres a la cova.\r\n" + //
                        "\r\n" + //
                        "En adentrar se en la misteriosa caberna et trobes amb una cambra.\r\n" + //
                        "Al centre de la cambra sobre una roca es troba un got, en el seu interior una substancia clarament toxica. Al final de la sala un retrata es trova contrastaant amb la hambientacio de la caberna. una porta a la parret esquerra sembla adentrar se mes fins als fons.\r\n"
                        + //
                        "Una sensacio de perill et ofega, fent se més forta cada segon que pasas en la sala. \r\n" + //
                        "Que faras?\r\n" + //
                        "\t-Llençar el got al cuadre (Got)\r\n" + //
                        "\t-Avançar a la següent sala\t(Avançar)\r\n" + //
                        "");
        if (bacul) {
            System.out.println("-Utilitzar el bacul del regres en el cuadre (Bacul)");
        } else if (arc) {
            System.out.println(
                    "\t-Disparar al cuadre amb el Arc de Hèracles (Arc)");
        }
        String firstPuzzle = e.nextLine();
        if (firstPuzzle.equals("Bacul") && bacul) {
            System.out.println(
                    "Dilucides que el perill es troba en el cuadre i decideixes actuar contra aquest. Utilitzes el bacul en el cuadre y una estranya magia desapareix junt amb un crit estrident. \t Darrera del cuadre es troba un pasadis seecret i tras adentrar se una mica troves una sala ple de les joyes mes costoses i el art més valuos del que tenies registre. \r\n"
                            + //
                            "\tSents una imperiosa necessitat de tomar lo...\r\n" + //
                            "\tQue faras?:\r\n" + //
                            "\t\t-Tomar una mica de les joyes per tú (Tomar)\r\n\t\t -Esperar als teus companys a que arrivin a la cova. (Esperar)\r\n"
                            + //
                            "");
            String secondPuzzle = e.nextLine();
            if (secondPuzzle.equals("Tomar")) {
                System.out.println(
                        "\t\t\t-Agafes una unes cuantes joyes, pero no pots evitar pensar que no es suficient aixi que agafes més de la pila, però no satisfeix la teva abaricia i continues tomant i tomant. \r\n"
                                + //
                                "\t\t\tLes teves cames es trenquen sobre el pes del tesor però no pots evitar seguir tomant. El teu cos termina aplastat per les piles de joyes i art. (Final Dolent: Sucumb)\r\n"
                                + //
                                "");
            } else if (secondPuzzle.equals("Esperar")) {
                System.out.println(
                        "\t\t\t- Esperes una estona i finalment arriven els teus companys, els guias fins a la sala però algo no esta bé, tots semblem incomodes miran se entre si amb mirades de desconfiança. Els en algun moment units grup del regne comencen a barallar se per el or de una manera atinatural.\r\n"
                                + //
                                "\t\t\tun del cops termina golpeixant la teva nuca. (Final Dolent: Febre del Or)\r\n" + //
                                "");
        } else if (firstPuzzle.equals("Arc") && arc) {
            System.out.println(
                    "\t\t-Dilucides que el perill es troba en el cuadre i decideixes actuar contra aquest. Dispares la fletxa y fa contacte amb el que sembla una barrera invisible i rapidament es redirigeix fins el teu cor. (Final Dolent: Reflecció) ");

        } else if (firstPuzzle.equals("Got")) {
            System.out.println(
                    "Dilucides que el perill es troba en el cuadre i decideixes actuar contra aquest. Llences el got al cuadre y una estranya magia desapareix junt amb un crit estrident. \t Darrera del cuadre es troba un pasadis seecret i tras adentrar se una mica troves una sala ple de les joyes mes costoses i el art més valuos del que tenies registre. \r\n"
                            + //
                            "\tSents una imperiosa necessitat de tomar lo...\r\n" + //
                            "\tQue faras?:\r\n" + //
                            "\t\t-Tomar una mica de les joyes per tú (Tomar)\r\n\t\t -Esperar als teus companys a que arrivin a la cova. (Esperar)\r\n"
                            + //
                            "");
            if (bacul) {
                System.out.println("\t\t- No et fies, fer us del bacul en la sala (Bacul)\r\n" + //
                        "");
            }
            String secondPuzzle = e.nextLine();
            if (secondPuzzle.equals("Tomar")) {
                System.out.println(
                        "\t\t\t-Agafes una unes cuantes joyes, pero no pots evitar pensar que no es suficient aixi que agafes més de la pila, però no satisfeix la teva abaricia i continues tomant i tomant. \r\n"
                                + //
                                "\t\t\tLes teves cames es trenquen sobre el pes del tesor però no pots evitar seguir tomant. El teu cos termina aplastat per les piles de joyes i art. (Final Dolent: Sucumb)\r\n"
                                + //
                                "");
            } else if (secondPuzzle.equals("Esperar")) {
                System.out.println(
                        "\t\t\t- Esperes una estona i finalment arriven els teus companys, els guias fins a la sala però algo no esta bé, tots semblem incomodes miran se entre si amb mirades de desconfiança. Els en algun moment units grup del regne comencen a barallar se per el or de una manera atinatural.\r\n"
                                + //
                                "\t\t\tun del cops termina golpeixant la teva nuca. (Final Dolent: Febre del Or)\r\n" + //
                                "");
            }
            else {
                System.out.println("-El bacul es activat i aquella necessitat per or desapareix de la teva ment. Ya amb el cap clar decideixes Esperar als teus companys.\r\n" + //
                                        "\t\t\tTras tornar al regne us pagan la vostra part del boti però sembla que el rei esperava més or. (Final Bo: Regressió)");
            }
        }
    }
}
