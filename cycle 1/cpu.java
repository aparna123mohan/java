public class cpu{
   
     class processor{
        int cores;
        String producer;
        processor(int noC, String manu){
            cores=noC;
            producer=manu;
        }
        void display(){
       System.out.println("\nPROCESSOR DETAILS");
        System.out.println("No. of Cores = "+cores);
        System.out.println("Manufacturer = "+producer+"\n");
    }
    }
    static class ram{
        int mem;
        String manuf;
        ram(int memory,String producer ){
            mem=memory;
            manuf=producer;
        }
        void display(){
        System.out.println("Name : APARNA MOHAN");
        System.out.println("Reg no : SJC 22MCA-2013");
        System.out.println("Course code : 20MCA132");
        System.out.println("Date : 24/3/2023");
        
        System.out.println("\nRAM DETAILS");
        System.out.println("Memory = "+mem+" GB");
        System.out.println("Manufacturer = "+manuf+"\n");
    }}
    public static void main(String[] args) {
         cpu.ram obj1= new cpu.ram(8,"Intel");
         cpu obj2 = new cpu();
         cpu.processor obj3 = obj2.new processor(8,"Samsung");
         obj1.display();
         obj3.display();

    }
}
