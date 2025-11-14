package OOP;

class TEst{
    public static void display(){
        System.out.println("Hello from TEst class");
    }
    public static int Clock(int a, int b){
        return a+b;
    }
}

public class D1 {
    public static void main(String[] args) {
        TEst.display();
        int result = TEst.Clock(5, 10);
        System.out.println("Clock result: " + result);
    }
}
