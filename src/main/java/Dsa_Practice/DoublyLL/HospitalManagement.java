package Dsa_Practice.DoublyLL;

//Muzammil Ahmed
    class patient {
        int p_id;
        String p_name;
        String adm_date;
        String ty_illness;
        int severity;
        patient next;

        public patient(int p_id, String p_name, String adm_date, String ty_illness, int severity) {
            this.p_id = p_id;
            this.p_name = p_name;
            this.adm_date = adm_date;
            this.ty_illness = ty_illness;
            this.severity = severity;
            this.next = null;
        }
    }
        class patientlist {
            patient head ;


            public void addsevernity(patient newpatient){
                if(head == null || newpatient.severity > head.severity){
                    newpatient.next = head;
                    head = newpatient;
                }else{
                    patient current = head;
                    while(current.next != null && current.next.severity >= newpatient.severity){
                        current = current.next;
                    }
                    newpatient.next = current.next;
                    current.next = newpatient;
                }
            }

            public void display(){
                patient current = head;
                while(current != null){
                    System.out.println("-------------------------");
                    System.out.println("_____Patient Detail______");
                    System.out.println("-------------------------");
                    System.out.println("Id : " +current.p_id);
                    System.out.println("Patient name : "+current.p_name);
                    System.out.println("Admission data : "+current.adm_date);
                    System.out.println("Illness : "+current.ty_illness);
                    System.out.println("Severity level : "+current.severity);
                    current = current.next;
                }

            }

         }
public class HospitalManagement {

    public static void main(String[] args) {
        patientlist patient = new patientlist();
        patient.addsevernity(new patient(1,"Muzammil","17-11-2024","fever",1));
        patient.addsevernity(new patient(2,"ali","18-10-2024","brain tumor",4));
        patient.addsevernity(new patient(3,"john","18-09-2024","cancer",5));
        patient.addsevernity(new patient(4,"ahmed","14-08-2024","dengue",4));
        patient.addsevernity(new patient(5,"jack","12-07-2024","flu",2));
        patient.display();

    }
}
