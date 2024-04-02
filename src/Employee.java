class Employee {
    float salary=50000;
}
class JavaProgrammer extends Employee{
    int bonus=25000;

    public static void main(String[] args) {
       JavaProgrammer j= new JavaProgrammer();
        System.out.println("Salary:- "+j.salary);
        System.out.println("Bonus :- "+j.salary);
        System.out.println("Total :- "+(j.salary+j.bonus));
    }
}
