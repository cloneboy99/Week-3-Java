
public class application {

  public static void main(String[] args) {

    
    int[] ages = new int[] {
      3, 9, 23, 64, 2, 8, 28, 93, 3
      };
    
   // int lastMinusFirst = ages[ages.length - 1] - ages[0];
   // System.out.println(lastMinusFirst);
  
    int sumOfAges = 0;
       for(int i = 1; i < ages.length; i++) {
      sumOfAges = sumOfAges + ages[i];
    }
    int averageOfAges = sumOfAges / ages.length;
       System.out.println("Average age: " + averageOfAges);
   
    
    String[] names = new String[] {
        "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"
    };
    int i = 0;
    long sumOfNames = 0;
    while(i < names.length){
      sumOfNames = sumOfNames + names[i].chars().count();
      i++;
    }
    long avgOfNames = sumOfNames / names.length;
    System.out.println("Average name length: " + avgOfNames + " characters");
  
    int index = 0;
    while(index < names.length) {
      System.out.printf(names[index] + " ");
      index++;
    }
    System.out.println();
  }
}

