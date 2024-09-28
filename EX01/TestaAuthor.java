public class TestaAuthor
{
    //Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves
    public static void main(String[] args)
    {
        Author a = new Author("Miguel Luizatto", "miguel@email.com", 'm');

        System.out.println("name: " + a.getName());
        System.out.println("email: " + a.getEmail());
        System.out.println("gender: " + a.getGender());
        System.out.println("------------------------\n");
        a.setEmail("miguel@hotmail.com");
        System.out.println("Declarando novo email como: miguel@hotmail.com\n");
        System.out.println("name: " + a.getName());
        System.out.println("email: " + a.getEmail());
        System.out.println("gender: " + a.getGender());
        System.out.println("------------------------\n");
        System.out.println(a.toString());

    }
}