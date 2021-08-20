package chapter09;

public class ObjectEx {
	public static void main(String[] args) {

        allObject(new GraphicCard());
        allObject(new Amd());
        allObject(new Nvidia());
        allObject("안녕");

    }

    public static void allObject(Object obj) {

        System.out.println(obj.toString());
        if(obj instanceof GraphicCard) {

            GraphicCard gc = (GraphicCard)obj;
            gc.process();
        }
    }

}