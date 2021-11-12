public class TextElement implements Elements {
    private String tag;
    private String text;

    public TextElement(String tg, String txt){
        this.tag = tg;
        this.text = txt;
    }

    public void display(){
        System.out.println("    <" + this.tag + ">" + this.text + "</" + this.tag + ">" );
    }
}
