package DavidLektioner;

public class MainPerson { public static void main(String[] args){
    Person person1 = new Person("Danne","Jaaa", 19);
    Person2 person2 = new Person2("Danne","dalarna",19,"bagare",20000);
 System.out.println(person1.getNamn() +" "+ person1.adress +" " + person1.alder +"\n"+
         person2.getNamn() +" "+ person2.getAdress() +" "+ person2.alder +" "+ person2.getJobb() +" "+ person2.newSalary());
}
}
