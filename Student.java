import java.util.Arrays;

public class Student {
	private String name;
	private int age; 
	private int[] marks; 
	private EFaculty faculty;


	public Student(String name, int age, int[] marks, EFaculty faculty) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.faculty = faculty;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) throws ExceptionInputAge {
		if(age>=18 && age<=65)
		this.age = age;
		else
			throw new ExceptionInputAge(); 
	}
	
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public EFaculty getFaculty() {
		return faculty;
	}
	public void setFaculty(EFaculty faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + Arrays.toString(marks) + ", faculty=" + faculty
				+ "]";
	} 
	
	public int maxMark() {
		int max=marks[0]; 
		for(int i=0; i<marks.length; i++)
			if(marks[i]>max)
			max= marks[i]; 
		return max;
	}
	
	//used for testing the cross-check
	public int maxMark2() {
		int aux; 
		for(int i=0; i<marks.length; i++)
			for(int j=i+1; j<marks.length; j++)
				if(marks[i]<marks[j]) {
					aux=marks[i]; 
					marks[i]=marks[j]; 
					marks[j]=aux; 
				}
		return marks[0]; 
	}
}
