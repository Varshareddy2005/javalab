class Mployee{
String empName;
int empNo;
float salary;
String empDesig;
byte expYrs;
void setMployee(String Name,int no,float sal,String des,byte ex){
empName=Name;
empNo=no;
salary=sal;
empDesig=des;
expYrs=ex;
}
void getMployee(){
System.out.println(empName+"\t"+empNo+"\t"+salary+"\t"+empDesig+"\t"+expYrs+"\n");
}
public static void main(String[] args){
Mployee rahul=new Mployee();
rahul.setMployee("rahul",128976,99999.0f,"project manager",(byte)20);
System.out.println("empName\tempNo\tsalary\tempDesig\texpYrs\n");
rahul.getMployee();
Mployee rakesh=new Mployee();
rakesh.empName="rakesh patil";
rakesh.empNo=789955;
rakesh.salary=894576.0f;
rakesh.empDesig="project lead";
rakesh.expYrs=(byte)10;
rakesh.getMployee();
}
}