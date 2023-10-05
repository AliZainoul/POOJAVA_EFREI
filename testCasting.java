public class testCasting{
    public static void main(String[] args){
        /*
        // UPCASTING
        byte b = 127;
        System.out.println(b);
        System.out.println((short) b);
        System.out.println((int) b);
        System.out.println((long) b);
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString((short)b));
        System.out.println(Integer.toBinaryString((int)b));
        //System.out.println(Integer.toBinaryString((long)b));
        */
        /* 
        // DOWNCASTING
        int i = 1000000;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        System.out.println((short) i);
        System.out.println(Integer.toBinaryString((short) i));  
        System.out.println(Integer.toBinaryString(16960));
        */
        // DOWNCASTING short 16 bits (2 bytes) --> byte 8 bits (1 byte)
        short s = 253;
        System.out.println(s);
        System.out.println(Integer.toBinaryString(s));
        System.out.println((byte) s);
        System.out.println(Integer.toBinaryString((byte) s));  
        //System.out.println(Integer.toBinaryString());

        // SHORT:  00000001 00000001
        // BYTE:            00000010
    }
}