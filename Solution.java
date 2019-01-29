
/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person pers = new Person ("Vasia", 25);
        initialize();
    }

    static class Person {
        //напишите тут ваш код
     String name;
     int age;
    
    public void initialize (String name, int age){
    this.name = name;
    this.age = age;
    }
        
    }
}
