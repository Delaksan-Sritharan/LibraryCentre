package librarycentre_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Magazine> magazinesList = new ArrayList<>();

        Magazine magazine_1 = new Magazine("B","0002");
        magazine_1.setEditor("Delaksan");
        magazine_1.setPublicationFrequency(PublicationFrequency.MONTHLY);
        magazine_1.setIssueNumber(456);

        Magazine magazine_2 = new Magazine("A","0003");
        magazine_2.setEditor("Abiinayan");
        magazine_2.setPublicationFrequency(PublicationFrequency.MONTHLY);
        magazine_2.setIssueNumber(798);

        Magazine magazine_3 = new Magazine("C","0001");
        magazine_3.setEditor("Sivasiman");
        magazine_3.setPublicationFrequency(PublicationFrequency.MONTHLY);
        magazine_3.setIssueNumber(213);

        magazinesList.add(magazine_1);
        magazinesList.add(magazine_2);
        magazinesList.add(magazine_3);

        System.out.println(magazinesList);

        Collections.sort(magazinesList); //comparable interface will be used to sort.
        //using the comparable interface we have compared using the isbn number.

        //After sorting using isbn.
        System.out.println(magazinesList);

        //title Sort
        Collections.sort(magazinesList,new TitleComparator());

        System.out.println(magazinesList);

        //Editor sort
        Collections.sort(magazinesList, new EditorComparator());
        System.out.println(magazinesList);

        //IssueNumber sort
        Collections.sort(magazinesList,new IssueNumberComparator());
        System.out.println(magazinesList);



    }
}
