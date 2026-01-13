public class Student {
    //Attributes
    public String name;
    public String id;
    public int score = 0;

    //Methods
    public void doHomework(int point){
        score += point;
        System.out.println(name + " did homework " + point + " points");
    }

    public void takeExam(int point){
        score += point;
        System.out.println(name + " took exam " + point + "points");
    }

    public String getResult(){
        if(score >= 50)
            return "PASS";
        return "FAIL";
    }

    public void showStatus(){
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Score  : " + score);
        System.out.println("Result : " + getResult());
    }
}
