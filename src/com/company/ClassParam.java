package com.company;

class Goblin {
    public int money;
}

class ClassParam {

    public void tryChangeParameterValue(Goblin goblin, int[] arr1) {

        // Эти изменения будут видны снаружи метода.
        goblin.money++;
        arr1[0] = 200;

        // Эти изменения затрагивают только наш параметр ссылочного типа
        // Объекты снаружи метода не будут изменены.
        goblin = null;
        arr1 = null;
        goblin = new Goblin();
        goblin.money = -400;
        arr1 = new int[100];
        arr1[2] = 3;
    }

    public void test1() {
        Goblin goblin = new Goblin();
        goblin.money = 45;
        int[] arr1 = {3, 4, 7};
        tryChangeParameterValue(goblin, arr1);
        System.out.println(goblin.money); // 46
        System.out.println(arr1[0]); // 200;
        System.out.println(arr1[2]); // 7
    }


    public static void main(String[] args) {
        ClassParam main = new ClassParam();
        main.test1();
    }
}
