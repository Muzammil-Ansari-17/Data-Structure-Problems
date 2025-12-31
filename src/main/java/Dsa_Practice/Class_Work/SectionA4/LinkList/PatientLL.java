/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.LinkList;

/**
 *
 * @author HAROON TRADERS
 */
public class PatientLL {
    
    class PatientNode{
    
        int tokenNo;
        String name;
        String dob;
        String cont;
        PatientNode next;
        
        public PatientNode(int tokenNo, String name, String dob, String cont) {
            this.tokenNo = tokenNo;
            this.name = name;
            this.dob = dob;
            this.cont = cont;
            this.next = null;
        } 
        
    }// end of patient class
    
    PatientNode first=null;
    PatientNode last=null;
    int count=0;
    public void addPatient(int num, String name, String dob, String con){
          count++;
          PatientNode pn = new PatientNode(num, name, dob, con);
          if(first==null){
              first = last = pn;
          }else{
          
              last.next = pn;
              last = pn;
          }
    }
    
    public void printPatientList(){
    
        int c=0;
        PatientNode current = first;
        while(current!=null){
            System.out.println("********** Node No."+(++c)+" ***********");
            System.out.println("Token No."+current.tokenNo);
            System.out.println("Name:   "+current.name);
            System.out.println("Date of Birth   "+current.dob);
            System.out.println("Contact:    "+current.cont);
            current = current.next;
        }
        System.out.println("");
    }
    public void addPatientAt( int num, String name, String dob, String con, int position){
        
        int count = 1;
        var pn = first;
        var newNode = new PatientNode(num, name, dob, con);
        
        while(pn.next != null && count < position - 1){
            pn = pn.next;
            count++;
        }
        
        newNode.next = pn.next;
        pn.next = newNode;
        
    } // end of addPatientAt
    
    
    
    }

