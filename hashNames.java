import java.util.LinkedHashSet;

public class hashNames{
    public static void main(String[] args){
        LinkedHashSet<String> namesAlpha = new LinkedHashSet<String>();
        LinkedHashSet<String> namesBeta = new LinkedHashSet<String>();
        
        namesAlpha.add("George");
        namesAlpha.add("Jim");
        namesAlpha.add("John");
        namesAlpha.add("Blake");
        namesAlpha.add("Kevin");
        namesAlpha.add("Michael");
        
        namesBeta.add("George");
        namesBeta.add("Katie");
        namesBeta.add("Kevin");
        namesBeta.add("Michelle");
        namesBeta.add("Ryan");

        System.out.println("Alpha list: ");
        System.out.println(namesAlpha);
        System.out.println("Beta list: ");
        System.out.println(namesBeta);
        
        LinkedHashSet<String> namesUnion = new LinkedHashSet<String>();
        LinkedHashSet<String> namesDifferenceAlpha = new LinkedHashSet<String>();
        LinkedHashSet<String> namesDifferenceBeta = new LinkedHashSet<String>();
        LinkedHashSet<String> namesDifferenceGamma = new LinkedHashSet<String>();   //the total difference
        LinkedHashSet<String> namesIntersection = new LinkedHashSet<String>();

        namesUnion = (LinkedHashSet<String>) namesAlpha.clone();
        namesUnion.addAll(namesBeta);
        System.out.println("Union");
        System.out.println(namesUnion);
        
        namesDifferenceAlpha = (LinkedHashSet<String>) namesAlpha.clone();
        namesDifferenceBeta = (LinkedHashSet<String>) namesBeta.clone();
        namesDifferenceAlpha.removeAll(namesBeta);
        namesDifferenceBeta.removeAll(namesAlpha);
        namesDifferenceGamma.addAll(namesDifferenceAlpha);
        namesDifferenceGamma.addAll(namesDifferenceBeta);
        System.out.println("Difference");
        System.out.println(namesDifferenceGamma);
        
        
        namesIntersection = (LinkedHashSet<String>) namesAlpha.clone();
        namesIntersection.retainAll(namesBeta);
        System.out.println("Intersection");
        System.out.println(namesIntersection);



    }
}