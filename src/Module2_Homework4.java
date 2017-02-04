/**
 * Created by Guillaume Gingembre on 04/02/2017.
 */
public class Module2_Homework4 {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};

        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        double deposit = 100;

        // go check index of name of person who deposits money
        int i = checkIndex(ownerNames, ownerName);

        // update account balance

        balances = updateBalances(balances, deposit, i);

        // print results
        printResults(ownerNames, balances, i);

    }

    public static int checkIndex(String [] ownerNames, String name) {
        Boolean SearchName;
        int i, j;

        SearchName = true;
        j = ownerNames.length;
        i = 0;

        while (SearchName && i < j){
            if (ownerNames[i] == name) {
                SearchName = false;
            } else {
                i++;
            }
        }

        if (SearchName == true) {

            System.out.println("ERROR occured :::: ownerName " + name + " not found!!!");
            System.exit(1);
        }

        return (i);
    }

    public static int [] updateBalances(int[] balances, double deposit, int i){

        balances [i] = balances [i] + (int) deposit;

        return (balances);

    }

    public static void printResults(String[] ownerNames, int[] balances, int i){

        System.out.println(ownerNames[i] + " " + balances[i]);

    }

}