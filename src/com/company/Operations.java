package com.company;

public class Operations {

    public static void main(String[] args) {
        // ������������
        int x = 3;
        long l1 = 10_000_000_000L;
        float f1 = 1.3f;
        double w = 81.34;
        byte b = 12;
//        short sh1 = 100;

        // ����������� �������� (��������) �� int ����� ��������� � ���������� �������� �������
        // ���� �������� ���������� � ���������� short(16bit) -> byte(8bit)

        double d1 = 2;
//        int i1 = 2.3; //������

//������
//        int n = 100;
//        byte b3 = n;

//        �������������� ����������� �����
//        ���� ��� ���� �������������� ����������� �����:
//        ����������� �������������� (Widening Primitive Conversion)
//        �������� �������������� (Narrowing Primitive Conversion)


//        ����������� �������������� ����������
//        ��������� �������������� ���������� ������������ ���������������� ����������:

//        byte  -> short, int, long, float, double
//        short  -> int, long, float, double
//        char  -> int, long, float, double
//        int  -> long, float, double
//        long  -> float, double
//        float  -> double

//        ����������� �������������� �� �������� � ������ ���������� � ��������� �������:
//             1. �� ������ ���� � ������ ����� ���
//             2. �� byte, short, char  � ��� � ��������� ������
//             3. �� int  � double
//             4. �� float  � double  � ��������� � strictfp (��� ����� ������ ����� ���������� � ��������� ������, ��������, ������� �����).

//  ����������� �������������� �� float  � double  � ������� ������ (��� strictfp ) ����� �������� � ������ ��������.
//  ����������� ��������������  int  �� float  ��� �� long  �� float, ��� �� long  � double  ����� �������� � ������ ��������,
// �� ���� ��������� ����� �������� ��������� �������� �������� ��� ����������, ��� ������� � ��������� ����������� ��������.
        byte b1 = 100;
        short sh1 = b1; //byte -> short

        char ch1 = 100;
        System.out.println(ch1);

        int i1 = sh1; //short -> int
        int i2 = ch1;    // ����������� �������������� char->int
        long l11 = i1;    // ����������� �������������� int->long
        float f11 = l11;   // ����������� �������������� long->float
        double d11 = f11;  // ����������� �������������� float->double

//      �������� �� ����������� ������ �������� ����������� �������������� ����������
//      ������� �� �������� � ������� �� ����� ����������.!!!!!



//        �������� �������������� ����������
//        ��������� �������������� ���������� ��������� ���������������� ����������:
//        short  -> byte, char
//        char  -> byte , short
//        int  -> byte , short , char
//        long  -> byte , short , char , int
//        float  -> byte , short , char , int , long
//        double  -> byte , short , char , int , long , float
//        �������� �������������� ���������� ����� �������� � ������ �������� � ���� � ��������� ������ ������� ����� ��-�� ������ �� ������� �����������.

//        �������� �� ����������� ������ �������� � ���� ��������� ������ ������� ����� �������� �������������� ������� �� �������� � ������ �� ����� ����������.
//       ��� �������� �������������� ����� ���� ��������� � ������� ����, ������ ��� � �������, ����� ��������� ������ ����������:

        double dd1 = 2.3;
        double dPositiveInfinity = Double.POSITIVE_INFINITY;
        double dNegativeInfinity = Double.NEGATIVE_INFINITY;
        double dPlusZero = +0.0;
        double dMinusZero = -0.0;
        double dNaN = Double.NaN;

        float fPositiveInfinity = (float) dPositiveInfinity; // +Infinity �������� ��������������
        float fNegativeInfinity = (float) dNegativeInfinity; // -Infinity �������� ��������������
        float fPlusZero = (float) dPlusZero; //0.0f �������� ��������������
        float fMinusZero = (float) dMinusZero; //-0.0f �������� ��������������
        float fNaN = (float) dNaN; // NaN �������� ��������������
        float ff1 = (float) dd1;             // �������� ��������������
        int n = (int) dd1; // 2             // �������� ��������������. ������� ����� �������������

        System.out.println(fPositiveInfinity);
        System.out.println(fNegativeInfinity);
        System.out.println(fPlusZero);
        System.out.println(fMinusZero);
        System.out.println(fNaN);
        System.out.println(ff1);
        System.out.println(n);

        //���� ��������� �������� � �������������� ������� ������� �� ��������, �� ������� ���� �������������,
        // � �������������� �������� ����� ���������� ��������. ��� ������� ������� �� 0
        // ��������� ���������� java.lang.ArithmeticException / zero.

//  ��� ���������� �������� � ��������� ������ ��� ������ �� ������� ��� ������ ������� ���������
// ���������� +Infinity  ( Double.POSITIVE_INFINITY  � Float.POSITIVE_INFINITY) �
// -Infinity  ( Double.NEGATIVE_INFINITY  � Float.NEGATIVE_INFINITY ) ��������������,
// � ��� ��������� ������� ���������� �����, ������� �� ����� ���� ��������� ��������� � ���� ���� ������ ���������� -0.0 ��� +0.0.

//  ��� ���������� �������� � ��������� ������ ��������� NaN  ( Double.NaN  � Float.NaN) ���������� � ��������� �������:
//        ����� ���� �� ��������� NaN
//        � ������������� �����������:
//              ������� 0/0, ?/?, ?/??, ??/?,  ??/??
//              ��������� 0?? and 0???
//              ������� 1^?
//              �������� ? + (??), (??) + ? � ������������� ���������.
//        �������� � ������������ ������������:
//              ���������� ������ �� �������������� �����
//              �������� �������������� �����
//              ������� 90 �������� � ��� �������� (��� ?/2 ������)
//              �������� ����� � ������� �� ����� ������ ?1 � ������ +1.

//        ������� ��������
//        �������� ���������� ��������, ������� ����� ������ ���� �������.
//        ������� �������� ������ ���������� ++i � ����������� i++
    int i =0, j = 0;
    System.out.println("i++ :=> " + i++); // i -> sout; i = i + 1;
    System.out.println("++j :=> " + ++j); // j = j + 1; j -> sout;





    }
}
