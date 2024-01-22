package com.giray.repository;

import com.giray.entity.Yarisma;

public class YarismaRepository extends RepositoryManager<Yarisma,Long>{
    public YarismaRepository() {
        super(new Yarisma());
    }
}
