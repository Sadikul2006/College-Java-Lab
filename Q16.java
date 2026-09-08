import java.util.*;

class Area {

    int length;
    int breadth;

    void setDim(int l, int b) {
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }
}

class Q16 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length : ");
        int l = sc.nextInt();

        System.out.print("Enter Breadth : ");
        int b = sc.nextInt();

        Area obj = new Area();

        obj.setDim(l, b);

        System.out.println("Area of Rectangle : " + obj.getArea());
    }
}