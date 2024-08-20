import java.util.Scanner;

public class IT24103604Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter exam marks (0-100): ");
        double examMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid exam marks.Must be between 0 and 100.");
        }


        System.out.print("Enter lab submission marks (0-100): ");
        double labMarks = input.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input! Please enter a value between 0 and 100.");
        }


        System.out.print("Enter thepercentage for exam marks: ");
        double examPercentage = input.nextDouble();

        System.out.print("Enter thepercentage for labsumission marks: ");
        double labPercentage = input.nextDouble();

        if (examPercentage + labPercentage != 100){
            System.out.println("The percentage must add up to 100.");
        }

        double finalMark = (examMarks * (examPercentage / 100) + (labMarks * (labPercentage / 100)));
        System.out.printf("The final mark is: %2f%n", finalMark);

    }
}

	
