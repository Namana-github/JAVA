class Bank{                    
    int getInterestRate(){
    return 0;}}
class Baroda extends Bank{
    int getInterestRate(){
        return 15;}}
class SBI extends Bank{       
    int getInterestRate(){     
        return 6;}}
class HDFC extends Bank{
    int getInterestRate(){
        return 22;}}
public class TestBank{
    public static void main(String[] args){
        Baroda bank1=new Baroda();   
        SBI bank2 = new SBI();
        HDFC bank3 = new HDFC();
        System.out.println("Bank1: " + bank1.getInterestRate() + " %");
        System.out.println("Bank2: " + bank2.getInterestRate() + " %");
        System.out.println("Bank3: " + bank3.getInterestRate() + " %");}}
    