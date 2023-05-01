package Abstaction;

abstract class Language {
    abstract void Study();
    
    {
        System.out.println("Study 2 is this");
    }
    //method of abstract class
    public void display()
    {
        System.out.println("This is Java program");
    }
}
class  Hindi extends Language{
    public void Study(){
        System.out.println("This is hindi ");
    }
}
class wain {
    public static void main(String[] args) {
        Hindi ob = new Hindi();
        ob.display();
    }
}
