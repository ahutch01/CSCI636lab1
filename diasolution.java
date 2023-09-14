import java.util.Scanner;

class diasolution{

    
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        String input = userInput.nextLine();
        
        userInput.close();
        for(int i = 0; i <= input.length(); i++){
            char a = input.charAt(i);
            char b = input.charAt(i+1);
            int counter = 0;
            if(a == b){
                counter++;
                System.out.print(b);
                System.out.print(counter);
            }
            else{
                System.out.print(a);
            }
        }
    }
}

//What I could remember of java without Googling