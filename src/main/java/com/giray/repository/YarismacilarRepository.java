package com.giray.repository;


import com.giray.entity.Yarismacilar;

public class YarismacilarRepository extends RepositoryManager<Yarismacilar,Long>{

    public YarismacilarRepository() {
        super(new Yarismacilar());
    }
}
