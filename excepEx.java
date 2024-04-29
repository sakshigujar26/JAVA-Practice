class Example {
    public static void main(String... args){
        try {
            Thread.sleep(1000);
            System.out.println(args[0]);
        }catch(Exception e){
         System.out.println(" exception");
         }
        
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("inside array index");
        }catch (InterruptedException e) {
            System.out.println("inside interrupted exception");
            
        } 
        finally {
            System.out.println("inside finally");
        }
    }
}

