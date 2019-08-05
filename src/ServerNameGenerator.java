import java.util.Random;
public class ServerNameGenerator {
    public static void main(String[] args) {
        Random rd = new Random();
        String[] adjs={"long","short","sweet","pretty","tall","thin","cold","hot","handsome","ugly"};
        String[] nouns={"dog","cat","fish","tiger","bear","lion","pig","mouse","dragon","snake"};
        int index = rd.nextInt(adjs.length);
        int index1 = rd.nextInt(nouns.length);
        System.out.println("Here is your server name: ");
        System.out.println(nouns[index1]+" "+adjs[index]);
    }
}
