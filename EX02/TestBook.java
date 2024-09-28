public class TestBook 
{
    public static void main(String[] args) 
    {
        //Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves

        Author[] authors1 = new Author[2];
        authors1[0] = new Author("Tuler Moraes", "tulermoraes@email.com", 'm');
        authors1[1] = new Author("Matilde Perez", "matildeperez@email.com", 'f');
        Book book = new Book("Livro IFSP", authors1, 19.99);
        
        Author[] authors2 = new Author[3];
        authors2[0] = new Author("J.K. Rowling", "jkrowling@hogwarts.com", 'f');
        authors2[1] = new Author("George R.R. Martin", "grrmartin@westeros.com", 'm');
        authors2[2] = new Author("J.R.R. Tolkien", "jrrtolkien@middleearth.com", 'm');
        Book book2 = new Book("Contos Diversos", authors2, 50.5, 3);

        System.out.println("Livro 1: \n");
        System.out.println("name: " + book.getName());
        System.out.println("price: " + book.getPrice());
        System.out.println("qty: " + book.getQty() );
        System.out.println("authors names: " + book.getAuthorNames());
        System.out.println("authors: " + book.getAuthors());
        System.out.println("toString(): " + book.toString() + "\n");

        System.out.println("----------------------------\n");

        System.out.println("Mudando qty para 5\n");
        book.setQty(5);

        System.out.println("Livro 1: \n");
        System.out.println("name: " + book.getName());
        System.out.println("price: " + book.getPrice());
        System.out.println("qty: " + book.getQty() );
        System.out.println("authors names: " + book.getAuthorNames());
        System.out.println("authors: " + book.getAuthors());
        System.out.println("toString(): " + book.toString() + "\n");

        System.out.println("----------------------------\n");

        System.out.println("Livro 2: \n");
        System.out.println("name: " + book2.getName());
        System.out.println("price: " + book2.getPrice());
        System.out.println("qty: " + book2.getQty() );
        System.out.println("authors names: " + book2.getAuthorNames());
        System.out.println("authors: " + book2.getAuthors());
        System.out.println("toString(): " + book2.toString() + "\n");

        System.out.println("----------------------------\n");
    }    
}
