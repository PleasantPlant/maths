package algorithm3;

// This algorithm was inspired by this reddit post: https://www.reddit.com/r/dailyprogrammer/comments/7ttiq5/20180129_challenge_349_easy_change_calculator/
// It calculates the number and type of coins necessary to produce exact change.
public class Main {
    public static void main(String[] args){
        int penny = 1;
        int nickle = 5;
        int dime = 10;
        int quarter = 25;
        int change = 46;
        int quarters = 0;
        int dimes = 0;
        int nickles = 0;
        int pennies = 0;
        int ogChange = change;
        while(change - quarter >= 0){
            change = change - quarter;
            quarters++;
        }
        while(change - dime >= 0){
            change = change - dime;
            dimes++;
        }
        while(change - nickle >= 0){
            change = change - nickle;
            nickles++;
        }
        while(change - penny >= 0){
            change = change - penny;
            pennies++;
        }
        if(change == 0){
            System.out.println("your change is " + ogChange +" cents.");
            System.out.println("your change is comprised of " + quarters +" quarters, " + dimes + " dimes, " + nickles + " nickles, and " + pennies + " pennies");
        }

    }
}
