import java.util.Scanner;
import java.util.TreeSet;
import java.io.*;

//Text file credit: https://www.poetryfoundation.org/poems/45474/o-captain-my-captain

public class textFileTree{
    public static void main(String[] args){
        TreeSet<String> wordSet = new TreeSet<String>();

        try{
            File file = new File("treeSet.txt");
            Scanner input = new Scanner(file);
            while(input.hasNext()){
                wordSet.add(input.next());
            }
            input.close();
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Please ensure that a file called treeSet.txt exists...");
        }

        System.out.println(wordSet);

    }
}