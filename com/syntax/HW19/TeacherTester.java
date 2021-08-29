package com.syntax.HW19;

public class TeacherTester {
    public static void main(String[] args) {

        ChemistryTeacher chemistryTeacher= new ChemistryTeacher();
        chemistryTeacher.name="Talgat";
        chemistryTeacher.TechChemistry();

        PianoTeacher pianoTeacher=new PianoTeacher();
        pianoTeacher.name="Nailya";
        pianoTeacher.teachPiano();

        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.name="Daulet";
        mathTeacher.teachMath();
    }
}
