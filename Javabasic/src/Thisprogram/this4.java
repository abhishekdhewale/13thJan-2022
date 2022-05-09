package Thisprogram;

public class this4 
{
	int rollno;
	float fee;
	this4(int rollno) 
	{
		this.rollno = rollno;	
	}
	this4(int rollno, float fee) 
	{
		this(rollno);// C.T.Error
		this.fee = fee;		
	}
	void display()
	{
		System.out.println(rollno + " " + fee);
	}

	public static void main(String[] args) 
	{
		this4 s1 = new this4(111);
		this4 s2 = new this4(112, 6000f);
		s1.display();
		s2.display();

	}

}
