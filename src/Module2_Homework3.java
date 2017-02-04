/**
 * Created by Guillaume Gingembre on 03/02/2017.
 */
public class Module2_Homework3 {
    public static void main(String[] args) {
        double commRate;
        String name;
        double withdrawal;

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        commRate = (double) 5/100;

        name = "Ann";
        withdrawal = 100;

        enquiry(balances, ownerNames, name, withdrawal, commRate);

        name = "Oww";
        withdrawal = 490;

        enquiry(balances, ownerNames, name, withdrawal, commRate);
    }

    public static void enquiry(int[] balances, String [] ownerNames, String name, double withdrawal, double commissions) {

        double[] WithdrawalReturn; // declare array to store information
        int i; // index for array
        int balance; // balance of account, int per array, I would have chosen double as after commissions they can be decimal

        // go check index of name of person who withdraws money
        i = checkIndex(ownerNames, name);

        // go check balance of that person
        balance = checkSum(balances, i);

        // then continue as in exercise 2:

        if (checkbalance(balance,withdrawal,commissions)) {
            WithdrawalReturn = bankwithdrawal(balance, withdrawal, commissions); // calling method

            // printing results
            System.out.println((name + " " + (int) WithdrawalReturn[0] + " " + WithdrawalReturn[1] ));
        } else {
            System.out.println(name + "  NO");
        }
    }

    public static double[] bankwithdrawal(int balance, double withdrawal, double commissions) {
        double [] WithdrawalInfo; // declare array to store information
        WithdrawalInfo = new double [3]; // create array to store 3 float (amount withdrawn, new balance, and commissions)
        double myCom, newBalance;

        myCom = withdrawal * commissions;
        newBalance = balance - withdrawal - myCom;
        WithdrawalInfo[0] = withdrawal;
        WithdrawalInfo[1] = newBalance;
        WithdrawalInfo[2] = myCom;
        return WithdrawalInfo;
    }

    public static boolean checkbalance(double balance, double withdrawal, double commissions){
        boolean OK;
        double myCom;

        OK = false;

        myCom = withdrawal * commissions;

        if (balance >= (withdrawal + myCom)){
            OK = true;
        }
        return (OK);
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

    public static int checkSum(int[] balances, int i) {
        int balance;

        balance = balances[i];

        return (balance);
    }
}