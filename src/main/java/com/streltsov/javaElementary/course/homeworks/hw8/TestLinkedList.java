package com.streltsov.javaElementary.course.homeworks.hw8;

public class TestLinkedList {

    public static void main(String[] args) {

        DynamicList<Marvel> listAvengers = new CustomLinkedList<>();
        DynamicList<DCComics> listJusticeLeague = new CustomLinkedList<>();
        DynamicList<Marvel> listSpiderVerse = new DynamicArray<>();

        Marvel marvel1 = new Marvel("Spider-man");
        Marvel marvel2 = new Marvel("Ironman");
        Marvel marvel3 = new Marvel("Cap");
        Marvel marvel4 = new Marvel("Tor");
        Marvel marvel5 = new Marvel("Hulk");

        DCComics dcHero1 = new DCComics("Batman");
        DCComics dcHero2 = new DCComics("Flash");
        DCComics dcHero3 = new DCComics("Aquaman");
        DCComics dcHero4 = new DCComics("Superman");
        DCComics dcHero5 = new DCComics("Wonderwoman");

        Marvel spiderHero1 = new Marvel("Peter Parker");
        Marvel spiderHero2 = new Marvel("Miles Morales");
        Marvel spiderHero3 = new Marvel("Spider-Man Noir");
        Marvel spiderHero4 = new Marvel("Spider-Ham");

        listAvengers.add(marvel1);  // add
        listAvengers.add(marvel2);
        listAvengers.add(marvel2);
        listAvengers.add(marvel3);
        listAvengers.add(marvel4);
        listAvengers.add(marvel5);
        listAvengers.add(marvel2);

        listJusticeLeague.add(dcHero1);
        listJusticeLeague.add(dcHero2);
        listJusticeLeague.add(dcHero3);
        listJusticeLeague.add(dcHero3);
        listJusticeLeague.add(dcHero4);
        listJusticeLeague.add(dcHero5);

        listSpiderVerse.add(spiderHero1);
        listSpiderVerse.add(spiderHero2);
        listSpiderVerse.add(spiderHero3);
        listSpiderVerse.add(spiderHero4);

        listAvengers.add(null);

        Object removeFirstHero = listAvengers.removeFirst(marvel1); // removeFirst

        Object removeHero = listJusticeLeague.remove(3); // remove

        Object replaceHero = listAvengers.replace(0, marvel4); // replace

        Object getHero = listJusticeLeague.get(2); // get

        listAvengers.addAll(listSpiderVerse); // addAll

        listAvengers.removeFirst(null);

        DynamicList<Marvel> partList = listAvengers.sublist(2); // sublist from

        DynamicList<Marvel> fromToList = listAvengers.sublist(3, 4); // sublist from to

        listAvengers.removeAll();
    }
}
