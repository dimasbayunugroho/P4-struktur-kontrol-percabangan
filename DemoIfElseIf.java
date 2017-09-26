public class DemoIfElseIf {

    public static void main(String[] args){
        double grade = 92.0;
        if(grade >= 90){
            System.out.printIn("Excellent");
        }else if( (grade < 90) && (grade >= 80)){
            System.out.printIn("Good job!");
        }else if( (grade < 80) && (grade >= 60)){
            System.out.printIn("Study harder!");
        }else{
            System.out.printIn("Sorry, you failed.");
        }
    }
}