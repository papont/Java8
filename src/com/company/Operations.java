package com.company;

public class Operations {

    public static void main(String[] args) {
        // Присваивание
        int x = 3;
        long l1 = 10_000_000_000L;
        float f1 = 1.3f;
        double w = 81.34;
        byte b = 12;
//        short sh1 = 100;

        // КОНСТАНТНЫЕ значения (литералы) до int можно приводить к переменным меньшего размера
        // если значение помещается в переменную short(16bit) -> byte(8bit)

        double d1 = 2;
//        int i1 = 2.3; //нельзя

//нельзя
//        int n = 100;
//        byte b3 = n;

//        Преобразование примитивных типов
//        Есть два типа преобразования примитивных типов:
//        расширяющее преобразование (Widening Primitive Conversion)
//        сужающее преобразование (Narrowing Primitive Conversion)


//        Расширяющее преобразование примитивов
//        Следующие преобразования называются расширяющими преобразованиями примитивов:

//        byte  -> short, int, long, float, double
//        short  -> int, long, float, double
//        char  -> int, long, float, double
//        int  -> long, float, double
//        long  -> float, double
//        float  -> double

//        Расширяющее преобразование не приводит к потере информации в следующих случаях:
//             1. из целого типа в другой целый тип
//             2. из byte, short, char  в тип с плавающей точкой
//             3. из int  в double
//             4. из float  в double  в выражении с strictfp (это такой особый режим вычислений с плавающей точкой, возможно, распишу позже).

//  Расширяющее преобразование из float  в double  в обычном режиме (без strictfp ) может привести к потере точности.
//  Расширяющее преобразование  int  во float  или из long  во float, или из long  в double  может привести к потере точности,
// то есть результат может потерять несколько наименее значимых бит информации, что приведёт к получению округлённого значения.
        byte b1 = 100;
        short sh1 = b1; //byte -> short

        char ch1 = 100;
        System.out.println(ch1);

        int i1 = sh1; //short -> int
        int i2 = ch1;    // Расширяющее преобразование char->int
        long l11 = i1;    // Расширяющее преобразование int->long
        float f11 = l11;   // Расширяющее преобразование long->float
        double d11 = f11;  // Расширяющее преобразование float->double

//      Несмотря на возможность потери точности расширяющее преобразование примитивов
//      никогда не приводит к ошибкам во время выполнения.!!!!!



//        Сужающее преобразование примитивов
//        Следующие преобразования называются сужающими преобразованиями примитивов:
//        short  -> byte, char
//        char  -> byte , short
//        int  -> byte , short , char
//        long  -> byte , short , char , int
//        float  -> byte , short , char , int , long
//        double  -> byte , short , char , int , long , float
//        Сужающее преобразование примитивов может привести к потере точности и даже к получению совсем другого числа из-за выхода за границу размерности.

//        Несмотря на возможность потери точности и даже получения совсем другого числа сужающее преобразование никогда не приводит к ошибке во время выполнения.
//       При сужающем преобразовании нужно явно приводить к нужному типу, указав его в скобках, иначе возникнет ошибка компиляции:

        double dd1 = 2.3;
        double dPositiveInfinity = Double.POSITIVE_INFINITY;
        double dNegativeInfinity = Double.NEGATIVE_INFINITY;
        double dPlusZero = +0.0;
        double dMinusZero = -0.0;
        double dNaN = Double.NaN;

        float fPositiveInfinity = (float) dPositiveInfinity; // +Infinity сужающее преобразование
        float fNegativeInfinity = (float) dNegativeInfinity; // -Infinity сужающее преобразование
        float fPlusZero = (float) dPlusZero; //0.0f сужающее преобразование
        float fMinusZero = (float) dMinusZero; //-0.0f сужающее преобразование
        float fNaN = (float) dNaN; // NaN сужающее преобразование
        float ff1 = (float) dd1;             // сужающее преобразование
        int n = (int) dd1; // 2             // сужающее преобразование. Дробная часть отбрасывается

        System.out.println(fPositiveInfinity);
        System.out.println(fNegativeInfinity);
        System.out.println(fPlusZero);
        System.out.println(fMinusZero);
        System.out.println(fNaN);
        System.out.println(ff1);
        System.out.println(n);

        //Если результат операции с целочисленными данными выходит за диапазон, то старшие биты отбрасываются,
        // и результирующее значение будет совершенно неверным. При попытке деления на 0
        // возникает исключение java.lang.ArithmeticException / zero.

//  При выполнении операций с плавающей точкой при выходе за верхнюю или нижнюю границу диапазона
// получается +Infinity  ( Double.POSITIVE_INFINITY  и Float.POSITIVE_INFINITY) и
// -Infinity  ( Double.NEGATIVE_INFINITY  и Float.NEGATIVE_INFINITY ) соответственно,
// а при получении слишком маленького числа, которое не может быть нормально сохранено в этом типе данных получается -0.0 или +0.0.

//  При выполнении операций с плавающей точкой результат NaN  ( Double.NaN  и Float.NaN) получается в следующих случаях:
//        Когда один из операндов NaN
//        В неопределённых результатах:
//              Деления 0/0, ?/?, ?/??, ??/?,  ??/??
//              Умножения 0?? and 0???
//              Степень 1^?
//              сложения ? + (??), (??) + ? и эквивалентные вычитания.
//        Операции с комплексными результатами:
//              Квадратный корень из отрицательного числа
//              Логарифм отрицательного числа
//              Тангенс 90 градусов и ему подобных (или ?/2 радиан)
//              Обратный синус и косинус от числа меньше ?1 и больше +1.

//        Унарные операции
//        Унарными называются операции, которые имеют только один операнд.
//        Унарные операции бывают префиксные ++i и постфиксные i++
    int i =0, j = 0;
    System.out.println("i++ :=> " + i++); // i -> sout; i = i + 1;
    System.out.println("++j :=> " + ++j); // j = j + 1; j -> sout;





    }
}
