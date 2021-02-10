package se.lexicon.g34.bl;

import se.lexicon.g34.bl.model.PlayerCharacter;
import se.lexicon.g34.bl.utils.Serialize;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) {
        List<PlayerCharacter> pcs=new ArrayList<>();
        pcs.add(new PlayerCharacter(1, "World of Warcraft", "Björn", "Grunge"));
        pcs.add(new PlayerCharacter(2, "Lotro", "Nisse", "Bilbo"));
        pcs.add(new PlayerCharacter(3, "Entropia Universe", "Ebba", "Mama Gab"));
        Serialize.serialize(pcs, "playerCharacters.ser");
        System.out.println("----------------------------------");
        pcs = Serialize.deSserialize("playerCharacters.ser");
        System.out.println(pcs);
    }
}
