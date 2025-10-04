import java.util.Scanner;

public class PE2 {
    public static void main(String[] args) {
        // creem el scanner i algunes variables per guardar l’estat del jugador
        Scanner e = new Scanner(System.in);
        boolean arc = false, soga = false, bacul = false, manticora = false, ferit = false;

        // text d'introducció i selecció de l'objecte inicial
        System.out.println(
                "Et trobés en una incursió per determinar el parader de un tesor ocult d'un famos lladre recientment executat.\r\n"
                        + "Et van donar a elegir entre tres objectes: \r\n"
                        + "\t-El Soga de la submisio... (Soga)\r\n"
                        + "\t-El bàcul de regressió... (bacul)\r\n"
                        + "\t-El arc de heracle... (arc)\r\n"
                        + " Que vas seleccionar?:");

        // llegim la selecció del jugador
        String item = e.nextLine();

        // assignem l'objecte seleccionat
        if (item.equals("Soga")) {
            soga = true;
        } else if (item.equals("Arc")) {
            arc = true;
        } else {
            bacul = true;
        }

        // inici de la primera prova (sala del got i el quadre)
        System.out.println(
                "El lladre tras una mica de 'persuacio'... Que faras?\r\n"
                        + "\t-Llençar el got al cuadre. (Got)\r\n"
                        + "\t-Avançar a la següent sala. (Avançar)");

        // afegim opcions especials si el jugador té el bàcul o l’arc
        if (bacul) {
            System.out.println("\t -Utilitzar el bacul del regres en el cuadre (Bacul)");
        } else if (arc) {
            System.out.println("\t-Disparar al cuadre amb el Arc de Hèracles (Arc)");
        }

        // llegim la decisió del jugador
        String firstPuzzle = e.nextLine();

        // si escull usar el bacul
        if (firstPuzzle.equals("Bacul") && bacul) {
            // accedeix a la sala del tresor
            System.out.println(
                    "Dilucides que el perill es troba en el cuadre... Que faras?:\r\n"
                            + "\t-Tomar una mica de les joyes per tú (Tomar)\r\n"
                            + "\t -Esperar als teus companys... (Esperar)");
            // el bacul s'utilitza un cop
            bacul = false;

            // llegim la resposta dins la sala
            String secondPuzzle = e.nextLine();

            // final dolent per avarícia
            if (secondPuzzle.equals("Tomar")) {
                System.out.println("Agafes una unes cuantes joyes... (Final Dolent: Sucumb)");
            }
            // final dolent per esperar
            else if (secondPuzzle.equals("Esperar")) {
                System.out.println("Esperes una estona... (Final Dolent: Febre del Or)");
            }

        // si escull usar l’arc al quadre
        } else if (firstPuzzle.equals("Arc") && arc) {
            // final dolent, el tret és reflectit
            System.out.println("Dispares la fletxa... (Final Dolent: Reflecció)");

        // si escull llençar el got al quadre
        } else if (firstPuzzle.equals("Got")) {
            // desbloqueja la sala del tresor
            System.out.println(
                    "Llences el got al cuadre... Que faras?:\r\n"
                            + "\t-Tomar una mica de les joyes per tú (Tomar)\r\n"
                            + "\t -Esperar als teus companys... (Esperar)");

            // si té el bacul, es mostra una nova opció
            if (bacul) {
                System.out.println("\t- No et fies, fer us del bacul en la sala (Bacul)");
            }

            // llegim la nova decisió
            String secondPuzzle = e.nextLine();

            // final dolent per avarícia
            if (secondPuzzle.equals("Tomar")) {
                System.out.println("Agafes unes cuantes joyes... (Final Dolent: Sucumb)");
            }
            // final dolent per esperar
            else if (secondPuzzle.equals("Esperar")) {
                System.out.println("Esperes una estona... (Final Dolent: Febre del Or)");
            }
            // final bo si fa servir el bacul
            else if (secondPuzzle.equals("Bacul") && bacul) {
                System.out.println("El bacul es activat... (Final Bo: Regressió)");
            }

        // si escull avançar i ignora el quadre
        } else {
            // apareix un soldat de roca
            System.out.println("Decideixes avançar... Que faras?\r\n"
                    + "\t-Evadir lo i anar a la seguent sala. (Avançar)\r\n"
                    + "\t-Retrocedir i esperar al grup. (Retrocedir)");

            // opcions especials si té objectes
            if (arc) {
                System.out.println("\t-Destrossar-lo de un dispar. (Arc)");
            } else if (soga) {
                System.out.println("\t -Domar lo amb el llaç. (Soga)");
            }

            // llegim la decisió
            String secondPuzzle = e.nextLine();

            // final dolent: trampa del mimic
            if (secondPuzzle.equals("Retrocedir")) {
                System.out.println("Decideixes donar mitja volta... Final dolent: mimic");
            }
            // final dolent: el golem no es pot domar
            else if (secondPuzzle.equals("Soga")) {
                System.out.println("Llenças la corda... Final dolent: Cor de pedre");
            }
            // si escapa o lluita
            else {
                // si dispara amb l’arc
                if (secondPuzzle.equals("Arc") && arc) {
                    System.out.println("Utilitzes el arc... però es trenca");
                    arc = false;
                }
                // si escapa aprofitant la lentitud del golem
                else {
                    System.out.println("Escabullir te fins a la següent sala");
                }

                // nova prova: la manticora
                System.out.println("en la seguent sala es trova una manticora...");

                // opcions si tens objectes útils
                if (soga || arc) {
                    if (soga) {
                        System.out.println("Que faras?\r\n"
                                + "\t Domar la bestia. (Soga)\r\n"
                                + "\t - Fugir de la bestia (Fugir)");
                    } else if (arc) {
                        System.out.println("Que faras?\r\n"
                                + "\t Acabar amb la bestia. (Arc)\r\n"
                                + "\t - Fugir de la bestia (Fugir)");
                    }

                    // llegim la tercera decisió
                    String thirdPuzzle = e.next();

                    // si escull domar la manticora
                    if (thirdPuzzle.equals("Soga")) {
                        System.out.println("Llenças la corda a la manticora... ara és aliada");
                        manticora = true;
                    }
                    // si escull matar-la amb l'arc
                    else if (thirdPuzzle.equals("Arc")) {
                        System.out.println("Utilitzes el arc... però es trenca");
                        arc = false;
                    }
                    // si escull fugir
                    else {
                        System.out.println("Fuges... però quedes ferit");
                        if (arc) {
                            System.out.println("Sents una estranya força que et fa seguir...");
                        }
                        ferit = true;
                    }

                    // prova final: sala amb abisme i tresor
                    System.out.println("En arribar a la ultima sala... Que faras?:\r\n"
                            + "\t - Saltar al altre costat.(Saltar)\r\n"
                            + "\t - Tumbar la roca (Tumbar)");

                    // si té l’arc, pot usar-lo
                    if (arc){
                        System.out.println("\t - El arc et crida, vol ser utilitzat.(Arc)");
                    }

                    // llegim la última decisió
                    String finalPuzzle = e.next();

                    // si escull usar l’arc
                    if(finalPuzzle.equals("arc") && arc){
                        System.out.println("Agafas el arc... crees un camí... (Final bó?: últim treball)");
                    } 
                    // si escull saltar
                    else if(finalPuzzle.equals("Saltar")){
                        // si té la manticora, sobreviu però queda atrapat
                        if (manticora){
                            System.out.println("La manticora et salva... però quedes atrapat. Final Dolent: Atrapat");
                        }
                        // si no té ajuda, mor
                        else{
                            System.out.println("Saltes... però caus. Final Dolent: Caiguda");
                        }
                    } 
                    // si intenta moure la roca
                    else if(finalPuzzle.equals("Tumbar")){
                        // si està ferit, no pot moure-la
                        if(ferit){
                            System.out.println("Estàs ferit i no pots. Final Dolent: Debilitament");
                        }
                        // si està en condicions, aconsegueix l’or
                        else{
                            System.out.println("Tumbar la roca revela l’or. Final Bo: Riquesa");
                        }
                    }
                }
            }
        }
        e.close();
    }
}
