package com.giray;

import com.giray.entity.Kazanan;
import com.giray.repository.KazananRepository;
import com.giray.utility.enums.CreateRepoImpl;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class Runner {
    public static void main(String[] args) {


        new CreateRepoImpl().createDemoData();

/**
 *
 * DrawSQL Sayfa Linki;
 *
 * https://drawsql.app/teams/xx-22/diagrams/who-am-i
 *
 *
 */


        List<Kazanan> kazananList = new KazananRepository().findAll();

        System.out.println(kazananList.get(0).getOdul());

        kazananList.forEach(k-> {
            System.out.println(k.getId());
        });

        kazananList.forEach(t-> {
            System.out.println(t.getAd());
        });

        kazananList.forEach(l-> {
            System.out.println(l.getSoyad());
        });




    }
}
