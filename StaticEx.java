class SGGS {
    static int x = 786;
    int y = 2024;

    {
        System.out.println("inside SGGS init block" +this);
        System.out.println(y);
    }

    SGGS() {
        System.out.println("Inside SGGS constructor" +this);
    }
    SGGS(int x){
    	System.out.println("Inside para constructor" +this);
    }

    public static void main(String[] args) {
        SGGS s1 = new SGGS();
         System.out.println(s1);
        System.out.println("Inside main: ");
        s1 = new SGGS(5);
         System.out.println(s1);
    }

    static { 
        System.out.println("Inside SGGS static block");
    }
}

