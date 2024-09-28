class Author
{
    //Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves

    private String name;
    private String email;
    private char gender = 'm';
    
    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName()
    {
        return this.name;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public char getGender()
    {
        return this.gender;
    }

    public String toString() 
    {
        return String.format("Author [name=%s, email=%s, gender=%c]", name, email, gender);
    }
}
