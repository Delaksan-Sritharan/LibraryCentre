package librarycentre_package;

import java.util.Comparator;

public class TitleComparator implements Comparator<Magazine>{

    @Override
    public int compare(Magazine o1, Magazine o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
