// Q.17  Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
//       Assign the value of roll_no as '1' and that of name as "Sadikul" by creating an object of the class Student. 


class Student {
    String name;
    int roll_no;
}

class Q17 {
    public static void main(String args[]) {
        Student st = new Student();
        st.name = "Sadikul";
        st.roll_no = 1;

        System.out.println("Name : " + st.name);
        System.out.println("Roll No : " + st.roll_no);
    }
}