class WomenEmployee{
String empName;
int empNo;
byte expYrs;
String gender;
double basicSalary;
double bonus;
double netsalary;
void setWomenEmployee(String Name,int no,String sex,byte ex,double basicsalary){
  empName=Name;
  empNo=no;
  expYrs=ex;
  basicSalary=basicsalary;
  }
  void getEmployeeDetails(){
  if (gender=="female"){
  bonus=basicSalary*10/100;
  netsalary=basicSalary+bonus;
  }
  else
  {
  netsalary=basicSalary;
  }
  System.out.println(empName+"\t"+empNo+"\t"+expYrs+"\t"+gender+"\t"+basicSalary+"\t"+bonus+"\t"+netsalary+"\n");
  }
  public static void main(String[] args){
	  WomenEmployee Rahul=new WomenEmployee();
	  Rahul.setWomenEmployee("Rahul",12897,"male",(byte)20,100000.0d);
	  System.out.println("empName\tempNo+\texpYrs\tgender\tbasicSalary\tbonus\tnetsalary\n");
	  Rahul.getEmployeeDetails();
	  WomenEmployee Rakesh=new WomenEmployee();
	  Rakesh.setWomenEmployee("Rakesh",12878,"male",(byte)25,200000.0d);
	  Rakesh.getEmployeeDetails();
	  WomenEmployee madhu=new WomenEmployee();
	  madhu.setWomenEmployee("madhu",12897,"female",(byte)18,250000.0d);
	  madhu.getEmployeeDetails();
  }
}