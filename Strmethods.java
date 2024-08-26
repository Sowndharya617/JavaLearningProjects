class Strmethods{
    public static void main(String args []){
        String a =" Hello World! This is a program based on string methods";
        int b = a.length();
        System.out.println("Length of string : "+b);
        char c = a.charAt(12);
        System.out.println("Character at index 12 :"+c);
        String d =a.substring(2,8);
        System.out.println("Subtring of the main string :"+d);
        int e=a.indexOf("l");
        int f = a.lastIndexOf("l");
        System.out.println("First occurance: "+e);
        System.out.println("Last occurance :"+f);
        String g =a.toUpperCase();
        System.out.println("String to uppercase :"+g);
        String h = a.toLowerCase();
        System.out.println("String to lower  case :"+h);
        String z = a.trim();
        System.out.println("Trimming the string for white spaces:"+z);
        String i = a.replace('l', '1');
        String k = a.replace("World", "Sowndharya");
        boolean j = a.equals(" Hello World! ");
        boolean l =a.contains("lo");
        boolean m =a.startsWith("Hel");
        boolean n = a.endsWith("ld! ");
        System.out.println("Starting of ths string :"+m);
        System.out.println("Ending of the string :"+n);
        System.out.println("Substring contains in the main staring : "+l);
        System.out.println("Equality check :"+j);
        System.out.println("Replacing with a charcter : "+i);
        System.out.println("Replacing entire word :"+k);
        String[] words = a.split(" ");
        for(String word:words){
            System.out.println("Word split based on spaces"+word);
        }
        char [] chararray=a.toCharArray();
        for(char ch:chararray){
        System.out.println("Eacc character in the string : "+ch);
        }
    }
}