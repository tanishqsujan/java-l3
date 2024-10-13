import java.util.*;
public class grade {
    public static void main(String[] args){
        int sum=0;
        String result;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int num= sc.nextInt();
        int marks[]= new int[num];
        System.out.println("Enter the marks of " +num+ "subjects");
        for(int i=0; i<num; i++){
            marks[i]= sc.nextInt();
        }
        for(int j=0; j<num; j++){
            sum= sum+marks[j];
        }
        int percentage= sum/num;
        System.out.println(percentage);
        if(percentage>=95){
            result= "Your grade is O";
        }
        else if(percentage>=90 && percentage<95){
            result= "Your grade is A+";
        }
        else{
            result= "You passed";
        }
        System.out.println(result);
    }
}
