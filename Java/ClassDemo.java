
class Box
{
    int length;
     int breath;
    int height;
    Box(int length,int breath,int height)
    {
        this.length=length;
        this.breath=breath;
        this.height=height;

    }
    void setDim(int l,int b,int h)
    {
        length=l;
        breath=b;
        height=h;
    }
    void protected  finalize()
    {

    }
}
public class ClassDemo
{public static void main(String[] args)

{
    Box blackBox;
    Box WhiteBox;

    blackBox = new Box(5,4,3);
    blackBox.setDim(5,4,3);
    WhiteBox.setDim(7,8,9);
    blackBox=null; // Dereference
    WhiteBox = blackBox; //Dereference 


    System.out.println("volume of the balckBox");
-


}
}
