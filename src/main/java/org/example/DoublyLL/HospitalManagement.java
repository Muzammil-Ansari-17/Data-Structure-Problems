package org.example.DoublyLL;



public class HospitalManagement {
    class patient{
        int p_id;
        String p_name;
        String adm_date;
        String ty_illness;
        int severity;
        patient next;

        public patient(int p_id,String p_name , String adm_date,String ty_illness,int severity){
            this.p_id = p_id;
            this.p_name = p_name;
            this.adm_date = adm_date;
            this.ty_illness = ty_illness;
            this.severity = severity;
            this.next = null;
        }
        class patientlist{
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

        }
    }
}
