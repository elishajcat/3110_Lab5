import java.util.ArrayList;

public class Root implements Elements{
    private String tag;
    private ArrayList<TextElement> textElements;
    private ArrayList<SubElement> subElements;

    public Root(String tg, ArrayList<TextElement> txtElem, ArrayList<SubElement> subElem){
        this.tag = tg;
        this.textElements = txtElem;
        this.subElements = subElem;
    }

    public void display(){
        System.out.println("<" + this.tag + ">");
        for(int i = 0; i < textElements.size(); i++) {
            TextElement temp = textElements.get(i);
            temp.display();
        }
        for(int i = 0; i < subElements.size(); i++) {
            SubElement temp = subElements.get(i);
            temp.display();
        }

        System.out.println("</" + this.tag + ">" );
    }

    public static void main(String[] args){
        //create text elements
        TextElement t1 = new TextElement("code", "SYSC3110");
        TextElement t2 = new TextElement("prof", "Babak");

        // add all text elements to an array to be used for the root
        ArrayList<TextElement> textArray = new ArrayList<>();

        textArray.add(t1);
        textArray.add(t2);

        // create an array of text elements to be used for the creation of sub elements
        ArrayList<TextElement> elemArray = new ArrayList<>();

        elemArray.add(new TextElement("student", "Michael"));
        elemArray.add(new TextElement("student", "Alan"));

        SubElement s1 = new SubElement("class", elemArray);

        // add all sub elements to an array
        ArrayList<SubElement> subElemArray = new ArrayList<>();
        subElemArray.add(s1);

        Root root = new Root("course", textArray, subElemArray);

        root.display();
    }
}
