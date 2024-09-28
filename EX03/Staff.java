public class Staff extends Person
{
    //Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves

    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay)
    {
        super(name, address);   
        this.school = school;
        this.pay = pay;
    }

    public String getSchool()
    {
        return this.school;  
    }

    public void setSchool(String school)
    {
        this.school = school;
    }

    public double getPay()
    {
        return this.pay;
    }

    public void setPay(double pay)
    {
        this.pay = pay; 
    }

    public String toString()
    {
        return String.format("Student[%s,school=%s,pay=%s]", super.toString(), this.school , this.pay);
    }
}
