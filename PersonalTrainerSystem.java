import java.util.Scanner;
public class PersonalTrainerSystem
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choice;
        
        do {
            DisplayMenu();
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            while(!(choice>=1 && choice <=5))
            {
                System.out.println("Choice must be between 1 and 5: ");
                DisplayMenu();
                choice = input.nextInt();
            }
            switch (choice) {
                case 1:
                    BMI();
                    break;
                case 2:
                    WorkoutCoach();
                    break;
                
                case 3:
                    Goals();
                    break;
                case 4:
                    DietCoach();
                    break;
                case 5:
                    System.out.println("Thank you! Exiting Program");
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while (choice!=5);

    }
    //Display menu Method//
    public static void DisplayMenu()
    {
        System.out.println();
        System.out.println();
        System.out.println("*****PERSONAL TRAINER SYSTEM*****");
        System.out.println("1.BMI Calculator");
        System.out.println("2.Workout Coach");
        System.out.println("3.Log Personal Record/Goals");
        System.out.println("4.Diet Coach");
        System.out.println("5.EXIT");
        System.out.println("");
    }
     //Bmi Calculator method//
    public static void BMI()
    {
        Scanner input = new Scanner(System.in);
        double height;
        double heights;
        double weight;
        double BMI;
        System.out.println("Please enter your height(In metres): ");
        height = input.nextDouble();
        System.out.println("Please enter your weight(In Kilograms) ");
        weight = input.nextDouble();
        System.out.println("");

        heights= height*height;

        BMI= weight/heights;

        if (BMI < 18.5) {
            System.out.println("Your BMI is: "+BMI);
            System.out.println("You are Underweight");
        } else if (BMI >= 18.5 && BMI <= 25) {
            System.out.println("Your BMI is: "+BMI);
            System.out.println("You are Normal Weight");
        } else if (BMI > 25 && BMI <= 30) {
            System.out.println("Your BMI is: "+BMI);
            System.out.println("You are Overweight");
        } else {
            System.out.println("Your BMI is: "+BMI);
            System.out.println("You are Obese");
        }
    }
    //loging goals 
    public static void Goals()
    {
        Scanner scanner = new Scanner(System.in);
        String[] exercises = {"Bench PR", "Squat PR"};

        double [] currentPR = new double [3];
        
        double [] currentGoal =new double [3];
        
        
        for (int i = 0; i < exercises.length; i++)
        {
            System.out.print("Enter your " + exercises[i] + ": ");
            currentPR[i] = scanner.nextDouble();
        }
        System.out.println("");
        System.out.println("***Current Personal Records***");
        for (int i = 0; i < exercises.length; i++) 
        {
            System.out.println(exercises[i] + ": " + currentPR[i]);
        }
        System.out.println("");
        System.out.println("***Goals***");
        for (int i = 0; i<exercises.length; i++)
        {
            System.out.println("Enter your goal " + exercises[i] + ": ");
            currentGoal[i] = scanner.nextDouble();
        }
        
        double goal1 = currentPR[0] - currentGoal[0];
        double goal2 = currentPR[1] - currentGoal[1];

        System.out.println("You are: " + goal1 + " KG away from your goal for " + exercises[0]);
        System.out.println("You are: " + goal2 + " KG away from your goal for " + exercises[1]);
    }
    //Calorie calculator//
   public static void DietCoach() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your gender (M/F): ");
        char gender = scanner.next().charAt(0);
        System.out.println("");
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("");

        System.out.print("Enter your height (in cm): ");
        double height = scanner.nextDouble();
        System.out.println("");

        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();
        System.out.println("");

        double bmr;
        if (gender == 'M' || gender == 'm') {
            bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        } else if (gender == 'F' || gender == 'f') {
            bmr = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
        } else {
            System.out.println("Invalid gender.");
            return;
        }

        //https://www.bmi-calculator.net/bmr-calculator/ //
        
        System.out.println("Select your activity level:");
        System.out.println("1. Sedentary (Little or no exercise)");
        System.out.println("2. Lightly active (Light exercise/sports 1-3 days/week)");
        System.out.println("3. Moderately active (Moderate exercise/sports 3-5 days/week)");
        System.out.println("4. Very active (Hard exercise/sports 6-7 days a week)");
        System.out.println("5. Extremely active (Very hard exercise/sports & physical job)");
        System.out.println("");
        System.out.print("Enter your activity level (1-5): ");
        int activityLevel = scanner.nextInt();
        
        double activity;
        switch (activityLevel) {
            case 1:
                activity = bmr * 1.2;
                break;
            case 2:
                activity = bmr * 1.375;
                break;
            case 3:
                activity = bmr * 1.55;
                break;
            case 4:
                activity = bmr * 1.725;
                break;
            case 5:
                activity = bmr * 1.9;
                break;
            default:
                System.out.println("Invalid activity level.");
                return;
        }

        System.out.println("");
        System.out.println("*** Nutrition Plan ***");
        System.out.println("Caloric Intake: " + activity + " calories");
    }
    //print workout 
    public static void WorkoutCoach()
    {

        String[] days = {"Monday", 
                "Tuesday",
                "Wednesday",
                "Thursday", 
                "Friday"};

        String[] workouts = {"Chest and Triceps",
                "Back and Biceps",
                "Legs",
                "Rest",
                "Shoulders and Arms",
                "Cardio and Core",
                "Rest"};

        System.out.println("***Weekly Workout Plan***");
        for (int i = 0; i < days.length; i++) {
            System.out.println("");
            System.out.println(days[i] + ": " + workouts[i]);
        }

        exercises();

    }
    //exercise list method
    public static void exercises()
    { 
        System.out.println("");
        System.out.println("***Chest***" + "                                                   ***Back***");
        System.out.println("Bench Press: 5Reps X 2Sets" + "                            Lat Pulldown: 8Reps X 3Sets");
        System.out.println("Incline Bench Press: 5Reps X 2Sets" + "                    Upper Back Row: 8Reps X 2Sets");
        System.out.println("Cable Flies: 10 Reps X 2Sets" + "                          FacePulls: 8Reps X 2Sets");
        System.out.println("" + "                                                      Single Arm LatPulldown: 8Reps X2Sets");
        System.out.println("");
        System.out.println("***Triceps***" + "                                               ***Biceps***");
        System.out.println("JM Press: 8Reps X 2Sets" + "                               Dumbell Curls:  10Reps X2Sets");
        System.out.println("Tricep pulldowns:12Reps X 3 Sets" + "                      Dumbell Hammer Curls: 10Reps X 2 Sets");
        System.out.println("Single Arm Tricep Extensions 12 X 2Sets" + "               Cable Curls: 8Reps X 2 Sets");
        System.out.println("");
        System.out.println("***Legs***" + "                                                   ***Shoulders***");
        System.out.println("Barbell Squats: 12Reps X 1Set + 8Reps X 2Sets" + "              Dumbell Shoulder Press:10Reps X1Set +8Reps X 2Sets");
        System.out.println("Leg Curl:  12Reps X 3Sets" + "                             Cable lateral rasies:10Reps X3Sets");
        System.out.println("Leg Extension: 12Reps X3sets" + "                          Reverse flies:10Reps X2Sets");
        System.out.println("Calf Raises: 15Reps X 2Sets");
        System.out.println("");
        System.out.println("***Rest Day***");
        System.out.println("");
        System.out.println("***Cardio/Core***");
        System.out.println("2KM Jog");
        System.out.println("5 X 100m Sprints");
        System.out.println("30 sits + 30 Russian Twists + 1 Minute Plank X3");
        System.out.println("50 leg raises");

    }
}

