//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class For{
    String[] stuname;
    public For(String stuname[]) {
        this.stuname=stuname;
        for (int i = 0; i < stuname.length; i++) {
            System.out.println("Name" + (i + 1) + " " + stuname[i]);
        }
    }
}
public class Main {
    public static void main(String[] args) {
           String[] stuname={"siva","vika","shree","vishnu"};
           For f=new For(stuname);
    }
}