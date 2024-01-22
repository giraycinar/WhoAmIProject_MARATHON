package com.giray.utility.enums;

import com.giray.entity.*;
import com.giray.repository.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Date;

public class CreateRepoImpl {
    private final DikkatCekiciBilgilerRepository dikkatCekiciBilgilerRepository;
    private final IpuclariRepository ipuclariRepository;
    private final KazananRepository kazananRepository;
    private final SorularRepository sorularRepository;
    private final UnluKisiRepository unluKisiRepository;
    private final YarismacilarRepository yarismacilarRepository;
    private final YarismaRepository yarismaRepository;

    public CreateRepoImpl(){
        this.dikkatCekiciBilgilerRepository = new DikkatCekiciBilgilerRepository();
        this.ipuclariRepository = new IpuclariRepository();
        this.kazananRepository = new KazananRepository();
        this.sorularRepository = new SorularRepository();
        this.yarismacilarRepository = new YarismacilarRepository();
        this.yarismaRepository = new YarismaRepository();
        this.unluKisiRepository = new UnluKisiRepository();
    }

    public void createDemoData(){
        createUnluKisi();
        createYarismacilar();
        createDikkatCekiciBilgiler();
        createYarisma();
        createSorular();
        createIpuclari();
        createKazanan();

    }

    private void createUnluKisi(){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRM");
        EntityManager em = emf.createEntityManager();

        UnluKisi unluKisi1=new UnluKisi("Ozzy","Osbourne","0555 999 66 88","England","Ozzy@gmail.com","Ozzy.jpg",180,80,70);
        UnluKisi unluKisi2=new UnluKisi("James","Hetfield","0555 666 88 11","America","James@gmail.com","james.jpg",180,80,55);
        UnluKisi unluKisi3=new UnluKisi("Ronnie James","Dio","0555 333 55 22","America","Ronnie@gmail.com","ronnie.jpg",171,60,70);
        UnluKisi unluKisi4=new UnluKisi("Rob","Halford","0555 333 55 22","England","Rob@gmail.com","rob.jpg",175,75,55);
        UnluKisi unluKisi5=new UnluKisi("Chester","Bennington","0555 333 35 32","America","@Chestergmail.com","chester.jpg",174,63,40);
        UnluKisi unluKisi6=new UnluKisi("Dave","Mustaine","0555 444 56 54","America","@Davegmail.com","dave.jpg",176,80,60);
        UnluKisi unluKisi7=new UnluKisi("Lars","Ulrich","0662 332 98 72","America","@Larsgmail.com","lars.jpg",178,75,50);
        UnluKisi unluKisi8=new UnluKisi("Kirk","Hammett","0658 986 21 62","America","@Kirkgmail.com","kirk.jpg",176,79,56);
        UnluKisi unluKisi9=new UnluKisi("Robert","Trujillo","0325 324 77 29","America","Robert@gmail.com","robert.jpg",177,85,53);
        UnluKisi unluKisi10=new UnluKisi("Axl","Rose","0658 544 66 42","America","Axl@gmail.com","axl.jpg",174,73,59);

        em.getTransaction().begin();
        em.persist(unluKisi1);
        em.persist(unluKisi2);
        em.persist(unluKisi3);
        em.persist(unluKisi4);
        em.persist(unluKisi5);
        em.persist(unluKisi6);
        em.persist(unluKisi7);
        em.persist(unluKisi8);
        em.persist(unluKisi9);
        em.persist(unluKisi10);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    private void createYarismacilar(){


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRM");
        EntityManager em = emf.createEntityManager();


        Yarismacilar yarismacilar1 = new Yarismacilar("Ali","TAS","Ankara","ali@gmail.com",35,10);
        Yarismacilar yarismacilar2 = new Yarismacilar("Salim","MAKAS","Antalya","salim@gmail.com",45,13);
        Yarismacilar yarismacilar3 = new Yarismacilar("Veli","KAGIT","Denizli","veli@gmail.com",56,14);
        Yarismacilar yarismacilar4 = new Yarismacilar("Emrah","Nehir","Erzurum","emrah@gmail.com",61,22);
        Yarismacilar yarismacilar5 = new Yarismacilar("Mert","KOYUN","Izmir","mert@gmail.com",75,9);
        Yarismacilar yarismacilar6 = new Yarismacilar("Anil","DAL","Canakkale","anil@gmail.com",25,34);
        Yarismacilar yarismacilar7 = new Yarismacilar("Samet","GOl","Sinop","samet@gmail.com",49,13);
        Yarismacilar yarismacilar8 = new Yarismacilar("Nehir","KAS","Edirne","nehir@gmail.com",30,16);
        Yarismacilar yarismacilar9 = new Yarismacilar("Buse","KARA","Sivas","buse@gmail.com",33,18);
        Yarismacilar yarismacilar10 = new Yarismacilar("Fatih","AS","Ankara","fatih@gmail.com",72,26);


        em.getTransaction().begin();
        em.persist(yarismacilar1);
        em.persist(yarismacilar2);
        em.persist(yarismacilar3);
        em.persist(yarismacilar4);
        em.persist(yarismacilar5);
        em.persist(yarismacilar6);
        em.persist(yarismacilar7);
        em.persist(yarismacilar8);
        em.persist(yarismacilar9);
        em.persist(yarismacilar10);


        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    private void createDikkatCekiciBilgiler(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRM");
        EntityManager em = emf.createEntityManager();

        DikkatCekiciBilgiler dikkatCekiciBilgiler1 = new DikkatCekiciBilgiler("ElektroGitar","Metallica","Rocker");
        DikkatCekiciBilgiler dikkatCekiciBilgiler2 = new DikkatCekiciBilgiler("Davul","Metallica","Rocker");
        DikkatCekiciBilgiler dikkatCekiciBilgiler3 = new DikkatCekiciBilgiler("BasGitar","BlackSabbath","Rocker");
        DikkatCekiciBilgiler dikkatCekiciBilgiler4 = new DikkatCekiciBilgiler("Gitar","Guns&Roses","Rocker");
        DikkatCekiciBilgiler dikkatCekiciBilgiler5 = new DikkatCekiciBilgiler("Solist","Judas Priest","Rocker");
        DikkatCekiciBilgiler dikkatCekiciBilgiler6 = new DikkatCekiciBilgiler("Solist","LinkinPark","Rocker");
        DikkatCekiciBilgiler dikkatCekiciBilgiler7 = new DikkatCekiciBilgiler("ElektroGitar","Metallica","Rocker");
        DikkatCekiciBilgiler dikkatCekiciBilgiler8 = new DikkatCekiciBilgiler("Bas Gitar","Megadeth","Rocker");
        DikkatCekiciBilgiler dikkatCekiciBilgiler9 = new DikkatCekiciBilgiler("ElektroGitar","BlackSabbath","Rocker");
        DikkatCekiciBilgiler dikkatCekiciBilgiler10 = new DikkatCekiciBilgiler("ElektroGitar","BlackSabbath","Rocker");


        em.getTransaction().begin();
        em.persist(dikkatCekiciBilgiler1);
        em.persist(dikkatCekiciBilgiler2);
        em.persist(dikkatCekiciBilgiler3);
        em.persist(dikkatCekiciBilgiler4);
        em.persist(dikkatCekiciBilgiler5);
        em.persist(dikkatCekiciBilgiler6);
        em.persist(dikkatCekiciBilgiler7);
        em.persist(dikkatCekiciBilgiler8);
        em.persist(dikkatCekiciBilgiler9);
        em.persist(dikkatCekiciBilgiler10);


        em.getTransaction().commit();
        em.close();
        emf.close();


    }

    private void createSorular(){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRM");
        EntityManager em = emf.createEntityManager();

        Sorular sorular1 = new Sorular(5,20);
        Sorular sorular2 = new Sorular(5,20);
        Sorular sorular3 = new Sorular(5,20);
        Sorular sorular4 = new Sorular(5,20);
        Sorular sorular5 = new Sorular(5,20);
        Sorular sorular6 = new Sorular(5,20);
        Sorular sorular7 = new Sorular(5,20);
        Sorular sorular8 = new Sorular(5,20);
        Sorular sorular9 = new Sorular(5,20);
        Sorular sorular10 = new Sorular(5,20);


        em.getTransaction().begin();
        em.persist(sorular1);
        em.persist(sorular2);
        em.persist(sorular3);
        em.persist(sorular4);
        em.persist(sorular5);
        em.persist(sorular6);
        em.persist(sorular7);
        em.persist(sorular8);
        em.persist(sorular9);
        em.persist(sorular10);


        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public void createYarisma(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRM");
        EntityManager em = emf.createEntityManager();

        Yarisma yarisma = new Yarisma(new Date());

        em.getTransaction().begin();
        em.persist(yarisma);



        em.getTransaction().commit();
        em.close();
        emf.close();

    }
    public void createIpuclari(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRM");
        EntityManager em = emf.createEntityManager();

        Ipuclari ipuclari = new Ipuclari();
        em.getTransaction().begin();
        em.persist(ipuclari);



        em.getTransaction().commit();
        em.close();
        emf.close();

    }
    public void createKazanan(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRM");
        EntityManager em = emf.createEntityManager();

        Kazanan kazanan = new Kazanan("Ali","TAS",20,5,"1MDOLAR");

        em.getTransaction().begin();
        em.persist(kazanan);



        em.getTransaction().commit();
        em.close();
        emf.close();
    }




}
