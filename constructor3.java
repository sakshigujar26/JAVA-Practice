class Father {
    int balance = 0;

    public static void main(String[] args) {
        Father son = new Father();
        son.fun(Integer.MAX_VALUE,10);
        son.fun(10l, 10); // Note: 10L is a long literal
        System.out.println(son.balance);
    }

    public void fun(int a,long b) {
        System.out.println("inside fun(int, int)");
        System.out.println(a);
    }

    public void fun(int a, long b) {
       System.out.println("long, int");
        System.out.println(a + b);
    }
}


