
 class employee2{
    private int id;
    private String name;
    public String getname(){
     return name;
    }
    public void setname(String n){
        name=n;
    }
    public int get(int i){
       return id;

    }
    public void set(int i){
        id=i;
    }


    public void printd(){
        System.out.println("my id is : " +id);
        System.out.println("my name is : " + name );
    }
}
public class Oops {
    public static void main (String[] args){
     employee2 name = new employee2();
     name.setname("kansihk");
     //print the attributes
      name.printd();
    }
}
