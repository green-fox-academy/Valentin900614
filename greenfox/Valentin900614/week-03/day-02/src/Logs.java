import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.

        List<String> log = new ArrayList<>();

        try {
            Path path = Paths.get("log.txt");
            log = Files.readAllLines(path);

        } catch (Exception ex) {
            System.err.println("error");
        }

        String[] ip = uniqueIP(log);
        System.out.println("Unique IP addresses (" + ip.length + ") are: ");

        for (String i : ip) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("GET/POST");
        for (int i = 0; i < 2; i++) {
            System.out.print(getPost(log)[i] + " ");
        }
    }

    private static String[] uniqueIP (List<String> l) {
        List<String> IPs = new ArrayList<>();
        for (String i : l) {
            String sub = i.substring(27, 38);        //ha elcsúszik a forrás akár egy karakternyit is már rossz lesz (.split method???)
            if (!IPs.contains(sub))
                IPs.add(sub);
        }
        String[] ip = new String[IPs.size()];
        IPs.toArray(ip);

        return ip;
    }

    private static int[] getPost (List<String> l) {
        int get = 0;
        int post = 0;

        for (String i : l) {
            if (i.contains("GET")) {
                get++;
            } else {
                post++;
            }
        }

        int[] methods = {get, post};
        return methods;
    }

}