package librarycentre_package;

import java.util.Comparator;

public class IssueNumberComparator implements Comparator<Magazine>{

    @Override
    public int compare(Magazine o1, Magazine o2) {
        return o1.getIssueNumber() - o2.getIssueNumber();
    }
}
