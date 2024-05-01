             class College
               {
               	String collegeName;
               	College(String collegeName)
               	{
               	this.collegeName = collegeName;
               	}
               	
               	class Dept
               	{
               	String deptName;
               	Dept(String deptName)
               	{
               	this.deptName = deptName;
               	}
               	
                static public void main(String[] args)
               	{
               	College c = new College("sggs");
               	System.out.println(c.collegeName);
               	Dept d = c.new Dept ("sggs1:");
                System.out.println(c);
                }
                }
                }
