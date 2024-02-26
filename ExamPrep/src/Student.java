public class Student {
    String name;
    int level;
    public Student(String name,int level){
        this.name = name;
        this.level=level;
    }
    public static int getLevel (){
        return 1;
    }
    int returnLevel(){
        return this.level;
    }
}
