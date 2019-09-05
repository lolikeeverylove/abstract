package com.company;

//ctrl + alt + o неиспользуемые импорты
//alt+insert getter setter

public class Main {
    public static void main(String[] args) {
        Parents parents=new Parents();
        Abstracktivniy_Animals r;
        //ссылка такая экономит память особенно с абстракт классами
        r = parents;
        r.doing();
        r = parents;
        r.doing();
        // обяз оверайдить т.к. 
        Abstracktivniy_Animals aa = new Abstracktivniy_Animals() {
            @Override
            void doing() {
            }
        };
    }
}
