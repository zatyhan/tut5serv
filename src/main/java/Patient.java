import java.io.Serializable;

public class Patient implements Serializable {
    String name;
    String id;
    String phoneNumber;

    public Patient(String n)
    {
//        name= new String(); //difference btween instantiating new and use this // ans: does not need to create a new variable?
        this.name= n;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id){
        this.id= id;
    }

    public String getPhoneNumber()
    {
        return  phoneNumber;
    }

    public void setPhoneNumber(String number)
    {
        this.phoneNumber= number;
    }
}
