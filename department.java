//  

class teacher {
    static int y = 4;

}

class student extends teacher {
    static {
        y = 5;
    }
}

public class department {
    public static void main(String[] args) {
        System.out.println("y=" + student.y);
    }
}
