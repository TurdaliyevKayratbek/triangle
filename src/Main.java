public class Main{
    public static void main(String[] args){
        Triangle triangle=new Triangle();
        triangle.secondnum=5;
        triangle.fourthstage=8;
        triangle.area= 0.5*triangle.secondnum* triangle.fourthstage;
        System.out.println(triangle.area);
    }
}