package QLSV_JVSWING;

import java.util.Scanner;

public class SinhVien {
        private String Name;
        private int age;
        private String Address;
        private float point;

        
        public void inputInForSV(){
            Scanner input = new Scanner(System.in);
            System.out.println("Please fill in the student's Name: ");
            Name = input.nextLine();
            
            System.out.println("Please fill in the student's year of birth: ");
            age = input.nextInt();
            
            input.nextLine();
            System.out.println("Please fill in the student's Address: ");
            Address = input.nextLine();
            
            System.out.println("Please fill in the student's Point: ");
            point = input.nextFloat();
        }
        
        public void outputInForSV(){
            System.out.println("Student name: "+Name+", Born on year: "+age+", Addres: "
                    +Address+", Received: "+point+"point");
        }
        
        
        
        
        
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public int getAge() {
        return age;
    }

    public float getPoint() {
        return point;
    }
        
        
        

    
}
