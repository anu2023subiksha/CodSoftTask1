import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Student Name: ");
        String studName = s.nextLine();

        System.out.print("Enter the Tamil Mark: ");
        int tamilMark = s.nextInt();

        System.out.print("Enter the English Mark: ");
        int englishMark = s.nextInt();

        System.out.print("Enter the Math Mark: ");
        int mathMark = s.nextInt();

        System.out.print("Enter the Science Mark: ");
        int scienceMark = s.nextInt();

        System.out.print("Enter the Social Mark: ");
        int socialMark = s.nextInt();


        int totalSubjects = 5;
        int totalMarks = tamilMark + englishMark + mathMark + scienceMark + socialMark;
        
        if(totalMarks <= 500 && tamilMark > 0 && englishMark > 0 && mathMark > 0 && scienceMark > 0 && socialMark > 0){
            float averageMark = (totalMarks) / totalSubjects;

            String grade = "a";
            
            if(averageMark <= 50 && averageMark >= 0){
                grade = "D";
            }
            else if(averageMark <= 60 && averageMark > 50){
                grade = "C";
            }
            else if(averageMark <= 70 && averageMark > 60){
                grade = "B";
            }
            else if(averageMark <= 80 && averageMark > 70){
                grade = "B+";
            }
            else if(averageMark <= 90 && averageMark > 80){
                grade = "A";
            }
            else if(averageMark <= 100 && averageMark > 90){
                grade = "A+";
            }
            
            System.out.println("\n \n \n");

            
            System.out.println("The Grade Sheet of " + studName);
            System.out.println("-------------------------------------------");
            System.out.println("Tamil Mark    :   " + tamilMark);
            System.out.println("English Mark  :   " + englishMark);
            System.out.println("Math Mark     :   " + mathMark);
            System.out.println("Science Mark  :   " + scienceMark);
            System.out.println("Social Mark   :   " + socialMark);
            System.out.println("-------------------------------------------");
            System.out.println("And Your Overall Grade is : " + grade);       
            System.out.println("-------------------------------------------");
        }
        else{
            System.out.println("Enter the Valid Mark ||| Run again!..");
        }

        s.close();
    }  
}
