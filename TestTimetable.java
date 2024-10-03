class TimeTable{
  int year;
  String[]day={"Mon","Tue","Wed","Thu","Fri","Sat"};
  int[]period={1,2,3,4,5,6,7};
  String[] batch={"4MW24CS","4MW23CS","4MW22CS","4MW21CS"};
  String[]subject={"OOPJ","OS","DS","Maths"};
  String[]faculty={"Kuthyar Sir","Chitra Madam","Savitha Madam","Sahana Madam"};
  boolean isLab;
  String section;
  TimeTable(int y1, String s1){
    this.year=y1;
    this.section=s1;}
  public void printTimeTable(){
    String heading=year+"-"+batch[year-1];
    System.out.println("TimeTable of Year"+heading+ " Section " +section);}}
  
public class TestTimetable{
  public static void main(String[]args){
    TimeTable tt2A=new TimeTable(2,"A");
   TimeTable tt2B=new TimeTable(2,"B");
 TimeTable tt2C=new TimeTable(2,"C");
 
    tt2A.printTimeTable();
    tt2B.printTimeTable();
 tt2C.printTimeTable();
    }}
  