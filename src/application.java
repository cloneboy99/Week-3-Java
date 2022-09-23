
public class application {

  public static void main(String[] args) {

    
    int[] ages = new int[] {
      3, 9, 23, 64, 2, 8, 28, 93, 3
      };
    
    int lastMinusFirst = ages[ages.length - 1] - ages[0];
    System.out.println(lastMinusFirst);
  
    int sumOfAges = 0;
       for(int i = 1; i < ages.length; i++) {
      sumOfAges = sumOfAges + ages[i];
    }
    int averageOfAges = sumOfAges / ages.length;
       System.out.println(averageOfAges);
   
    
    String[] names = new String[] {
        "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"
    };
    
    for(int i = 0; i < names.length; i++) {
      long sumOfNames = 0;
      long sumOfNames = sumOfNames + names[i].chars().count();
    }
    long avgOfNames = sumOfNames / names.length;
    System.out.println(avgOfNames);
  }
}

