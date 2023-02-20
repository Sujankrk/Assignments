import profession.doctor.GeneralPhysician;
import profession.doctor.HeartSurgeon;
import profession.lawyer.Bankruptcy;
import profession.lawyer.Immigration;
import profession.engineer.Civil;
import profession.engineer.Mechanical;
import profession.teacher.History;
import profession.teacher.Maths;



public class ProfessionTest {
    public static void main(String[] args) {
        GeneralPhysician generalPhysician = new GeneralPhysician();
        generalPhysician.noSurgery();
        generalPhysician.prescription();
        System.out.println(".............................");


        HeartSurgeon heartSurgeon = new HeartSurgeon();
        heartSurgeon.heartSurgery();
        heartSurgeon.medicalAdvice();
        System.out.println(".............................");


        Mechanical mechanical = new Mechanical();
        mechanical.hydroPowerPlants();
        mechanical.mathsKnowledge();
        System.out.println(".................................");

        Civil civil = new Civil();
        civil.design();
        civil.supervise();
        System.out.println(".................................");


        History history = new History();
        history.connectStudentToHistory();
        history.knowHistoryDates();
        System.out.println(".....................................");

        Maths maths = new Maths();
        maths.equations();
        maths.formulas();
        maths.addition();
        System.out.println("....................................");


        Immigration immigration = new Immigration();
        immigration.courtHearings();
        immigration.filePetitions();
        System.out.println("...................................");

        Bankruptcy bankruptcy = new Bankruptcy();
        bankruptcy.fileBankruptcy();
        bankruptcy.arrangeLegalDocuments();

    }
}
