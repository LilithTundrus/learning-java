
//file: ListIt.java
import java.io.*;

class ListIt {
    public static void main(String args[]) throws Exception {
        if (args.length < 1) {
            System.out.println("Usage: ListIt [file_to_list]");
        } else {
            File file = new File(args[0]);
            if (!file.exists() || !file.canRead()) {
                System.out.println("Can't read " + file);
                return;
            }
            if (file.isDirectory()) {
                String[] files = file.list();
                for (String fileA : files)
                    System.out.println(fileA);
            } else
                try {
                    Reader ir = new InputStreamReader(new FileInputStream(file));
                    BufferedReader in = new BufferedReader(ir);
                    String line;
                    while ((line = in.readLine()) != null)
                        System.out.println(line);
                } catch (FileNotFoundException e) {
                    System.out.println("File Disappeared");
                }
        }

    }
}