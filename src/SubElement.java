import java.util.ArrayList;

public class SubElement implements Elements {
    private String tag;
    private ArrayList<TextElement> subElems;

    public SubElement(String tg, ArrayList<TextElement> sub){
        this.tag = tg;
        this.subElems = sub;
    }

    public void display(){
        System.out.println("    <" + this.tag + ">");
        for(int i = 0; i < subElems.size(); i++) {
            System.out.print("      ");
            TextElement temp = subElems.get(i);
            temp.display();
        }
        System.out.println("    </" + this.tag + ">");
    }
}
