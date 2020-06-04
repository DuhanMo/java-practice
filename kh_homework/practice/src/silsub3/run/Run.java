package silsub3.run;

import silsub3.model.vo.Circle;


public class Run {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        Circle.setRadius(5);
        System.out.println("원의 둘레 : " + (Circle.PI * 2 * Circle.getRadius()));
        System.out.println("원의 넓이 : " + (Circle.PI * Circle.getRadius() * Circle.getRadius()));

        c1.incrementRadius();
        System.out.println("원의 둘레 : " + (Circle.PI * 2 * Circle.getRadius()));
        System.out.println("원의 넓이 : " + (Circle.PI * Circle.getRadius() * Circle.getRadius()));

    }

}
