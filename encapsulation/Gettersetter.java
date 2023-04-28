public class Gettersetter {
        private int age;
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age=age;
        }
    }

    class DemoMain{
        public static void main(String[] args) {
            Gettersetter m1 = new Gettersetter();
            m1.setAge(23);
            int v=  m1.getAge();
            System.out.println(v  );
        }


    }

