//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class CustomException extends Exception{
    public  CustomException(String message)
    {
       super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        String userName="Siva";
        try{
            if(userName.equals("vika"))
            {
                System.out.println("Valid User");
            }
            else
            {
                throw new CustomException("Invalid User");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}