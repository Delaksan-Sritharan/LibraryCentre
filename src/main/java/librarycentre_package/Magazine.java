package librarycentre_package;

import java.util.Objects;

public class Magazine extends Item {
    private int issueNumber;
    private PublicationFrequency publicationFrequency;
    private String editor;

    public Magazine(String title, String isbn){
        super(title,isbn);
    }

    public int getIssueNumber(){
        return this.issueNumber;
    }

    public void setIssueNumber(int issueNumber){
        if(issueNumber>0){
            this.issueNumber = issueNumber;
        }else {
            throw new IllegalArgumentException("Issue number cannot be 0 or less");
        }
    }

    public PublicationFrequency getPublicationFrequency() {
        return publicationFrequency;
    }

    public void setPublicationFrequency(PublicationFrequency publicationFrequency) {
        this.publicationFrequency = publicationFrequency;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString(){
        return "\nISBN No: "+super.getISBN()+"\nTitle: "+super.getTitle()+
                "\nIssue Number: "+ issueNumber +
                "\nPublication Frequency: " + publicationFrequency +
                "\nEditor: " + editor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return issueNumber == magazine.issueNumber && publicationFrequency == magazine.publicationFrequency && Objects.equals(editor, magazine.editor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueNumber, publicationFrequency, editor);
    }

    @Override
    public int compareTo(Magazine o) {
        return this.getISBN().compareTo(o.getISBN());
    }
}
