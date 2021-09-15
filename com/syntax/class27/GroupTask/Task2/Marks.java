package com.syntax.class27.GroupTask.Task2;

abstract public class Marks {

    /* We  have  to  calculate  the  average  of  marks obtained in three subjects by student A and by student B.
       Create class 'Marks' with an abstract method  'getPercentage'
       that  will  be  returning the  average  percentage  of  marks.
       Provide implementation of abstract method in classes 'A' and 'B'.
       The constructor of student A takes the marks  in  three  subjects  as  its  parameters
       and the marks in four subjects as its parameters for student B.
       Test your code
     */

    double mark1;
    double mark2;
    double mark3;

    public Marks(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    abstract double getPercentage();
}
class StudentA extends Marks{

    public StudentA(double mark1, double mark2, double mark3) {
        super(mark1, mark2, mark3);
    }

    @Override
    double getPercentage() {
        return(((double)mark1+mark2+mark3)/3);
    }
}
class StudentB extends Marks{

    double mark4;

    public StudentB(double mark1, double mark2, double mark3, double mark4) {
        super(mark1, mark2, mark3);
        this.mark4 = mark4;
    }

    @Override
    double getPercentage() {
        return(((double)mark1+mark2+mark3+mark4)/4);
    }
}