interface MyInterface {
    public void myMethod() ;
}

class MyClass implements MyInterface {
    public void myMethod() {
        System.out.println("Custom implementation in class");
    }
}

 class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod(); // Output: Custom implementation in class
    }
}

