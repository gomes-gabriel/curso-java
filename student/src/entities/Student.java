package entities;

public class Student 
{
	public String name;
	public double grade1, grade2, grade3;
	double finalGrade;
	
	public void finalGrade()
	{
		finalGrade = grade1 + grade2 + grade3;
	}
	public String passOrFailed()
	{
		if (finalGrade >= 60)
		{
			return "PASS";
		}
		else
		{
			return String.format("FAILED%nMISSING %.2f POINTS", 60.00 - finalGrade);
		}
	}
	public String toString()
	{
		return String.format("FINAL GRADE = %.2f%n%s", finalGrade, passOrFailed());
	}
}
