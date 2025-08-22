
import java.util.Scanner;
class GradeCalculator {
    public static void main(String[] args) {
	 double marksInPhysics, marksInChemistry, marksInMathematics, totalMarks, percentage;
         Scanner sc = new Scanner(System.in);
	 System.out.print("Enter marks in physics out of 100: ");
	 marksInPhysics = sc.nextDouble();
         System.out.print("Enter marks in chemistry out of 100: ");
	 marksInChemistry = sc.nextDouble();
         System.out.print("Enter marks in mathematics out of 100: ");
	 marksInMathematics = sc.nextDouble();

         totalMarks = marksInPhysics + marksInChemistry + marksInMathematics;
         percentage = ((totalMarks / 300) * 100);
                  
         if (percentage>=80 && percentage<=100){
             System.out.println("Average Marks = " + percentage + "%, Grade: A");
             System.out.println("Remarks- Level-4, above agency-normalised standards.");}
         else if (percentage>=70 && percentage<=79){
             System.out.println("Average Marks = " + percentage + "%, Grade: B");
             System.out.println("Remarks- Level-3, at agency-normalised standards.");}
         else if (percentage>=60 && percentage<=69){
             System.out.println("Average Marks = " + percentage + "%, Grade: C");
             System.out.println("Remarks- Level-2, below but approaching agency-normalised standards.");} 
         else if (percentage>=50 && percentage<=59){
             System.out.println("Average Marks = " + percentage + "%, Grade: D");
             System.out.println("Remarks- Level-1, well below agency-normalised standards.");}
         else if (percentage>=40 && percentage<=49){
             System.out.println("Average Marks = " + percentage + "%, Grade: E");
             System.out.println("Remarks- Level-1, too below agency-normalised standards.");}
         else{
             System.out.println("Average Marks = " + percentage + "%, Grade: R");
             System.out.println("Remarks- Remedial standards.");}
    }
}
