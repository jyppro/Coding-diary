package week13;

class Animal
{
       String name;
       public Animal()     {
             name = "UNKNOWN";
             System.out.println("동물입니다:" + name);
       }
       public Animal(String name) {
             this.name = name;
             System.out.println("동물입니다:" + name);
       }
}
class Lion extends Animal
{
       public Lion() {      System.out.println("사자입니다.");       }
       public Lion(String name)   {
             super(name);
             System.out.println("사자입니다.");
       }
}
public class Ext_1 
{
       public static void main(String[] args) {
             Lion lion=new Lion("Brave");
             Lion lion2=new Lion();
       }
}