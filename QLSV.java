package QLSV_JVSWING;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {
    ArrayList<SinhVien> arrSV = new ArrayList<>();
    
    
    public void arrangeDsSV(ArrayList<SinhVien> arrSV){
    
        for(int i=0; i< arrSV.size();i++){
            for (int j = 0; j < arrSV.size(); j++) {
                if(arrSV.get(i).getPoint()<arrSV.get(j).getPoint()){
                    SinhVien sv = new SinhVien();
                    sv = arrSV.get(i);
                    arrSV.set(i, arrSV.get(j));
                    arrSV.set(j, sv);
                    
                    
                }
            }
        }
        
    }
    public void ShowListSV(ArrayList<SinhVien> arr){
        for(int i = 0; i<arr.size();i++){
            arr.get(i).outputInForSV();
        }
    }
    public void InputListSV(int n){
        for(int i=0; i <n;i++){
            System.out.println("Please enter the student's name: "+(i+1));
            SinhVien sv = new SinhVien();
            sv.inputInForSV();
            arrSV.add(sv);
        }
            
    }
    public void searchSV(ArrayList<SinhVien> arr, String Name){
        int j = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().lastIndexOf(Name)>= 0) {
                arr.get(i).outputInForSV();
                j=1;
            }
        }
        if (j == 0) {
            System.out.println("Could not find student name!");
        }
    }
    public static void main(String[] args) {
        QLSV_JVSWING.QLSV q = new QLSV();
        
        Scanner input = new Scanner(System.in);
        int Select, i=0;
        while (i==0) {
            System.out.println("***********Menu***********");
        System.out.println("Please select the iteam you need");
        System.out.println("1.Enter the list of Students");
        System.out.println("2.Display student information");
        System.out.println("3.Sort student list");
        System.out.println("4.Search student information");
        System.out.println("5.Exit");
        Select = input.nextInt();
        switch (Select) {
            case 1:
                System.out.println("Please enter the student number on the list: ");
                int n = input.nextInt();
                q.InputListSV(n);
                
                break;
                
            case 2:
                q.ShowListSV(q.arrSV);
                break;
                
            case 3:
                q.arrangeDsSV(q.arrSV);
                q.ShowListSV(q.arrSV);
                break;
                
            case 4:
                input.nextLine();
                System.out.println("Please enter the name of the student you are looking for");
                String a =input.nextLine();
                q.searchSV(q.arrSV, a);
                break;  
                
            case 5:
                i=1;
                System.out.println("Thank you!");
                break;
        }            
       }
        
        
        
        
        
        
    }
    
    
}
