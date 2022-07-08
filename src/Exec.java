package src;

public class Exec{

    public static void main(String[] args) {
        
        
        ConverterPDF converter = new ConverterPDF(args[0], "alterações " + args[1]);
        System.out.println("Info arquivo:");
        System.out.println(converter.toString());
        converter.lerArq();

    }

}