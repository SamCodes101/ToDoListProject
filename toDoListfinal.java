import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class toDoListfinal{
    public static void main(String[] args){
        Boolean loop = true;
        Scanner input = new Scanner(System.in);
        List<String> toDo = new ArrayList<>();
        
        while (loop){
            //1st
            System.out.println("Add a task: ");
            String answer1 = input.nextLine();
            toDo.add(answer1);

            //modify?

            System.out.println("Do you wish to modify anything? ");
            String answer2 = input.nextLine();
            if (answer2.equalsIgnoreCase("yes")){
                System.out.println("Which task do you wish to modify? ");
                String answer3 = input.nextLine();
                
                //detect modify in list

                for (String item : toDo) {
                if (item.toLowerCase().contains(answer3)) {
                    System.out.println("Found: " + answer3);
                    toDo.remove(answer3);
                }

                else{
                    System.out.println("error");
                }
                }

                System.out.println("What task do you wish to replace it with? ");
                String answer4 = input.nextLine();

                //detect replace in list

                for (String item : toDo) {
                if (item.toLowerCase().contains(answer4)) {
                    System.out.println("Found: " + answer4);
                    toDo.add(answer4);
                }

                else{
                    System.out.println("error");
                }
                }


                System.out.println(toDo);
            }

            else{
                System.exit(0);
            }
        }


    }
}

