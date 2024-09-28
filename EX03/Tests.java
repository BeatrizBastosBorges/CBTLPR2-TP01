import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Tests 
{
    public static void main(String[] args) 
    {
        //Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves

        Student s = new Student("Miguel", "Rua dos Bobos", "Programming Program", 4, 34.5);
        Staff staff = new Staff("Beatriz", "Samambaia", "IFSP", 800);
        System.out.println("---------------TESTE  STUDENT----------------");
        System.out.println("Antes das mudancas: ");
        System.out.println("Metodos classe Person: ");
        System.out.println("getName(): " + s.getName());
        System.out.println("getAddress(): " + s.getAddress());
        System.out.println("\n");

        System.out.println("Metodos classe Student");
        System.out.println("getProgram(): " + s.getProgram());
        System.out.println("getYear() : " + s.getYear());
        System.out.println("getFee(): " + s.getFee());
        System.out.println("toString(): " + s.toString());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------\n");

        System.out.println("Mudando address para \"Numero 0 \"");
        s.setAddress("Numero 0");
        System.out.println("Mudando program para \"Art Program \"");
        s.setProgram("Art Program");
        System.out.println("Mudando year para 3");  
        s.setYear(3);
        System.out.println("Mudando fee para 45.5");
        s.setFee(45.5);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------\n");


        System.out.println("Depois das mudancas: ");
        System.out.println("Metodos classe Person: ");
        System.out.println("getName(): " + s.getName());
        System.out.println("getAddress(): " + s.getAddress());
        System.out.println("\n");

        System.out.println("Metodos classe Student");
        System.out.println("getProgram(): " + s.getProgram());
        System.out.println("getYear() : " + s.getYear());
        System.out.println("getFee(): " + s.getFee());
        System.out.println("toString(): " + s.toString());

        System.out.println("---------------FIM  TESTE  STUDENT----------------");
        System.out.println("---------------TESTE  STAFF----------------");
        System.out.println("Antes das mudancas: ");
        System.out.println("getName(): " + staff.getName());
        System.out.println("getAddress(): " + staff.getAddress());
        System.out.println("getSchool(): " + staff.getSchool());
        System.out.println("getPay(): " + staff.getPay());
        System.out.println("toString(): " + staff.toString());

        System.out.println("----------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("Mudando school para \"IFSP CBT \"");
        staff.setSchool("IFSP CBT");
        System.out.println("Mudando pay para \" 1000 \"");
        staff.setPay(1000);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------\n");

        System.out.println("Depois das mudancas: ");
        System.out.println("getName(): " + staff.getName());
        System.out.println("getAddress(): " + staff.getAddress());
        System.out.println("getSchool(): " + staff.getSchool());
        System.out.println("getPay(): " + staff.getPay());
        System.out.println("toString(): " + staff.toString());
    }    
}
