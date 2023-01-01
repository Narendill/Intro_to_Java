package Four;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> name = new ArrayList<>();
        ArrayList<String> sex = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        LinkedList<Integer> id = new LinkedList<>();

        boolean holdOn = true;
        while (holdOn) {
            System.out.println("Enter user name (Ivanov Ivan Ivanovich): ");
            name.add(sc.nextLine().split(" "));

            System.out.println("Is user man or woman: ");
            sex.add(sc.nextLine());

            System.out.println("Enter user age: ");
            String userAge = sc.nextLine();
            age.add(Integer.valueOf(userAge));

            id.add(name.size() - 1);

            System.out.println("User name: " +
                    name.get(name.size() - 1)[0] + " " +
                    name.get(name.size() - 1)[1].toUpperCase().charAt(0) + "." +
                    name.get(name.size() - 1)[2].toUpperCase().charAt(1) + ". " +
                    "User id: " + name.get(id.size() - 1).hashCode());
            
            System.out.println("New user? Y/N");
            String tmp = sc.nextLine();

            if (tmp.toLowerCase().contains("n"))
                holdOn = false;
        }
        sc.close();

        int count = id.size()-1;
        while (count > -1){
            int maxAge = age.get(id.get(count));
            int index = count;
            for (int i = 0; i < count; i++) {
                
                if(maxAge < age.get(id.get(i))){
                    index = i;
                    maxAge = age.get(id.get(i));
                }
            }
            int tmp = id.get(index);
            id.set(index, id.get(count));
            id.remove(count);
            id.add(tmp);
            count--;
        }

        id.forEach(n -> System.out.println("age="+age.get(n)));




        
    }

}
