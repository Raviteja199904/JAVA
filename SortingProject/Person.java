package SortingProject;

public class Person {
   public String name;
   public int age;
    public void birthday(){
        age++;
        System.out.println(name + "is now" + age);
    }
    public Person(String name,int age){}
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
    

