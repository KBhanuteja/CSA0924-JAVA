class Parent {
    public void parentMethod() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    public void childMethod() {
        System.out.println("This is child class");
    }
}
 class Main {
    public static void main(String[] args) {
        
        Parent parentObj = new Parent();
        parentObj.parentMethod();

        
        Child childObj = new Child();
        childObj.childMethod();

        
        childObj.parentMethod();
    }
}
