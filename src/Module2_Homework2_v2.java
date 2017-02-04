/**
 * Created by Guillaume Gingembre on 03/02/2017.
 */
public class Module2_Homework2_v2 {

    public static void main(String[] args) {

        // bank withdrawal example

        float balance, withdrawal, commRate; // all floats because all can have float values, especially after withdrawal

        balance = 100;
        commRate = (float) 5/100;

        withdrawal = 10;
        enquiry(balance, withdrawal, commRate);

        withdrawal = 99;
        enquiry(balance, withdrawal, commRate);
    }

    public static void enquiry(float balance, float withdrawal, float commissions) {

        float[] WithdrawalReturn; // declare array to store information

        if (checkbalance(balance,withdrawal,commissions)) {
            WithdrawalReturn = bankwithdrawal(balance, withdrawal, commissions); // calling method
            // printing results
            System.out.println(("OK " + WithdrawalReturn[2] + " " + WithdrawalReturn[1] ));
        } else {
            System.out.println("NO");
        }
    }

    public static float[] bankwithdrawal(float balance, float withdrawal, float commissions) {
        float [] WithdrawalInfo; // declare array to store information
        WithdrawalInfo = new float[3]; // create array to store 3 float (amount withdrawn, new balance, and commissions)
        float myCom, newBalance;

        myCom = withdrawal * commissions;
        newBalance = balance - withdrawal - myCom;
        WithdrawalInfo[0] = withdrawal;
        WithdrawalInfo[1] = newBalance;
        WithdrawalInfo[2] = myCom;
        return WithdrawalInfo;
    }

    public static boolean checkbalance(float balance, float withdrawal, float commissions){
        boolean OK;
        float myCom;

        OK = false;

        myCom = withdrawal * commissions;

        if (balance >= (withdrawal + myCom)){
            OK = true;
        }
        return (OK);
    }
}