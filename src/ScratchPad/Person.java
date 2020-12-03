package ScratchPad;

public class Person {
    private String classMobile = "classMobile";//initialising variable
    private String fName;
    private String sName;
    private int age;
    private double shoeSize;
    
    public Person(String ConstructorMobile, String fName, String sName, int age, double shoeSize){
        this.classMobile = ConstructorMobile;
        this.fName = fName;
        this.sName =sName;
        this.age = age;
        this.shoeSize = shoeSize;
    }
    
    public void method1(){
        System.out.println(classMobile);
    }
    
}
