public class Book 
{
    //Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves

    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price)
    {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty)
    {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName()
    {
        return this.name;
    }

    public Author[] getAuthors()
    {
        return this.authors;
    }

    public double getPrice()
    {
        return this.price;  
    }

    public int getQty()
    {
        return this.qty;
    }

    public void setQty(int qty)
    {
        this.qty = qty;
    }

    public String toString()
    {
        StringBuilder authorsInfos = new StringBuilder();
        for(int i = 0; i < this.authors.length; i++)
        {
            if(i == this.authors.length - 1)
                authorsInfos.append("Author" + "[" + "name=" + this.authors[i].getName() + "," 
                                  + "email=" + this.authors[i].getEmail() + "," 
                                  + "gender=" + this.authors[i].getGender() + "]");  
            else
            authorsInfos.append("Author" + "[" + "name=" + this.authors[i].getName() + "," 
                              + "email=" + this.authors[i].getEmail() + "," 
                              + "gender=" + this.authors[i].getGender() + "],"); 
        }
        return String.format("Book[name=%s,authors={%s},price=%s,qty=%s]", this.name, authorsInfos.toString(), this.price, this.qty);
    }

    public String getAuthorNames()
    {
        StringBuilder authorNames = new StringBuilder();
        for(int i = 0; i < this.authors.length; i++)
        {
            if(i == this.authors.length - 1)
                authorNames.append(this.authors[i].getName());  
            else
                authorNames.append(this.authors[i].getName() + ',');
        }
        return authorNames.toString();
    }
}
