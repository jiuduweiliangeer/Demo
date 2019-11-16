package Java;

public class Name implements Comparable{
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
    }//因为用equals需要比很多次,重写equals方法一定要重写hashCode方法

    @Override
    public int compareTo(Object o) {/*如果this==o 则返回值为0
                                      如果this>o  则返回值为1
                                      如果this<o  则返回值为-1*/
        Name n=(Name)o;
        int lashCap=
                lastName.compareTo(n.lastName);
        return
                (lashCap!=0?lashCap:firstName.compareTo(n.firstName));
    }//在确定数据类型时调用Collections的sort方法，需要让需要比较的类继承接口Comparable，并且重写Comparable接口中唯一的方法comparaTo，让数据类型强制转换，然后进行比较，对于一般的数据类型则不需要重写，直接使用sort进行排序即可
}

