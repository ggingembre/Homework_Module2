/**
 * Created by Guillaume Gingembre on 03/02/2017.
 */
public class Module2_Homework2 {

    public static void main(String[] args) {

        // bank withdrawal example

        float balance, withdrawal, commRate; // all floats because all can have float values, especially after withdrawal

        float[] WithdrawalReturn; // declare array to store information

        balance = 100;
        withdrawal = 10;
        commRate = (float) 5/100;

        WithdrawalReturn = bankwithdrawal(balance, withdrawal, commRate); // calling method

        // printing results

        if (WithdrawalReturn[0] == 0){
            System.out.println("If you withdraw " + withdrawal + ", you will see:NO");
        } else {
            System.out.println(("If you withdraw " + withdrawal + ", you will see: OK " + WithdrawalReturn[2] + " " + WithdrawalReturn[1] ));
        }

        withdrawal = 99;

        WithdrawalReturn = bankwithdrawal(balance, withdrawal, commRate);

        if (WithdrawalReturn[0] == 0){
            System.out.println("If you withdraw " + withdrawal + ", you will see:NO");
        } else {
            System.out.println(("If you withdraw " + withdrawal + ", you will see: OK " + WithdrawalReturn[2] + " " + WithdrawalReturn[1] ));
        }

    }

    public static float[] bankwithdrawal(float balance, float withdrawal, float commissions) {
        float [] WithdrawalInfo; // declare array to store information
        WithdrawalInfo = new float[3]; // create array to store 3 float (amount withdrawn, new balance, and commissions)
        float myCom, newBalance;

        myCom = withdrawal * commissions;

        if (balance >= (withdrawal + myCom)){
            newBalance = balance - withdrawal - myCom;
            WithdrawalInfo[0] = withdrawal;
            WithdrawalInfo[1] = newBalance;
            WithdrawalInfo[2] = myCom;
        } else{
            newBalance = balance;
            myCom = 0;
            WithdrawalInfo[0] = 0;
            WithdrawalInfo[1] = newBalance;
            WithdrawalInfo[2] = myCom;
        }
        return WithdrawalInfo;
    }
}