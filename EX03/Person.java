package EX03;

//Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves




public class Person {
    protected String name;
    protected String address;

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person[name="+ name + ",address=" + address + "]";
    }
}

