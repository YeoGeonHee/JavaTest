package chapter09;

public class ObjectEx {
	public static void main(String[] args) {

        allObject(new GraphicCard());

    }

    public static void allObject(Object obj) {

       // System.out.println(obj.toString());
        if(obj instanceof GraphicCard) {

            GraphicCard gc = (GraphicCard)obj;
            gc.process();
        }else {
        	System.out.println("그래픽 카드가 아니에요.");
        }
    }

}