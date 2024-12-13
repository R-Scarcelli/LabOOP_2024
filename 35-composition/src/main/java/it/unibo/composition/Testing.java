package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {

        // 1)Creare 3 studenti a piacere
        Student sofi = new Student(0, "Sofi", "Pieri", "Studente", 2023);
        Student slay = new Student(1, "Slay", "Pieri", "Studente", 2023);
        Student franca = new Student(2, "Sofi", "Pieri", "Studente", 2023);

        // 2)Creare 2 docenti a piacere
        Professor viroli = new Professor(0, "Mirco", "Viroli", "docente", new String[] { "OOP", "GAME" });
        Professor caselli = new Professor(1, "Roberto", "Caselli", "docente", new String[] { "Algebra", "MDP" });
        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti

        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con
        // nMaxStudents=2
        Exam priExam = new Exam(1, 10, "MDP", caselli, new ExamRoom(30, null, false, false));
        Exam secExam = new Exam(2, 2, "OOP", viroli, new ExamRoom(20, null, false, false));

        // 5) Iscrivere tutti e 3 gli studenti agli esami
        priExam.registerStudent(sofi);
        priExam.registerStudent(slay);
        priExam.registerStudent(franca);
        secExam.registerStudent(sofi);
        secExam.registerStudent(slay);
        secExam.registerStudent(franca);
        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
        System.out.println(priExam.toString() + "\n\n");
        System.out.println(secExam.toString() + "\n\n");
    }
}
