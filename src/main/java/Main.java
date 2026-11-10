import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Resistance, Resistivity, Length, Area, ResistanceAtTemp2, Temp1 , Temp2, TempCoefficientOfResistance, ResistanceAtTemp1;
        int Input;

        System.out.println("Choose The Operation:-\n 1-Find Resistance.\n 2-Find Resistivity.\n 3-Find Length.\n 4-Find Area.\n 5-Find Resistance At Temp2.\n 6-Find Temp2.\n 7- Find Temp Coefficient Of Resistance.\n");
        System.out.println("The Operation Number is : ");
        Scanner scanner = new Scanner(System.in);
        Input = scanner.nextInt();

        if (Input == 1) {
            System.out.println("Enter The Resistivity.");
            Resistivity = scanner.nextDouble();
            System.out.println("Enter Length.");
            Length = scanner.nextDouble();
            System.out.println("Enter Area.");
            Area = scanner.nextDouble();
            Resistance = (Resistivity * Length) / Area;
            System.out.println("Resistance = " + Resistance);
        } else if (Input == 2) {
            System.out.println("Enter The Resistance.");
            Resistance = scanner.nextDouble();
            System.out.println("Enter Length.");
            Length = scanner.nextDouble();
            System.out.println("Enter Area.");
            Area = scanner.nextDouble();
            Resistivity = (Resistance * Area) / Length;
            System.out.println("Resistivity = " + Resistivity);
        } else if (Input == 3) {
            System.out.println("Enter The Resistance.");
            Resistance = scanner.nextDouble();
            System.out.println("Enter Area.");
            Area = scanner.nextDouble();
            System.out.println("Enter The Resistivity.");
            Resistivity = scanner.nextDouble();
            Length = (Resistance * Area) / Resistivity;
            System.out.println("Length = " + Length);
        } else if (Input == 4) {
            System.out.println("Enter The Resistivity.");
            Resistivity = scanner.nextDouble();
            System.out.println("Enter Length.");
            Length = scanner.nextDouble();
            System.out.println("Enter The Resistance.");
            Resistance = scanner.nextDouble();
            Area = (Resistivity * Length) / Resistance;
            System.out.println("Area = " + Area);
        } else if (Input == 5) {
            System.out.println("Enter The Resistance At Temp1");
            ResistanceAtTemp1 = scanner.nextDouble();
            System.out.println("Enter The Temp Coefficient Of Resistance.");
            TempCoefficientOfResistance=scanner.nextDouble();
            System.out.println("Enter The Temp2.");
            Temp2=scanner.nextDouble();
            System.out.println("Enter The Temp1.");
            Temp1=scanner.nextDouble();
            ResistanceAtTemp2=ResistanceAtTemp1*(1+(TempCoefficientOfResistance*(Temp2-Temp1)));
            System.out.println("The Resistance At "+ Temp2 + " Celsius = " + ResistanceAtTemp2);
        }
        else if(Input == 6){
            System.out.println("Enter The Resistance At Temp2.");
            ResistanceAtTemp2=scanner.nextDouble();
            System.out.println("Enter The Resistance At Temp1.");
            ResistanceAtTemp1 = scanner.nextDouble();
            System.out.println("Enter The Temp1.");
            Temp1=scanner.nextDouble();
            System.out.println("Enter The Temp Coefficient Of Resistance.");
            TempCoefficientOfResistance=scanner.nextDouble();
            Temp2=((ResistanceAtTemp2-ResistanceAtTemp1)/(ResistanceAtTemp1*TempCoefficientOfResistance))+Temp1;
            System.out.println("The Temp2 = " + Temp2);
        }
        else if (Input == 7) {
            System.out.println("Enter The Resistance At Temp2.");
            ResistanceAtTemp2=scanner.nextDouble();
            System.out.println("Enter The Resistance At Temp1.");
            ResistanceAtTemp1 = scanner.nextDouble();
            System.out.println("Enter The Temp2.");
            Temp2=scanner.nextDouble();
            System.out.println("Enter The Temp1.");
            Temp1=scanner.nextDouble();
            TempCoefficientOfResistance=(ResistanceAtTemp2-ResistanceAtTemp1)/(ResistanceAtTemp1*(Temp2-Temp1));
            System.out.println("The Temp Coefficient Of Resistance = " + TempCoefficientOfResistance);
        }
        else {
            System.out.println("You Have Entered A Non Valid Number.");
        }


        }

    }




