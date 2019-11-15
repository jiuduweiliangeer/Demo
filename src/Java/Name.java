package Java;

public class Name {
    private String firstName,lastName;
    public Name(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString()
    {
        return firstName+" "+lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Name){
            Name name=(Name) obj;
            return (firstName.equals(name.firstName)&&lastName.equals(name.lastName));
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return firstName.hashCode();//当这个类的某个对象被当作键的时候，也就是索引的时候调用hashcode
    }//因为用equals需要比很多次
}//重写equals方法一定要重写hashCode方法
