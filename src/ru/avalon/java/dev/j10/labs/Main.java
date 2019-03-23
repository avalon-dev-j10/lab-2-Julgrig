package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[10];
        figures[0] = new Circle();
        figures[1] = new Rectangle();
        figures[2] = new Triangle();
        figures[3] = new Circle();
        figures[4] = new Rectangle();
        figures[5] = new Triangle();
        figures[6] = new Circle();
        figures[7] = new Rectangle();
        figures[8] = new Triangle();
        figures[9] = new Triangle();


        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */


        Figure maxArea = null;
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i] + " Площадь фигуры = "  + figures[i].getArea());

            if (maxArea != null) {
                if (figures[i].getArea() > maxArea.getArea()) {
                    maxArea = figures[i];
                }
            } else {
                maxArea = figures[i];
            }
        }

        System.out.println("--------------");
        System.out.println("Фигура с большей площадью " + maxArea + " Площадь: " + maxArea.getArea());
    }

}

