package Interface;

public interface printable {
   void print();
    default void Msg(){
        System.out.println("Iam interface");
    }
}
