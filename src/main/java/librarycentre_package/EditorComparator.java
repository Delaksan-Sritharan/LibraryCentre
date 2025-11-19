package librarycentre_package;

import java.util.Comparator;

public class EditorComparator implements Comparator<Magazine> {

    @Override
    public int compare(Magazine o1, Magazine o2) {
        return o1.getEditor().compareTo(o2.getEditor());
    }
}
