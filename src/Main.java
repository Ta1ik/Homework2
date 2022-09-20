public class Main {
    public static void main(String[] args) {
            System.out.println("задача 1");
        var dog = 8.0; //задание переменной dog
        System.out.println(dog);
       var cat = 3.6; //задание переменной cat
        System.out.println(cat);
        var paper = 763789.0; //задание переменной paper
        System.out.println(paper);
        System.out.println(" ");
            System.out.println("задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4; //действие сложения с переменными
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");
            System.out.println("задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639; //действие вычитания с переменными
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");
            System.out.println("задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend); //математические действия с переменной friend
        System.out.println(" ");
            System.out.println("задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog); //математические действия с переменной frog
        System.out.println(" ");
            System.out.println("задача 6");
        var boxerNumberOne = 78.2;
        var boxerNumberTwo = 82.7;
        var boxerWeight = boxerNumberOne + boxerNumberTwo;
        System.out.println("общий вес боксеров " + boxerWeight + " кг");
        var boxerWeightDifference = boxerNumberTwo - boxerNumberOne;
        System.out.println("разница между весом боксеров " + boxerWeightDifference + " кг"); //Операции с рассчетом веса боксеров
        System.out.println(" ");
            System.out.println("задача 7");
        var boxerWeightDifference1 = boxerNumberTwo - boxerNumberOne;
        System.out.println("разница между весом боксеров путем вычитания " + boxerWeightDifference1 + " кг");
        var boxerWeightDifference2 = boxerNumberTwo % boxerNumberOne;
        System.out.println("разница между весом боксеров функцией остаток от деления " + boxerWeightDifference2 + " кг");
        System.out.println(" ");
            System.out.println("задача 8");
        var allHourTime = 640; //всего рабочих часов
        var workTime = 8; //продолжительность рабочего дня сотрудика
        var amountWorker = allHourTime / workTime;
        System.out.println("количество сотрудников " + amountWorker + (" человек"));
        System.out.println(" ");
        var moreWorker = amountWorker + 94; //увеличение числа сотрудиков на 94 человека
        var allHourTimeMoreWorker = moreWorker * workTime; //общее количество рабочих часов при увеличении числа сотрудников
        System.out.println("Если в компании работает " + moreWorker + (" человек, то всего ") +allHourTimeMoreWorker+ (" часов работы может быть поделено между сотрудниками"));


    }
}