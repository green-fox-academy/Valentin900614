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

        try {
            Path path = Paths.get("log.txt");
            List<String> log = Files.readAllLines(path);

            String[] ip = uniqueIP(log);
            System.out.println("Unique IP addresses (" + ip.length + ") are: ");
            for (int i = 0; i < ip.length; i++) {
                System.out.println(ip[i]);
            }

            System.out.println();

            System.out.println("GET/POST");
            for (int i = 0; i < 2; i++) {
                System.out.print(getPost(log)[i] + " ");
            }
        } catch (Exception ex) {
            System.err.println("error");
        }
    }

    public static String[] uniqueIP (List<String> l) {
        List<String> IPs = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            String sub = l.get(i).substring(27, 38);        //ha elcsúszik a forrás akár egy karakternyit is már rossz lesz (.split method???)
            if (!IPs.contains(sub))
                IPs.add(sub);
        }
        String[] ip = new String[IPs.size()];
        IPs.toArray(ip);

        return ip;
    }

    public static int[] getPost (List<String> l) {
        int get = 0;
        int post = 0;

        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).contains("GET")) {
                get++;
            } else {
                post++;
            }
        }
        int[] methods = {get, post};
        return methods;
    }

}